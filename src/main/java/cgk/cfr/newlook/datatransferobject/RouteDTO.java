package cgk.cfr.newlook.datatransferobject;

public class RouteDTO {

    private String shortName;

    public RouteDTO() {
    }

    public RouteDTO(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
