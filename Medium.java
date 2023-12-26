public class Medium {
    private String title;
    private int publicationYear;
    private int availableInstances;
    private String description;

    public Medium(String title, int publicationYear, int availableInstances) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.availableInstances = availableInstances;
    }

    public boolean borrowMedium() {
        boolean available = isAvailable();
        if (available) availableInstances--;
        return available;
    }

    public void returnMedium() {
        availableInstances++;
    }

    public boolean isAvailable() {
        return availableInstances > 0;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getAvailableInstances() {
        return availableInstances;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
