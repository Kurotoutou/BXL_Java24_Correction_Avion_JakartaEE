package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryProvider {

    private static EntityManagerFactory emf;
    private static final String PERSISTENCE_UNIT_NAME = "DemoJakartaAirport";

    public static synchronized EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            emf= Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf;
    }

    public static synchronized void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
