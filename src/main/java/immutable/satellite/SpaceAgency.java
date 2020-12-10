package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {
    List<Satellite> registeredSatellites = new ArrayList<>();

    public void registerSatellite(Satellite satellite) {
        List<Satellite> satellites = new ArrayList<>();
        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }

        registeredSatellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent) {
        if (isEmpty(registerIdent)) {
            throw new IllegalArgumentException("Registeridentity mustn't be empty!");
        }
        for (Satellite s : registeredSatellites) {
            if (registerIdent.equals(s.getRegisterIdent())) {
                return s;
            }

        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
    }

    private boolean isEmpty(String str) {
        return (str == null || "".equals(str.trim()));
    }

    @Override
    public String toString() {
        return registeredSatellites.toString();
    }
}
