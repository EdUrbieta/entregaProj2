package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.model.Pet;
import org.acme.repository.PetRepo;

import java.util.List;

@ApplicationScoped
public class PetService {

    @Inject
    PetRepo petRepo;

    public List<Pet> findAllPets(){
        return petRepo.findAll().list();
    }

    public void addPet(Pet pet){
        petRepo.persist(pet);
    }
}
