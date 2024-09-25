package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.utils;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.*;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.OwnerRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PilotRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PlaneRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PlaneTypeRepository;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls.OwnerRepositoryImpl;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls.PilotRepositoryImpl;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls.PlaneRepositoryImpl;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls.PlaneTypeRepositoryImpl;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DataInitializer implements ServletContextListener {

    private final PlaneRepository planeRepository;
    private final PlaneTypeRepository planeTypeRepository;
    private final PilotRepository pilotRepository;
    private final OwnerRepository ownerRepository;

    public DataInitializer() {
        this.planeRepository = new PlaneRepositoryImpl();
        this.planeTypeRepository = new PlaneTypeRepositoryImpl();
        this.pilotRepository = new PilotRepositoryImpl();
        this.ownerRepository = new OwnerRepositoryImpl();
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        Address adresse1 = new Address(
                "Rue de la limite",
                "Bruxelles",
                "Belgique"
        );
        Address adresse2 = new Address(
                "Chaussée de vleurgat",
                "Bruxelles",
                "Belgique"
        );
        Address adresse3 = new Address(
                "Place saint-josse",
                "Bruxelles",
                "Belgique"
        );



        PlaneType planeType1 = new PlaneType(
                "OOCNA",
                "Boeing",
                1000,
                5
        );
        PlaneType planeType2 = new PlaneType(
                "PTG",
                "Boeing",
                500,
                2
        );
        PlaneType planeType3 = new PlaneType(
                "trolilol",
                "Boeing",
                15000,
                200
        );

        planeTypeRepository.save(planeType1);
        planeTypeRepository.save(planeType2);
        planeTypeRepository.save(planeType3);

        Owner owner1 = new Owner(
                "James",
                "Franco",
                "0477852369",
                adresse1
        );
        Owner owner2 = new Owner(
                "Bradd",
                "Pitt",
                "0479586749",
                adresse2
        );
        Owner owner3 = new Owner(
                "Tony",
                "Hawk",
                "04785794863",
                adresse3
        );

        ownerRepository.save(owner1);
        ownerRepository.save(owner2);
        ownerRepository.save(owner3);

        Plane plane1 = new Plane(
                "123456",
                25,
                planeType1,
                owner1
        );Plane plane2 = new Plane(
                "654321",
                60,
                planeType2,
                owner2
        );Plane plane3 = new Plane(
                "456789",
                5,
                planeType3,
                owner3
        );

        planeRepository.save(plane1);
        planeRepository.save(plane2);
        planeRepository.save(plane3);





        Pilot pilot1 = new Pilot(
                "James",
                "Webb",
                "0478584868",
                adresse1,
                "123456"
        );
        Pilot pilot2 = new Pilot(
                "Edwin",
                "Hubble",
                "0477555666",
                adresse2,
                "654321"
        );
        Pilot pilot3 = new Pilot(
                "Albert",
                "Einstein",
                "0479876543",
                adresse3,
                "987654"
        );

        pilotRepository.save(pilot1);
        pilotRepository.save(pilot2);
        pilotRepository.save(pilot3);



    }
}
