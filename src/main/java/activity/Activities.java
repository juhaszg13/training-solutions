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
    public List<Report> distancesByTypes() {
        double[] sum=new double[ActivityType.values().length];
        for(Activity activity:activities){
            sum[activity.getType().ordinal()]+=activity.getDistance();
        }
        List<Report> report = new ArrayList<>();
        for(ActivityType activityType:ActivityType.values()){
        report.add(new Report(activityType, sum[activityType.ordinal()]));
        }
        return report;
    }


    public int numberOfTrackActivities() {
        int sum = 0;
        for (Activity activity : activities) {
            //if (activity instanceof ActivityWithTrack) {
            if(activity.hasTrack()){
                sum++;
            }
        }
        return sum;
    }

    public int numberOfWithoutTrackActivities() {
        int sum = 0;
        for (Activity activity : activities) {
            //if (activity instanceof ActivityWithoutTrack) {
            if(!activity.hasTrack()){
                sum++;
            }
        }
        return sum;
    }
}
