package integration;

import cgk.cfr.newlook.ApplicationConfig;
import cgk.cfr.newlook.repository.RouteRepository;
import cgk.cfr.newlook.service.entity.Agency;
import cgk.cfr.newlook.service.entity.Route;
import fixture.RouteTestFixture;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static fixture.RouteTestFixture.createRouteWithAgency;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by iuliab on 21.02.2018.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@Transactional
public class ITRouteRepository {

    @Autowired
    private RouteRepository routeRepository;

    @Before
    public void setup() {
        routeRepository.deleteAllRoutes();
    }

    @Test
    public void givenARoute_findAllRoutes_findARoute() {
        routeRepository.createRoute(createRouteWithAgency());

        List<Route> routes = routeRepository.findAllRoutes();

        assertThat(routes.size()).isEqualTo(1);
    }

    @Test
    public void
    givenRoutes_findRoutesByDepartureAndArrival_findRoutes() {
        routeRepository.createRoute(createRouteWithAgency());
        routeRepository.createRoute(RouteTestFixture.createOtherRouteWithAgency());

        List<Route> routes = routeRepository.findRoutesByDepartureAndArrival("Bucuresti Nord Test",
                "Brasov");

        assertThat(routes.size()).isEqualTo(1);
    }

}
