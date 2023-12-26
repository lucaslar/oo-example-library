public class Person {
    private String title;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String title, String firstName, String lastName) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        String nameString = firstName + " " + lastName;
        return title != null ? title + " " + nameString : nameString;
    }
}
