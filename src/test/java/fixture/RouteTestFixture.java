package fixture;

import cgk.cfr.newlook.service.entity.Agency;
import cgk.cfr.newlook.service.entity.Route;

/**
 * Created by iuliab on 26.02.2018.
 */
public class RouteTestFixture {

    public static Agency createAgency() {
        return Agency.AgencyBuilder.agency()
                .withId("first agency")
                .withName("Testtrans")
                .withUrl("http://testtrans.ro/")
                .withTimezone("Europe/Bucharest")
                .build();
    }

    public static Route createRouteWithAgency() {
        return Route.RouteBuilder.route()
                .withShortName("Bucuresti Nord Test - Arad")
                .withLongName("Bucuresti Nord Test - Videle - Arad")
                .withAgency(createAgency())
                .build();
    }
}
