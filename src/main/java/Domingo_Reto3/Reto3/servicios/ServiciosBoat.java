package Domingo_Reto3.Reto3.servicios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Domingo_Reto3.Reto3.modelos.Boat;
import Domingo_Reto3.Reto3.repositorios.RepositorioBoat;

@Service
public class ServiciosBoat {
     @Autowired
    private RepositorioBoat metodosCrud;

    public List<Boat> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Boat> getBoat(int boatId) {
        return metodosCrud.getBoat(boatId);
    }

    public Boat save(Boat boat){
        if(boat.getId()==null){
            return metodosCrud.save(boat);
        }else{
            Optional<Boat> e=metodosCrud.getBoat(boat.getId());
            if(e.isEmpty()){
                return metodosCrud.save(boat);
            }else{
                return boat;
            }
        }
    }

    public Boat update(Boat boat){
        if(boat.getId()!=null){
            Optional<Boat> e=metodosCrud.getBoat(boat.getId());
            if(!e.isEmpty()){
                if(boat.getBrand()!=null){
                    e.get().setBrand(boat.getBrand());
                }
                if(boat.getYear()!=null){
                    e.get().setYear(boat.getYear());
                }
                if(boat.getDescription()!=null){
                    e.get().setDescription(boat.getDescription());
                }
                if(boat.getName()!=null){
                    e.get().setName(boat.getName());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return boat;
            }
        }else{
            return boat;
        }
    }


    public boolean deleteBoat(int boatId) {
        Boolean aBoolean = getBoat(boatId).map(boat -> {
            metodosCrud.delete(boat);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
