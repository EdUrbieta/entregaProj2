package org.acme.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.acme.model.Pet;
import org.acme.service.PetService;

import java.util.ArrayList;
import java.util.List;

@Path("/api/pet")
public class PetCont {

    @Inject
    PetService petService;

    @GET
    public List<Pet> retrievePet(){
        List<Pet> pets = new ArrayList<>();
        try {
            pets = petService.findAllPets();
        } catch (Exception e){
            e.printStackTrace();
        }
        return pets;
    }

    @POST
    @Transactional
    public void addPets(Pet pet) {petService.addPet(pet);}
}
