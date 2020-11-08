package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colours = new ArrayList<>();

    public void addFirst(String colour) {
        colours.add(0, colour);
    }

    public void addLast(String colour) {
        colours.add(colour);
    }

    public void removeFirst() {
        colours.remove(0);
    }

    public void removeLast() {
        colours.remove(colours.size() - 1);
    }

    public List<String> getColours() {
        return colours;
    }

    public static void mazin(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("black");
        capsules.addLast("white");
        capsules.addLast("blue");
        capsules.addLast("green");
        System.out.println(capsules.getColours());
        capsules.addFirst("yellow");
        System.out.println(capsules.getColours());
        capsules.removeFirst();
        System.out.println(capsules.getColours());
        capsules.removeLast();
        System.out.println(capsules.getColours());
    }
}
