package Domingo_Reto3.Reto3.interfaces;

import org.springframework.data.repository.CrudRepository;

import Domingo_Reto3.Reto3.modelos.Boat;

public interface InterfaceBoat extends CrudRepository<Boat,Integer> {
    
}
