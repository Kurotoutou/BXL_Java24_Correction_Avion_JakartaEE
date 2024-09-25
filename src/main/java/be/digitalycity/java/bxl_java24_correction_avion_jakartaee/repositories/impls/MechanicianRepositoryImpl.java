package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Mechanician;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.BaseRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.MechanicianRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class MechanicianRepositoryImpl extends BaseRepositoryImpl<Mechanician, Long> implements MechanicianRepository, Serializable {

    public MechanicianRepositoryImpl() {
        super(Mechanician.class);
    }
}
