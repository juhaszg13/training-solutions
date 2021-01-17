package activity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMinimumCoordinate() {
        if (trackPoints.isEmpty()) {
            throw new IllegalStateException("No points");
        }
        double minLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double minLongitude = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() < minLatitude) {
                minLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() < minLongitude) {
                minLongitude = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(minLatitude, minLongitude);
    }

    public Coordinate findMaximumCoordinate() {
        if (trackPoints.isEmpty()) {
            throw new IllegalStateException("No points");
        }
        double maxLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double maxLongitude = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() > maxLatitude) {
                maxLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() > maxLongitude) {
                maxLongitude = trackPoint.getCoordinate().getLongitude();
            }
        }
        return new Coordinate(maxLatitude, maxLongitude);
    }

    public double getDistance() {
        double sum = 0;
        double distance = 0;
        if (trackPoints.size() > 1) {
            for (int i = 1; i < trackPoints.size(); i++) {
                distance = trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
                sum += distance;
            }
        }
        return sum;
    }

    public double getFullDecrease() {
        double fullDecrease = 0.0;
        if (trackPoints.size() > 1) {
            for (int i = 1; i < trackPoints.size(); i++) {
                TrackPoint actual=trackPoints.get(i);
                TrackPoint prev=trackPoints.get(i-1);
                if (actual.getElevation() < prev.getElevation()) {
                    fullDecrease += Math.abs(actual.getElevation() - prev.getElevation());
                }
            }
        }

        return fullDecrease;
    }

    public double getFullElevation() {
        double fullElevation = 0.0;
        if (trackPoints.size() > 1) {
            for (int i = 1; i < trackPoints.size(); i++) {
                TrackPoint actual = trackPoints.get(i);
                TrackPoint prev = trackPoints.get(i - 1);
                if (actual.getElevation() > prev.getElevation()) {
                    fullElevation += actual.getElevation() - prev.getElevation();
                }
            }
        }
        return fullElevation;
    }

    public double getFullElevationWithForEach() {
        double fullElevation = 0.0;
        if (trackPoints.size() > 1) {
            TrackPoint prev=trackPoints.get(0);
            for (TrackPoint actual:trackPoints) {
                if (actual.getElevation() > prev.getElevation()) {
                    fullElevation += actual.getElevation() - prev.getElevation();
                }
                prev=actual;
            }
        }
        return fullElevation;
    }
    public double getFullElevationWithMethods() {
        double fullElevation = 0.0;
        if (trackPoints.size() > 1) {
            for (int i = 1; i < trackPoints.size(); i++) {
                TrackPoint actual = trackPoints.get(i);
                TrackPoint prev = trackPoints.get(i - 1);
                if (actual.higherThan(prev)) {
                    fullElevation += actual.elevationDifference(prev);
                }
            }
        }
        return fullElevation;
    }

    public double getRectangleArea() {
        Coordinate min = findMinimumCoordinate();
        Coordinate max = findMaximumCoordinate();
        double minLatitude = min.getLatitude();
        double maxLatitude = max.getLatitude();
        double minLongitude = min.getLongitude();
        double maxLongitude = max.getLongitude();
        double rectangleSideA = maxLatitude - minLatitude;
        double rectangleSideB = maxLongitude - minLongitude;


        for (TrackPoint trackPoint : trackPoints) {
            if (trackPoint.getCoordinate().getLatitude() < minLatitude) {
                minLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLatitude() > maxLatitude) {
                maxLatitude = trackPoint.getCoordinate().getLatitude();
            }
            if (trackPoint.getCoordinate().getLongitude() < minLongitude) {
                minLongitude = trackPoint.getCoordinate().getLongitude();
            }
            if (trackPoint.getCoordinate().getLongitude() > maxLongitude) {
                maxLongitude = trackPoint.getCoordinate().getLongitude();
            }
        }
        if (maxLatitude > 0 && minLatitude > 0) {
            rectangleSideA = maxLatitude - minLatitude;
        }
        if (maxLatitude > 0 && minLatitude < 0) {
            rectangleSideA = maxLatitude - minLatitude;
        }
        if (maxLatitude < 0 && minLatitude < 0) {
            rectangleSideA = Math.abs(minLatitude - maxLatitude);
        }
        if (maxLongitude > 0 && minLongitude > 0) {
            rectangleSideB = maxLongitude - minLongitude;
        }
        if (maxLongitude > 0 && minLongitude < 0) {
            rectangleSideB = maxLongitude - minLongitude;
        }
        if (maxLongitude < 0 && minLongitude < 0) {
            rectangleSideB = Math.abs(minLongitude - maxLongitude);
        }
        return rectangleSideA * rectangleSideB;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
