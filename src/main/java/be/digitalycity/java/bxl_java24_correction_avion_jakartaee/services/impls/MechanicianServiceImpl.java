package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Mechanician;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.MechanicianRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.MechanicianService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class MechanicianServiceImpl implements MechanicianService, Serializable {

    @Inject
    private MechanicianRepository mechanicianRepository;

    public MechanicianServiceImpl() {}

    @Override
    public List<Mechanician> getAll() {
        return mechanicianRepository.findAll();
    }
}
