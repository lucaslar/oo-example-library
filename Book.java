public class Book extends Medium {
    private Person[] authors;
    private int pages;

    public Book(String title, int publicationYear, int availableInstances, Person[] authors, int pages) {
        super(title, publicationYear, availableInstances);
        this.authors = authors;
        this.pages = pages;
    }

    // Constructor allowing only a single author (no array) which will be mapped later
    public Book(String title, int publicationYear, int availableInstances, Person singleAuthor, int pages) {
        super(title, publicationYear, availableInstances);
        this.authors = new Person[]{singleAuthor};
        this.pages = pages;
    }

    @Override
    public String toString() {
        String authorsString = "[";
        for (int i = 0; i < authors.length; i++) {
            if (i > 0) authorsString += ", ";
            authorsString += authors[i].toString();
        }
        authorsString += "]";

        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", publicationYear=" + getPublicationYear() +
                ", availableInstances=" + getAvailableInstances() +
                ", description='" + getDescription() + '\'' +
                ", authors=" + authorsString +
                ", pages=" + pages +
                "} ";
    }
}
