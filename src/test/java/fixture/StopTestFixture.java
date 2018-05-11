package fixture;

import cgk.cfr.newlook.service.entity.Stop;

public class StopTestFixture {

    public static Stop createStop() {
        return Stop.StopBuilder.stop()
                .withId(1L)
                .withName("Bucuresti")
                .withStopLat(44.44)
                .withStopLon(26.07)
                .build();
    }
}
