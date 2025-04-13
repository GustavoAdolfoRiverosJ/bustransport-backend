package com.civa.bustransport.service.impl;

import com.civa.bustransport.model.Bus;
import com.civa.bustransport.repository.IBusRepo;
import com.civa.bustransport.repository.IGenericRepo;
import com.civa.bustransport.service.IBusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusServiceImpl extends CRUDImpl<Bus, Integer> implements IBusService {

    private final IBusRepo BusRepo;

    @Override
    protected IGenericRepo<Bus, Integer> getRepo() {
        return BusRepo;
    }
}
