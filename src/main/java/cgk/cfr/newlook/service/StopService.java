package cgk.cfr.newlook.service;

import cgk.cfr.newlook.repository.StopRepository;
import cgk.cfr.newlook.service.entity.Stop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopService {

    @Autowired
    private StopRepository stopRepository;

    public List<Stop> findAllStops() {
        return stopRepository.findAllStops();
    }
}
