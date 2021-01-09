package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMinimumCoordinate() {
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
        for (int i = 1; i < trackPoints.size(); i++) {
            distance = trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
            sum += distance;
        }
        return sum;
    }

    public double getFullDecrease() {
        double fullDecrease = 0.0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() < trackPoints.get(i - 1).getElevation()) {
                fullDecrease += trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }
        return fullDecrease;
    }

    public double getFullElevation() {
        double fullElevation = 0.0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() > trackPoints.get(i - 1).getElevation()) {
                fullElevation += trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            }
        }
        return fullElevation;
    }

    public double getRectangleArea() {
        double minLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double maxLatitude = trackPoints.get(0).getCoordinate().getLatitude();
        double minLongitude = trackPoints.get(0).getCoordinate().getLongitude();
        double maxLongitude = trackPoints.get(0).getCoordinate().getLongitude();
        double rectangleSideA = 0;
        double rectangleSideB = 0;

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
