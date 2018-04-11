package cgk.cfr.newlook.service.entity;

/**
 * Created by iuliab on 20.02.2018.
 */
public enum TripExceptionType {

    ADDED_FOR_SPECIFIC_DATE(1), REMOVED_FOR_SPECIFIC_DATE(2);

    private final int code;

    private TripExceptionType(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static TripExceptionType fromCode(Integer code) {
        if (code != null) {
            for (TripExceptionType e : TripExceptionType.values()) {
                if (e.getCode() == code) {
                    return e;
                }
            }
        }
        return ADDED_FOR_SPECIFIC_DATE;
    }

}
