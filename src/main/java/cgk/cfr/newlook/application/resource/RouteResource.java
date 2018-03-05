package cgk.cfr.newlook.application.resource;

import cgk.cfr.newlook.service.RouteService;
import cgk.cfr.newlook.service.entity.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by iuliab on 14.02.2018.
 */
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/routes")
@RestController
public class RouteResource {

    @Autowired
    private RouteService routeService;

    @GetMapping
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<List<Route>> getAllRoutes(){
        List<Route> routes = routeService.findAllRoutes();
        if(routes.size() == 0){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(routes, HttpStatus.OK);
    }
}
