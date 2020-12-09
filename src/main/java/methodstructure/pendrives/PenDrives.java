package methodstructure.pendrives;


import java.util.List;

public class PenDrives {
    public Pendrive best(List<Pendrive> penDr) {
        for (int i = 1; i < penDr.size(); i++) {
            if (penDr.get(i - 1).comparePricePerCapacity(penDr.get(i)) == -1) {
                return penDr.get(i);
            }
        }
        return penDr.get(0);
    }

    public Pendrive cheapest(List<Pendrive> penDrives) {
        for (int i = 1; i < penDrives.size(); i++) {
            if (penDrives.get(i).cheaperThan(penDrives.get(i - 1))) {
                return penDrives.get(i);
            }
        }
        return penDrives.get(0);
    }

    public void risePriceWhereCapacity(List<Pendrive> penDrives, int percent, int capacity) {
        for(int i=0;i<penDrives.size();i++){
            if(penDrives.get(i).getCapacity()==capacity){
                penDrives.get(i).risePrice(percent);
            }
        }
    }
}
