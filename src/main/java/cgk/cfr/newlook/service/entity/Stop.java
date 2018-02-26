package cgk.cfr.newlook.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by iuliab on 20.02.2018.
 */
@Entity
public class Stop {

    @Id
    @Column(name = "stop_id", nullable = false)
    private Long stopId;

    @Column(name = "stop_name", nullable = false)
    private String stopName;

    @Column(name = "stop_lat", nullable = false)
    private Double stopLat;

    @Column(name = "stop_lon", nullable = false)
    private Double stopLon;

    public long getStopId() {
        return stopId;
    }

    public String getStopName() {
        return stopName;
    }

    public Double getStopLat() {
        return stopLat;
    }

    public Double getStopLon() {
        return stopLon;
    }
}
