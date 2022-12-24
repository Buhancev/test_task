package com.bbuhha.test_task.service;


import com.bbuhha.test_task.model.Computer;

public interface Service<T> {
    public T saveOrUpdate(T t);

    public T deleteById(Long id);

    public T findById(Long id);

    public Iterable<T> findAll();
}
