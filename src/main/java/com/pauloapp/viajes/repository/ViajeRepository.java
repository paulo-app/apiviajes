package com.pauloapp.viajes.repository;

import com.pauloapp.viajes.model.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViajeRepository extends JpaRepository<Viaje, Long> {
        
}
