package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Owner;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.OwnerRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.OwnerService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class OwnerServiceImpl implements OwnerService, Serializable {

    @Inject
    private OwnerRepository ownerRepository;

    public OwnerServiceImpl() {}

    @Override
    public List<Owner> getAll() {
        return ownerRepository.findAll();
    }
}
