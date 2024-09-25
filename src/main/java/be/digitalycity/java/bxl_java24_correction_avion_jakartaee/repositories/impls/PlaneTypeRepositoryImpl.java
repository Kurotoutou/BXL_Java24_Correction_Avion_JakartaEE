package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.PlaneType;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.BaseRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PlaneTypeRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PlaneTypeRepositoryImpl extends BaseRepositoryImpl<PlaneType, Long> implements PlaneTypeRepository, Serializable {

    public PlaneTypeRepositoryImpl() {
        super(PlaneType.class);
    }
}
