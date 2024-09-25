package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Mechanician extends Person {

    @ManyToMany
    private Set<PlaneType> habilitations;

    public void addHabilitation(PlaneType planeType){
        this.habilitations.add(planeType);
    }

    public void removeHabilitation(PlaneType planeType) {
        this.habilitations.remove(planeType);
    }

    //region CONSTRUCTOR

    public Mechanician() {
        this.habilitations = new HashSet<>();
    }

    public Mechanician(String firstName, String lastName, String phoneNumber, Address address) {
        super(firstName, lastName, phoneNumber, address);
        this.habilitations = new HashSet<>();
    }


    //endregion

    //region TO_STRING

    @Override
    public String toString() {
        return super.toString() +" " +
                "Mechanician{" +
                "habilitations=" + habilitations +
                '}';
    }


//endregion
}
