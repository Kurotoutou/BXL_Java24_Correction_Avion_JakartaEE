package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.impls;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Owner;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.repositories.OwnerRepository;

import java.io.Serializable;

public class OwnerRepositoryImpl extends BaseRepositoryImpl<Owner, Long> implements OwnerRepository, Serializable {

    public OwnerRepositoryImpl() {
        super(Owner.class);
    }
}
