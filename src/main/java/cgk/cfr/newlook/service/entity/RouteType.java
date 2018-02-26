package cgk.cfr.newlook.service.entity;

/**
 * Created by iuliab on 20.02.2018.
 */
public enum RouteType {

    TRAM_CAR(0), SUBWAY(1), RAIL(2), BUS(3), FERRY(4), CABLE_CAR(5), GONDOLA(6), FUNICULAR(7);

    private final int code;

    private RouteType(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static RouteType fromCode(Integer code) {
        if (code != null) {
            for (RouteType e : RouteType.values()) {
                if (e.getCode() == code) { return e; }
            }
        }
        return RAIL;
    }
}
