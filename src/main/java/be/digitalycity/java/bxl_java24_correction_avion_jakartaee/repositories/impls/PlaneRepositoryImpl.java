package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Plane;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.PlaneRepository;
import jakarta.enterprise.context.SessionScoped;
import jakarta.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PlaneRepositoryImpl extends BaseRepositoryImpl<Plane, Long> implements PlaneRepository, Serializable {

    public PlaneRepositoryImpl() {
        super(Plane.class);
    }

//    @Override
//    public List<Plane> findAll() {
//        try (EntityManager em = emf.createEntityManager()){
//            return em.createQuery("select e from Plane p join p.planeType
//        }
//    }
}
