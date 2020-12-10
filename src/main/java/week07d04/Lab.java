package week07d04;

import java.time.LocalDateTime;

public class Lab {
    private String title;
    private boolean completed;
    private LocalDateTime completedAt;

    public Lab(String title) {
        this.title = title;
        completed=false;
    }

    public Lab(String title, LocalDateTime completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        completed=true;
    }
    public boolean complete(LocalDateTime dateTime)
    {
        completedAt=dateTime;
        return completed=true;
    }
    public boolean complete(){
        completedAt=LocalDateTime.now();
        return completed=true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }
}
