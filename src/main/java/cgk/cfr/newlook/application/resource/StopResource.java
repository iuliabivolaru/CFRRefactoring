package cgk.cfr.newlook.application.resource;

import cgk.cfr.newlook.service.StopService;
import cgk.cfr.newlook.service.entity.Stop;
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

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/stops")
@RestController
public class StopResource {

    @Autowired
    private StopService stopService;

    @GetMapping
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<List<Stop>> getAllRoutes() {
        List<Stop> stops = stopService.findAllStops();
        if (stops.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(stops, HttpStatus.OK);
    }

}
