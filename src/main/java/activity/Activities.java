package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> report = new ArrayList<>();
        for (int i = 0; i < ActivityType.values().length; i++) {
            double distance = 0;
            for (int j = 0; j < activities.size(); j++) {
                if (activities.get(j).getType() == ActivityType.values()[i]) {
                    distance += activities.get(j).getDistance();
                }
            }
            report.add(new Report(ActivityType.values()[i], distance));
        }
        return report;
    }

    public int numberOfTrackActivities() {
        int sum = 0;
        for (Activity activity : activities) {
            if (activity instanceof ActivityWithTrack) {
                sum++;
            }
        }
        return sum;
    }

    public int numberOfWithoutTrackActivities() {
        int sum = 0;
        for (Activity activity : activities) {
            if (activity instanceof ActivityWithoutTrack) {
                sum++;
            }
        }
        return sum;
    }
}
