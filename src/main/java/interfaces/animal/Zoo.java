package interfaces.animal;

import java.util.List;

public class Zoo {
    List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfLegs() {
        int sum=0;
        for(int i=0;i<getNumberOfAnimals();i++){
          sum+=animals.get(i).getNumberOfLegs();
        }
    return sum;
    }
}
