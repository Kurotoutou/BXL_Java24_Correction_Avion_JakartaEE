package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Pilot;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PilotRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.PilotService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PilotServiceImpl implements PilotService, Serializable {

    @Inject
    private PilotRepository pilotRepository;

    public PilotServiceImpl() {}

    @Override
    public List<Pilot> getAll() {
        return pilotRepository.findAll();
    }
}
