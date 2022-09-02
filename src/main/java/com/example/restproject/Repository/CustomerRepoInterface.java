package com.example.restproject.Repository;
import com.example.restproject.Model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepoInterface extends CrudRepository<Customer, Long> {
}
