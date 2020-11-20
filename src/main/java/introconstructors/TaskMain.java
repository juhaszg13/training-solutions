package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task=new Task("Mosás","ruhát mosni");

task.setDuration(10);
       task.start();
        System.out.println(task.getTitle()+task.getDescription()+task.getStartDateTime()+task.getDuration());
    }
}
