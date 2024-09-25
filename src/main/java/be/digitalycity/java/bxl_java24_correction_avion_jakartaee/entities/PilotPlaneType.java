package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.time.LocalTime;
import java.util.Objects;

@Entity
public class PilotPlaneType {

    @EmbeddedId
    private PilotePlaneTypeId id;

    @Column(nullable = false)
    private LocalTime flightHours;

    @Column(nullable = false)
    @Range(min = 0)
    private int flyCount;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("piloteId")
    private Pilot pilot;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("planeTypeId")
    private PlaneType planeType;

    @Embeddable
    public static class PilotePlaneTypeId {
        private Long piloteId;
        private Long planeTypeId;
    }

    //region CONSTRUCTOR

    public PilotPlaneType() {}

    public PilotPlaneType(LocalTime flightHours, int flyCount, Pilot pilot, PlaneType planeType) {
        this.flightHours = flightHours;
        this.flyCount = flyCount;
        this.pilot = pilot;
        this.planeType = planeType;
    }


    //endregion

    //region GET/SET

    public PilotePlaneTypeId getId() {
        return id;
    }

    @Range(min = 0)
    public int getFlyCount() {
        return flyCount;
    }

    public void setFlyCount(@Range(min = 0) int flyCount) {
        this.flyCount = flyCount;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public LocalTime getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(LocalTime flightHours) {
        this.flightHours = flightHours;
    }

    //endregion

    //region EQUALS/HASH_CODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PilotPlaneType that = (PilotPlaneType) o;
        return flyCount == that.flyCount && Objects.equals(id, that.id) && Objects.equals(flightHours, that.flightHours) && Objects.equals(pilot, that.pilot) && Objects.equals(planeType, that.planeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flightHours, flyCount, pilot, planeType);
    }


    //endregion

    //region TO_STRING

    @Override
    public String toString() {
        return "PilotPlaneType{" +
                "id=" + id +
                ", flightHours=" + flightHours +
                ", flyCount=" + flyCount +
                ", pilot=" + pilot +
                ", planeType=" + planeType +
                '}';
    }


    //endregion
}
