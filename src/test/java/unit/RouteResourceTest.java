package unit;

import cgk.cfr.newlook.application.resource.RouteResource;
import cgk.cfr.newlook.service.RouteService;
import cgk.cfr.newlook.service.entity.Agency;
import cgk.cfr.newlook.service.entity.Route;
import fixture.RouteTestFixture;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.http.ResponseEntity.ok;

/**
 * Created by iuliab on 26.02.2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class RouteResourceTest {

    @InjectMocks
    private RouteResource routeResource;

    @Mock
    private RouteService mockRouteService;

    @Test
    public void givenARoute_findAllRoutes_returns200OKResponse() {
        Route route = RouteTestFixture.createRouteWithAgency();
        when(mockRouteService.findAllRoutes()).thenReturn(asList(route));

        ResponseEntity<List<Route>> responseEntity = routeResource.getAllRoutes();

        Assertions.assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void givenARoute_findRoutesByDepartureAndArrival_returns200OKResponse() {
        Route route = RouteTestFixture.createRouteWithAgency();
        when(mockRouteService.findRoutesByDepartureAndArrival("Bucuresti Nord Test", "Videle")).thenReturn(asList(route));

        ResponseEntity<List<Route>> responseEntity = routeResource.getRoutesByDepartureAndArrival("Bucuresti Nord Test",
                "Videle");

        Assertions.assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

}