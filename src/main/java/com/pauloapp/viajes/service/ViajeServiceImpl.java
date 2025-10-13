package com.pauloapp.viajes.service;

import com.pauloapp.viajes.model.Viaje;
import com.pauloapp.viajes.repository.ViajeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ViajeServiceImpl implements ViajeService {
    
    private final ViajeRepository viajeRepository;

    public ViajeServiceImpl(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Viaje> getAll() {
        return this.viajeRepository.findAll();
    }

    @Override
    @Transactional
    public Viaje save(Viaje viaje) {
        return this.viajeRepository.save(viaje);
    }

    @Override
    public Viaje actualziarPrecio(Viaje viajeReq) {
        Optional<Viaje> o = this.viajeRepository.findById(viajeReq.getId());
        if (o.isPresent()) {
            Viaje viajeDb = o.get();
            viajeDb.setPrecioUsd(viajeReq.getPrecioUsd());
            this.viajeRepository.save(viajeDb);
            return viajeDb;
        }
        return null;
    }

    @Override
    public Viaje eliminarViaje(Long id) {
        Optional<Viaje> o = this.viajeRepository.findById(id);
        if (o.isPresent()) {
            Viaje viajeEliminado = o.get();
            this.viajeRepository.delete(viajeEliminado);
            return viajeEliminado;
        }
        return null;        
    }
    
}
