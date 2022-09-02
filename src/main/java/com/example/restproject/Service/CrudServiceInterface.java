package com.example.restproject.Service;

import java.util.*;

public interface CrudServiceInterface<T,ID> {

    Set<T> findAll();
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
    Optional<T> findById(ID id);

}
