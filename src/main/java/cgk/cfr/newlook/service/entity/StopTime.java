package cgk.cfr.newlook.service.entity;

import javax.persistence.*;
import java.time.LocalTime;

/**
 * Created by iuliab on 20.02.2018.
 */
@Entity
public class StopTime {

    @Id
    @Column(name = "stop_id", nullable = false)
    private Long id;

    @Column(name = "arrival_time", nullable = false)
    private String arrivalTime;

    @Column(name = "departure_time", nullable = false)
    private String departureTime;

    @ManyToOne
    @JoinColumn(name="TRIP_ID", referencedColumnName="TRIP_ID")
    private Trip trip;

    @ManyToOne
    @JoinColumn(name = "STOP_ID", referencedColumnName="STOP_ID")
    private Stop stop;

    @Column(name = "stop_sequence")
    private Integer stopSequence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Stop getStop() {
        return stop;
    }

    public void setStop(Stop stop) {
        this.stop = stop;
    }

    public Integer getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(Integer stopSequence) {
        this.stopSequence = stopSequence;
    }
}
