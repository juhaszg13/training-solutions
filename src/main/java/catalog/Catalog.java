package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item) {

        catalogItems.add(item);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        for (int i = 0; i < catalogItems.size(); i++) {
            if (registrationNumber.equals(catalogItems.get(i).getRegistrationNumber())) {
                catalogItems.remove(catalogItems.get(i));
            }
        }
    }


    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        if (searchCriteria == null) {
            throw new NullPointerException("Empty criteria");
        }
        List<CatalogItem> result = new ArrayList<>();
        for (int i = 0; i < catalogItems.size(); i++) {
            boolean found = true;
            if (searchCriteria.hasContributor()) {
                found &= catalogItems.get(i).getContributors().contains(searchCriteria.getContributor());
            }
            if (searchCriteria.hasTitle()) {
                found &= catalogItems.get(i).getTitles().contains(searchCriteria.getTitle());
            }
            if (found) {
                result.add(catalogItems.get(i));
            }
        }
        return result;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem cI : catalogItems) {
            if (cI.hasAudioFeature()) {
                result.add(cI);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem cI : catalogItems) {
            if (cI.hasPrintedFeature()) {
                result.add(cI);
            }
        }
        return result;
    }

    public int getFullLength() {
        List<CatalogItem> result = new ArrayList<>();
        int fullLength = 0;
        for (int i = 0; i < catalogItems.size(); i++) {
            fullLength += catalogItems.get(i).fullLengthAtOneItem();
        }
        return fullLength;
    }

    public int getAllPageNumber() {
        List<CatalogItem> result = new ArrayList<>();
        int allPageNumber = 0;
        for (int i = 0; i < catalogItems.size(); i++) {
            allPageNumber += catalogItems.get(i).numberOfPagesAtOneItem();
        }
        return allPageNumber;
    }

    public double averagePageNumberOver(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        double sum = 0;
        double j = 0;
        for (int i = 0; i < catalogItems.size(); i++) {
            if (catalogItems.get(i).numberOfPagesAtOneItem() > number) {
                sum += catalogItems.get(i).numberOfPagesAtOneItem();
                j++;
            }
        }
        if (sum == 0) {
            throw new IllegalArgumentException("No page");
        }
        return sum / j;
    }
}
