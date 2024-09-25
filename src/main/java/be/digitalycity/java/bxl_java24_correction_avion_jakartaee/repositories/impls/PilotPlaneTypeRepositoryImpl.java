package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.PilotPlaneType;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PilotPlaneTypeRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PilotPlaneTypeRepositoryImpl extends BaseRepositoryImpl<PilotPlaneType, Long> implements PilotPlaneTypeRepository, Serializable {

    public PilotPlaneTypeRepositoryImpl() {
        super(PilotPlaneType.class);
    }
}
