package integration;

import cgk.cfr.newlook.ApplicationConfig;
import cgk.cfr.newlook.repository.StopRepository;
import cgk.cfr.newlook.service.entity.Stop;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static fixture.StopTestFixture.createStop;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@Transactional
public class ITStopRepository {

    @Autowired
    private StopRepository stopRepository;

    @Before
    public void setup() {
        stopRepository.deleteAllStops();
    }

    @Test
    public void givenAStop_findAllStops_findAStop() {
        stopRepository.createStop(createStop());

        List<Stop> stops = stopRepository.findAllStops();

        assertThat(stops.size()).isEqualTo(1);
    }
}