package week03;

import java.util.ArrayList;
import java.util.List;


public class Position {
    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {
        List<Position> positions = new ArrayList<>();

        positions.add(new Position("John",200000 ));
        positions.add(new Position("Peter",100000 ));
        positions.add(new Position("Lucy",300000 ));
for(Position position:positions){
    if(position.getBonus()>150000){
        System.out.println(position);
    }
}

    }
}

