package activity;

public class TrackPoint {
    private final Coordinate coordinate;
    private final double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getDistanceFrom(TrackPoint point) {
        final double lat1 = this.coordinate.getLatitude();
        final double lat2 = point.coordinate.getLatitude();
        final double lon1 = this.coordinate.getLongitude();
        final double lon2 = point.coordinate.getLongitude();
        double el1 = this.elevation;
        double el2 = point.elevation;

        final int r = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = r * c * 1000; // convert to meters

        double height = el1 - el2;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
public boolean higherThan(TrackPoint anotherTrackpoint){
        return elevation>anotherTrackpoint.getElevation();
}
public double elevationDifference(TrackPoint anotherTrackPoint){
        return Math.abs(elevation-anotherTrackPoint.getElevation());
}
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }
}
