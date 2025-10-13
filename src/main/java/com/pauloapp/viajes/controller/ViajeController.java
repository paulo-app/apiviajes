package com.pauloapp.viajes.controller;

import com.pauloapp.viajes.model.Viaje;
import com.pauloapp.viajes.service.ViajeService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ViajeController {

    private final ViajeService viajeService;

    public ViajeController(ViajeService viajeService) {
        this.viajeService = viajeService;
    }

    @GetMapping("/viajes")
    public List<Viaje> obtenerViajes() {
        return this.viajeService.getAll();
    }

    @PostMapping("/viaje")
    public ResponseEntity<Viaje> crearViaje(@RequestBody Viaje viaje) {
        Viaje viajeCreado = this.viajeService.save(viaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(viajeCreado);
    }
    
    @PutMapping("/viaje")
    public ResponseEntity<Viaje> actualizarViaje(@RequestBody Viaje viaje) {
        //Por ahora es lo mismo que 'crearViaje()'
        Viaje viajeActualizado = this.viajeService.save(viaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(viajeActualizado);
    }
    
    @PatchMapping("/viaje")
    public ResponseEntity<Viaje> actualizarPrecio(@RequestBody Viaje viaje) {
        Viaje viajeActualizado = this.viajeService.actualziarPrecio(viaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(viajeActualizado);
    }
    
    @DeleteMapping("/viaje")
    public ResponseEntity<Viaje> eliminarViaje(@RequestParam Long id) {
        Viaje viajeEliminado = this.viajeService.eliminarViaje(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(viajeEliminado);
    }
    
}
