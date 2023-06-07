package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Pet;

@ApplicationScoped
public class PetRepo implements PanacheRepository<Pet> {
}
