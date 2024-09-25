package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Maintenance;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.MaintenanceRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.MaintenanceService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class MaintenanceServiceImpl implements MaintenanceService, Serializable {

    @Inject
    private MaintenanceRepository maintenanceRepository;

    public MaintenanceServiceImpl() {}

    @Override
    public List<Maintenance> getAll() {
        return maintenanceRepository.findAll();
    }
}
