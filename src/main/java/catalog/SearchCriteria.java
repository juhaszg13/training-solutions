package catalog;

public class SearchCriteria {
    public String contributor;
    public String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth(String contributor, String title) {
        if (Validators.isBlank(contributor) || Validators.isBlank(title)) {
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor(String contributor) {
        if (Validators.isBlank(contributor)) {
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(contributor,null);
    }

    public static SearchCriteria createByTitle(String title) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(null, title);
    }

    public boolean hasContributor() {
        return contributor!=null;
    }

    public boolean hasTitle() {
        return title!=null;
    }


    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
