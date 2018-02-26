package cgk.cfr.newlook.service.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by iuliab on 20.02.2018.
 */
@Entity(name = "calendar")
public class TripCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "calendar_sequence")
    @SequenceGenerator(name = "calendar_sequence", sequenceName = "CALENDAR_SEQUENCE", allocationSize = 1)
    @Column(name = "SERVICE_ID")
    private Integer serviceId;

    @Column(name = "monday")
    private boolean monday;

    @Column(name = "tuesday")
    private boolean tuesday;

    @Column(name = "wednesday")
    private boolean wednesday;

    @Column(name = "thursday")
    private boolean thursday;

    @Column(name = "friday")
    private boolean friday;

    @Column(name = "saturday")
    private boolean saturday;

    @Column(name = "sunday")
    private boolean sunday;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    public Integer getServiceId() {
        return serviceId;
    }

    public boolean isAvailableOnMonday() {
        return monday;
    }

    public boolean isAvailableOnTuesday() {
        return tuesday;
    }

    public boolean isAvailableOnWednesday() {
        return wednesday;
    }

    public boolean isAvailableOnThursday() {
        return thursday;
    }

    public boolean isAvailableOnFriday() {
        return friday;
    }

    public boolean isAvailableOnSaturday() {
        return saturday;
    }

    public boolean isAvailableOnSunday() {
        return sunday;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TripCalendar that = (TripCalendar) o;

        return serviceId.equals(that.serviceId);
    }
}
