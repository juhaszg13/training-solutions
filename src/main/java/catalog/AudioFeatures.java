package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;


    public AudioFeatures(String title, int length, List<String> performers) {
        if (Validators.isBlank(title)) throw new IllegalArgumentException();
        if (Validators.isEmpty(performers)) throw new IllegalArgumentException();
        if (length < 1) throw new IllegalArgumentException();
        this.length = length;
        this.performers = performers;
        this.title = title;
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (Validators.isBlank(title)) throw new IllegalArgumentException();
        if (Validators.isEmpty(performers)) throw new IllegalArgumentException();
        if (length < 1) throw new IllegalArgumentException();
        this.composer = composer;
        this.length = length;
        this.performers = performers;
        this.title = title;
    }


    @Override
    public List<String> getContributors() {

        List<String> result = new ArrayList<>();
        if (composer != null) {
            for (int i = 0; i < composer.size(); i++) {
                result.add(composer.get(i));
            }
        }
        for (int i = 0; i < performers.size(); i++) {
            result.add(performers.get(i));
        }
        return result;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
