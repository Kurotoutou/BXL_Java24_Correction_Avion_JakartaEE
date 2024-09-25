package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Plane;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PlaneRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.PlaneService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PlaneServiceImpl implements PlaneService, Serializable {

    @Inject
    private PlaneRepository planeRepository;

    public PlaneServiceImpl() {
    }

    @Override
    public List<Plane> getAll() {
        return planeRepository.findAll();
    }
}
