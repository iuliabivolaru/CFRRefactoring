package cgk.cfr.newlook.service;

import cgk.cfr.newlook.repository.RouteRepository;
import cgk.cfr.newlook.service.entity.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by iuliab on 14.02.2018.
 */
@Service
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;

    public List<Route> findAllRoutes() {
        return routeRepository.findAllRoutes();
    }

    public List<Route> findRoutesByDepartureAndArrival(String departure, String arrival) {
        return routeRepository.findRoutesByDepartureAndArrival(departure, arrival);
    }

}
