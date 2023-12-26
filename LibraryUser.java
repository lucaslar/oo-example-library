public class LibraryUser extends Person {
    private String libraryNr;
    private Medium[] borrowedMedia = new Medium[5]; // Can borrow max. 5 media

    public LibraryUser(String firstName, String lastName, String libraryNr) {
        super(firstName, lastName);
        this.libraryNr = libraryNr;
    }

    public LibraryUser(String title, String firstName, String lastName, String libraryNr) {
        super(title, firstName, lastName);
        this.libraryNr = libraryNr;
    }

    public boolean borrowMedium(Medium medium){
        for (int i = 0; i < borrowedMedia.length; i++) {
            if (borrowedMedia[i] == null && medium.isAvailable()) {
                borrowedMedia[i] = medium;
                medium.borrowMedium();
                return true;
            }
        }
        return false;
    }
}
