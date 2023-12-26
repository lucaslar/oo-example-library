import java.util.Arrays;

public class Dvd extends Medium {
    private Person director;
    private Person[] actors;
    private int durationInMinutes;

    public Dvd(String title, int publicationYear, int availableInstances, Person director, Person[] actors, int durationInMinutes) {
        super(title, publicationYear, availableInstances);
        this.director = director;
        this.actors = actors;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "title='" + getTitle() + '\'' +
                ", publicationYear=" + getPublicationYear() +
                ", availableInstances=" + getAvailableInstances() +
                ", description='" + getDescription() + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", director=" + director +
                ", actors=" + Arrays.toString(actors) +
                "} ";
    }
}
