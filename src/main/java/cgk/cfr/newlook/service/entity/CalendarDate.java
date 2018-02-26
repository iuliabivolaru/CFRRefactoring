package cgk.cfr.newlook.service.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by iuliab on 20.02.2018.
 */
@Entity
public class CalendarDate {

    @Id
    @Column(name = "DATE")
    private String date;

    @ManyToOne
    @JoinColumn(name = "SERVICE_ID", referencedColumnName="SERVICE_ID")
    private TripCalendar tripCalendar;

    @Column(name = "EXCEPTION_TYPE")
    private TripExceptionType exceptionType;

    public String getDate() {
        return date;
    }

    public TripCalendar getTripCalendar() {
        return tripCalendar;
    }

    public TripExceptionType getExceptionType() {
        return exceptionType;
    }
}
