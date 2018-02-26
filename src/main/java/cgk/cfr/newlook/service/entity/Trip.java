package cgk.cfr.newlook.service.entity;

import javax.persistence.*;

/**
 * Created by iuliab on 20.02.2018.
 */
@Entity
public class Trip {

    @Id
    @Column(name = "trip_id", nullable = false)
    private String tripId;

    @ManyToOne
    @JoinColumn(name = "ROUTE_ID", referencedColumnName="ROUTE_ID")
    private Route route;

    @ManyToOne
    @JoinColumn(name = "SERVICE_ID", referencedColumnName="SERVICE_ID")
    private TripCalendar calendar;

    @Column(name = "trip_short_name")
    private String shortName;


    public String getTripId() {
        return tripId;
    }

    public Route getRoute() {
        return route;
    }

    public TripCalendar getCalendar() {
        return calendar;
    }

    public String getShortName() {
        return shortName;
    }
}
