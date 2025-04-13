package com.civa.bustransport.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idBus;

    @Column(nullable = false)
    private Integer numberBus;

    @Column(nullable = false)
    private String plateBus;

    @Column(nullable = false)
    private LocalDateTime createBus;

    @Column(nullable = false, length = 50)
    private String featureBus;

    @ManyToOne
    @JoinColumn(name = "id_brand", nullable = false, foreignKey = @ForeignKey(name = "FK_BUS_BRAND"))
    private BusBrand brandBus;

    @Column(nullable = false)
    private boolean enabled;

}
