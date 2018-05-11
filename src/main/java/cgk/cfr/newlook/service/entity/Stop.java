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


    public static class StopBuilder
    {
        private Stop stop;

        private StopBuilder()
        {
            stop = new Stop();
        }

        public StopBuilder withId(Long id)
        {
            stop.stopId = id;
            return this;
        }

        public StopBuilder withName(String name)
        {
            stop.stopName = name;
            return this;
        }

        public StopBuilder withStopLat(Double stopLat)
        {
            stop.stopLat = stopLat;
            return this;
        }

        public StopBuilder withStopLon(Double stopLon)
        {
            stop.stopLon = stopLon;
            return this;
        }

        public static StopBuilder stop()
        {
            return new StopBuilder();
        }

        public Stop build()
        {
            return stop;
        }
    }
}
