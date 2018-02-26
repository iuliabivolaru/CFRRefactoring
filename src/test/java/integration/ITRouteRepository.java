package integration;

import cgk.cfr.newlook.ApplicationConfig;
import cgk.cfr.newlook.repository.RouteRepository;
import cgk.cfr.newlook.service.entity.Agency;
import cgk.cfr.newlook.service.entity.Route;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by iuliab on 21.02.2018.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@Transactional
public class ITRouteRepository {

    @Autowired
    private RouteRepository routeRepository;

    private Agency agency;
    private Route route;

    @Before
    public void setup() {
        routeRepository.deleteAllRoutes();
        route = createRoute();
        agency = createAgency();
    }

    @Test
    public void givenARoute_findAllRoutes_findARoute() {
        route.setAgency(agency);
        routeRepository.createRoute(route);

        List<Route> routes = routeRepository.findAllRoutes();

        Assertions.assertThat(routes.size()).isEqualTo(1);
    }

    private Route createRoute() {
        Route route = new Route();
        route.setId(20000);
        route.setShortName("Bucuresti Nord-Brasov");
        return route;
    }

    private Agency createAgency() {
        Agency agency = new Agency();
        agency.setAgencyId("test");
        agency.setName("test");
        agency.setUrl("test");
        agency.setTimezone("test");
        return agency;
    }
}
