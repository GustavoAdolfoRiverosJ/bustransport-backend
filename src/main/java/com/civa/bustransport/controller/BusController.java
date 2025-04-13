package com.civa.bustransport.controller;

import com.civa.bustransport.dto.BusDTO;
import com.civa.bustransport.model.Bus;
import com.civa.bustransport.service.IBusService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
@RequiredArgsConstructor
public class BusController {

    private final IBusService busService;

    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<BusDTO>> findAll() throws Exception{
        List<BusDTO> list = busService.findAll().stream().map(this::convertToDTO).toList();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusDTO> findById(@PathVariable("id") Integer id)  throws Exception{
        Bus Bus = busService.findById(id);
        return ResponseEntity.ok(convertToDTO(Bus));
    }

    private BusDTO convertToDTO(Bus obj){
        return modelMapper.map(obj, BusDTO.class);
    }
    private Bus convertToEntity(BusDTO dto){
        return modelMapper.map(dto, Bus.class);
    }
}
