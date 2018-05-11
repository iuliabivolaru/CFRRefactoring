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


    public static final class TripBuilder {
        private String tripId;
        private Route route;
        private TripCalendar calendar;
        private String shortName;

        private TripBuilder() {
        }

        public static TripBuilder aTrip() {
            return new TripBuilder();
        }

        public TripBuilder withTripId(String tripId) {
            this.tripId = tripId;
            return this;
        }

        public TripBuilder withRoute(Route route) {
            this.route = route;
            return this;
        }

        public TripBuilder withCalendar(TripCalendar calendar) {
            this.calendar = calendar;
            return this;
        }

        public TripBuilder withShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }

        public Trip build() {
            Trip trip = new Trip();
            trip.tripId = this.tripId;
            trip.shortName = this.shortName;
            trip.route = this.route;
            trip.calendar = this.calendar;
            return trip;
        }
    }
}
