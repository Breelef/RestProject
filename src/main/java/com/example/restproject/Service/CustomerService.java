package com.example.restproject.Service;

import com.example.restproject.Model.Customer;
import com.example.restproject.Repository.CustomerRepoInterface;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerService implements CustomerServiceInterface {
    private CustomerRepoInterface repo;

    public CustomerService(CustomerRepoInterface repo) {
        this.repo = repo;
    }

    @Override
    public Set<Customer> findAll(){
        Set<Customer> set = new HashSet<>();
        repo.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Customer save(Customer object) {
        return repo.save(object);
    }

    @Override
    public void delete(Customer object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Customer> findById(Long aLong) {
        return repo.findById(aLong);
    }
    public void updateCustomer(Customer customer){
        repo.save(customer);
    }
}
