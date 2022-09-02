package com.example.restproject.Controller;

import com.example.restproject.Model.Customer;
import com.example.restproject.Service.CustomerService;
import com.example.restproject.Service.CustomerServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController // Giver JSON og ikke en webside
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/getAllCustomers")
    public ResponseEntity<Set<Customer>> getAllCustomers(){
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);

    }
    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        customerService.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping("/findUserById")
    public ResponseEntity<Optional<Customer>> findbyId(Long id){
        return new ResponseEntity<>(customerService.findById(id), HttpStatus.OK);
    }


    @PutMapping("/updateCustomer")
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
        return new ResponseEntity<>("Customer updated to DB", HttpStatus.OK);
    }

    /*@PostMapping("/updateCustomer")
    public ResponseEntity<String> updateById(Customer update){
        Optional<Customer> customer = customerService.findById(update.getId());
        if(customer.isPresent()){
            Customer newCustomer = customer.get();
            customer.get().setName(update.getName());
            customer.get().setAge(update.getAge());
            customerService.save(newCustomer);
            return new ResponseEntity<>("Customer updated to DB", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Customer not updated to DB", HttpStatus.OK);
        }*/






    /*@PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCustomer(Customer customer){
        System.out.println("addCustomer er kaldt med " + customer.getName());
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);*/
}
