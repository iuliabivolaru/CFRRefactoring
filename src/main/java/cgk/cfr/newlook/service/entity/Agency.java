package cgk.cfr.newlook.service.entity;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by iuliab on 19.02.2018.
 */
@Entity
public class Agency {

    @Id
    @Column(name = "agency_id")
    private String agencyId;

    @Column(name = "agency_name")
    private String name;

    @Column(name = "agency_url")
    private String url;

    @Column(name = "agency_timezone")
    private String timezone;

    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Route> routes = new HashSet<>();

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agency agency = (Agency) o;

        return agencyId != null ? agencyId.equals(agency.agencyId) : agency.agencyId == null;
    }

}
