package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.PlaneType;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PlaneTypeRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.PlaneTypeService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PlaneTypeServiceImpl implements PlaneTypeService, Serializable {

    @Inject
    private PlaneTypeRepository planeTypeRepository;

    public PlaneTypeServiceImpl() {}

    @Override
    public List<PlaneType> getAll() {
        return planeTypeRepository.findAll();
    }
}
