package Domingo_Reto3.Reto3.repositorios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Domingo_Reto3.Reto3.interfaces.InterfaceBoat;
import Domingo_Reto3.Reto3.modelos.Boat;

@Repository
public class RepositorioBoat {
    
    @Autowired
    private InterfaceBoat crud;

    public List<Boat> getAll(){
        return (List<Boat>) crud.findAll();
    }

    public Optional<Boat> getBoat(int id){
        return crud.findById(id);
    }

    public Boat save(Boat boat){
        return crud.save(boat);
    }
    public void delete(Boat boat){
        crud.delete(boat);
    }
    
}
