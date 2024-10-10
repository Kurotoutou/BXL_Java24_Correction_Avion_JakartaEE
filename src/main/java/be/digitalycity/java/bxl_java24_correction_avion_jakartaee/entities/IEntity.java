package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities;

import java.io.Serializable;

public interface IEntity<TKey extends Serializable> {
    TKey getId();
}
