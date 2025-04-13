package com.civa.bustransport.service;

import java.util.List;

public interface ICRUD<T, ID> {

    List<T> findAll() throws Exception;
    T findById(ID id) throws Exception;
}
