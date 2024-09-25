package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Maintenance;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.BaseRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.MaintenanceRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class MaintenanceRepositoryImpl extends  BaseRepositoryImpl<Maintenance, Long> implements MaintenanceRepository, Serializable {

    public MaintenanceRepositoryImpl(){
        super(Maintenance.class);
    }
}
