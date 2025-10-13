package com.pauloapp.viajes.service;

import com.pauloapp.viajes.model.Viaje;
import java.util.List;

public interface ViajeService {
    List<Viaje> getAll();
    Viaje save(Viaje viaje); // Sirve para POST y PUT
    Viaje actualziarPrecio(Viaje viaje);
    Viaje eliminarViaje(Long id);
}
