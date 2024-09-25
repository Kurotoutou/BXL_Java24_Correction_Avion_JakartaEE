package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities;

import jakarta.persistence.Entity;

@Entity
public class Owner extends Person {

    //region CONSTRUCTOR

    public Owner() {}

    public Owner(String firstName, String lastName, String phoneNumber, Address address) {
        super(firstName, lastName, phoneNumber, address);
    }


    //endregion

    //region TO_STRING

    @Override
    public String toString() {
        return super.toString() + " " +
                "Owner{}";
    }


//endregion
}
