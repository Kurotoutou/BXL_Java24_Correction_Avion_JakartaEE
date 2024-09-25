package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.util.Objects;

@Entity
public class Plane extends BaseEntity<Long> {

    @Column(unique = true, nullable = false, length = 50)
    private String plateNumber;

    @Column(nullable = false)
    @Range(min = 0)
    private int flyCount;

    @ManyToOne(fetch = FetchType.LAZY)
    private Owner owner;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private PlaneType planeType;

    //region CONSTRUCTOR

    public Plane() {}

    public Plane(String plateNumber, int flyCount) {
        this();
        this.plateNumber = plateNumber;
        this.flyCount = flyCount;
    }

    public Plane(String plateNumber, int flyCount, PlaneType planeType, Owner owner) {
        this(plateNumber, flyCount);
        this.planeType = planeType;
        this.owner = owner;
    }

    //endregion

    //region GET/SET

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Range(min = 0)
    public int getFlyCount() {
        return flyCount;
    }

    public void setFlyCount(@Range(min = 0) int flyCount) {
        this.flyCount = flyCount;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    //endregion

    //region EQUALS/HASH_CODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plane plane = (Plane) o;
        return flyCount == plane.flyCount && Objects.equals(plateNumber, plane.plateNumber) && Objects.equals(planeType, plane.planeType) && Objects.equals(owner, plane.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plateNumber, flyCount, planeType, owner);
    }


    //endregion

    //region TO_STRING

    @Override
    public String toString() {
        return super.toString() + " " +
                "Plane{" +
                "plateNumber='" + plateNumber + '\'' +
                ", flyCount=" + flyCount +
                ", planeType=" + planeType +
                ", owner=" + owner +
                '}';
    }


    //endregion


}
