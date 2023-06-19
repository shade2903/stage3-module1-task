package com.mjc.school.repository;

import java.util.List;

public interface Repository <T> {
    T create(T entity);
    List<T> readAll();
    T getById(Long id);
    T update(T entity);
    Boolean delete(Long id);
}
