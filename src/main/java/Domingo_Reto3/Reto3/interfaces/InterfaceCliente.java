package Domingo_Reto3.Reto3.interfaces;

import org.springframework.data.repository.CrudRepository;

import Domingo_Reto3.Reto3.modelos.Cliente;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
    
}
