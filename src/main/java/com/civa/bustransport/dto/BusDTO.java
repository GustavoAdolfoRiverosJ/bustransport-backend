package com.civa.bustransport.dto;

import com.civa.bustransport.model.BusBrand;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusDTO {

    @NotNull
    private Integer idBus;

    @NotNull
    private Integer numberBus;

    @NotNull
    private String plateBus;

    @NotNull
    private LocalDateTime createBus;

    @NotNull
    private String featureBus;

    @NotNull
    private BusBrand brandBus;
}

