package cgk.cfr.newlook.service.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

/**
 * Created by iuliab on 13.02.2018.
 */
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "route_sequence")
    @SequenceGenerator(name = "route_sequence", sequenceName = "ROUTE_SEQUENCE", allocationSize = 1)
    @Column(name = "ROUTE_ID")
    private Integer id;

    @Column(name = "DEPARTURE_LOCALITY")
    private String departureLocality;

    @Column(name = "ARRIVAL_LOCALITY")
    private String arrivalLocality;

    @Column(name = "DEPARTURE_TIME")
    private LocalDateTime departureTime;

    @Column(name = "ARRIVAL_TIME")
    private LocalDateTime arrivalTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartureLocality() {
        return departureLocality;
    }

    public void setDepartureLocality(String departureLocality) {
        this.departureLocality = departureLocality;
    }

    public String getArrivalLocality() {
        return arrivalLocality;
    }

    public void setArrivalLocality(String arrivalLocality) {
        this.arrivalLocality = arrivalLocality;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
