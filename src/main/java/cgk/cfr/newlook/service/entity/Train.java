package cgk.cfr.newlook.service.entity;

import javax.persistence.*;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

/**
 * Created by iuliab on 12.02.2018.
 */
@Entity
@XmlRootElement
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "train_sequence")
    @SequenceGenerator(name = "train_sequence", sequenceName = "TRAIN_SEQUENCE", allocationSize = 1)
    @Column(name = "TRAIN_ID")
    private Integer id;

    @Column(name = "TRAIN_TYPE")
    private String trainType;

    @Column(name = "SERVICES")
    private Set<String> services;

    @Column(name = "TICKET_PRICE")
    private Double ticketPrice;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "TRAIN_ROUTE",
            joinColumns = @JoinColumn(name = "TRAIN_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROUTE_ID"))
    private Set<Route> routes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public Set<String> getServices() {
        return services;
    }

    public void setServices(Set<String> services) {
        this.services = services;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
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

        Train train = (Train) o;

        return id.equals(train.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
