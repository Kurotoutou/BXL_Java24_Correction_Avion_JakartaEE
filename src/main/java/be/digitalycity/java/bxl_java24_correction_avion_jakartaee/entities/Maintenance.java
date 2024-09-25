package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Maintenance extends BaseEntity<Long> {

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDateTime actualDate;

    @Column
    @Range(min = 0)
    private int duration;

    @ManyToOne(fetch = FetchType.EAGER)
    private Plane plane;

    @ManyToOne(fetch = FetchType.EAGER)
    private Mechanician repairer;

    @ManyToOne(fetch = FetchType.EAGER)
    private Mechanician inspector;

    //region CONSTRUCTOR

    public Maintenance() {}

    public Maintenance(String description, LocalDateTime actualDate, int duration) {
        this();
        this.description = description;
        this.actualDate = actualDate;
        this.duration = duration;
    }

    public Maintenance(String description, LocalDateTime dateIntervention, int duration, Plane plane, Mechanician repairer, Mechanician inspector) {
        this(description, dateIntervention, duration);
        this.plane = plane;
        this.repairer = repairer;
        this.inspector = inspector;
    }

    //endregion

    //region GET/SET

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getActualDate() {
        return actualDate;
    }

    public void setActualDate(LocalDateTime dateIntervention) {
        this.actualDate = dateIntervention;
    }

    public @Range(min = 0) int getDuration() {
        return duration;
    }

    public void setDuration(@Range(min = 0) int duration) {
        this.duration = duration;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Mechanician getRepairer() {
        return repairer;
    }

    public void setRepairer(Mechanician repairer) {
        this.repairer = repairer;
    }

    public Mechanician getInspector() {
        return inspector;
    }

    public void setInspector(Mechanician inspector) {
        this.inspector = inspector;
    }


    //endregion

    //region EQUALS/HASH_CODE

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Maintenance that = (Maintenance) o;
        return Objects.equals(description, that.description) && Objects.equals(actualDate, that.actualDate) && Objects.equals(duration, that.duration) && Objects.equals(plane, that.plane) && Objects.equals(repairer, that.repairer) && Objects.equals(inspector, that.inspector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), description, actualDate, duration, plane, repairer, inspector);
    }


    //endregion

    //region TO_STRING

    @Override
    public String toString() {
        return super.toString() + " " +
                "Maintenance{" +
                "description='" + description + '\'' +
                ", dateIntervention=" + actualDate +
                ", duration=" + duration +
                ", plane=" + plane +
                ", repairer=" + repairer +
                ", inspector=" + inspector +
                '}';
    }

    //endregion

}
