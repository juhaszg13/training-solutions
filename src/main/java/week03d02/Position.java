package week03d02;

import week02d03.Product;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus='" + bonus + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Position> positions=new ArrayList<>();
        positions.add(new Position("Gabi",150_000));
        positions.add(new Position("Csabi",200_000));
        positions.add(new Position("Peti",250_000));
        positions.add(new Position("Gabi",120_000));
        for(Position p:positions){
            if(p.bonus>150_000){
                System.out.println(p);
            }
        }
    }
}
