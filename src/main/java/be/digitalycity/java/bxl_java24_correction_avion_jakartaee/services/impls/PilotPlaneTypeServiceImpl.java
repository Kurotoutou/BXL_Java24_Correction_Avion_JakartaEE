package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.PilotPlaneType;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PilotPlaneTypeRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.PilotPlanTypeService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PilotPlaneTypeServiceImpl implements PilotPlanTypeService, Serializable {

    @Inject
    private PilotPlaneTypeRepository pilotPlaneTypeRepository;

    public PilotPlaneTypeServiceImpl() {}

    @Override
    public List<PilotPlaneType> getAll() {
        return pilotPlaneTypeRepository.findAll();
    }
}
