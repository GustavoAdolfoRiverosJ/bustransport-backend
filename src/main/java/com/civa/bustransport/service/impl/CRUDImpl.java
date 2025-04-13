package com.civa.bustransport.service.impl;

import com.civa.bustransport.exception.ModelNotFoundException;
import com.civa.bustransport.repository.IGenericRepo;
import com.civa.bustransport.service.ICRUD;

import java.lang.reflect.Method;
import java.util.List;

public abstract class CRUDImpl<T, ID>  implements ICRUD<T, ID> {

    protected abstract IGenericRepo<T, ID> getRepo();


    @Override
    public List<T> findAll() throws Exception {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) throws Exception {
        //MODIFICAR EL NULL
        return getRepo().findById(id).orElseThrow(() -> new ModelNotFoundException("ID NOT FOUND:" + id));
    }

}