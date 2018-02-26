package cgk.cfr.newlook.service.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

/**
 * Created by iuliab on 13.02.2018.
 */
@Entity
public class Route {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ROUTE_ID")
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="AGENCY_ID", referencedColumnName="AGENCY_ID")
    private Agency agency;

    @Column(name = "route_short_name")
    private String shortName;

    @Column(name = "route_long_name")
    private String longName;

    @Column(name = "route_type")
    private RouteType type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public RouteType getType() {
        return type;
    }

    public void setType(RouteType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        return id != null ? id.equals(route.id) : route.id == null;
    }

    public static class RouteBuilder
    {
        private Route route;

        private RouteBuilder()
        {
            route = new Route();
        }

        public RouteBuilder withId(Integer id)
        {
            route.id = id;
            return this;
        }

        public RouteBuilder withAgency(Agency agency)
        {
            route.agency = agency;
            return this;
        }

        public RouteBuilder withShortName(String shortName)
        {
            route.shortName = shortName;
            return this;
        }

        public RouteBuilder withLongName(String longName)
        {
            route.longName = longName;
            return this;
        }

        public RouteBuilder withRouteType(RouteType routeType)
        {
            route.type = routeType;
            return this;
        }

        public static RouteBuilder route()
        {
            return new RouteBuilder();
        }

        public Route build()
        {
            return route;
        }
    }
}
