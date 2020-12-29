package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private List<Feature> features;
    private int price;
    private String registrationNumber;

    public CatalogItem(String registrationNumber, int price, List<Feature> features) {
        this.features = features;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }


    public int fullLengthAtOneItem() {
        int length = 0;
        for (int i = 0; i < features.size(); i++) {
            if (features.get(i) instanceof AudioFeatures) {
                length += ((AudioFeatures) features.get(i)).getLength();
            }
        }
        return length;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (Feature feature : features) {
            for (int i = 0; i < feature.getContributors().size(); i++) {

                contributors.add(feature.getContributors().get(i));
            }
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Feature feature : features) {
            titles.add(feature.getTitle());

        }
        return titles;
    }


    public boolean hasAudioFeature() {
        for (Feature feature : features) {
            if (feature instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature feature : features) {
            if (feature instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int numberOfPages = 0;
        for (int i = 0; i < features.size(); i++) {
            if (features.get(i) instanceof PrintedFeatures) {
                numberOfPages += ((PrintedFeatures) features.get(i)).getNumberOfPages();
            }
        }
        return numberOfPages;
    }


    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
