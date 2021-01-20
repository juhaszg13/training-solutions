package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {
    private List<Site> soldSites = new ArrayList<>();

    public void sellSite(Site site) {
        soldSites.add(site);
    }

    public int address() {
        Site lastSite = soldSites.get(soldSites.size() - 1);
        int items = 0;
        for (Site site : soldSites) {
            if (site.getEvenOdd() == lastSite.getEvenOdd()) {
                items++;
            }
        }
        return lastSite.getEvenOdd() == 0 ? items * 2 : items * 2 - 1;
    }

    public List<FenceCondition> statisticsOfFences() {
        List<FenceCondition> result = new ArrayList<>();
        for (Fence fence : Fence.values()) {
            int items = countFenceByType(fence, soldSites);
            result.add(new FenceCondition(fence, items));
        }
        return result;
    }

    public int countFenceByType(Fence fence, List<Site> sites) {
        int items = 0;
        for (Site site : soldSites) {
            if (site.getFence() == fence) {
                items++;
            }

        }
        return items;
    }

    public List<Site> getSoldSites() {
        return soldSites;
    }
}
