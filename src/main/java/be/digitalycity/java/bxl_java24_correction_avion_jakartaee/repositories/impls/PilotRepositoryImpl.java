package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Pilot;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PilotRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PilotRepositoryImpl extends BaseRepositoryImpl<Pilot, Long> implements PilotRepository, Serializable {

    public PilotRepositoryImpl () {
        super(Pilot.class);
    }
}
