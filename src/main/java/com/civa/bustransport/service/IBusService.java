package com.civa.bustransport.service;

import com.civa.bustransport.model.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBusService extends ICRUD<Bus, Integer>{

    Page<Bus> findAllPaged(Pageable pageable);
}
