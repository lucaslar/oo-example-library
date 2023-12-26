public class Library {
    private String name;
    private int foundedIn;
    private Medium[] inventory;

    public Library(String name, int foundedIn, int inventorySize) {
        this.name = name;
        this.foundedIn = foundedIn;
        this.inventory = new Medium[inventorySize];
    }

    public boolean addMediumToInventory(Medium medium) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = medium;
                return true;
            }
        }
        return false;
    }

    public Medium findMediumByTitle(String title) {
        for (Medium medium : inventory) {
            if (medium.getTitle().equalsIgnoreCase(title)) {
                return medium;
            }
        }
        return null;
    }

    public void listInventory() {
        System.out.println("Inventory of library '" + name + "' (est. " + foundedIn + "):");
        for (Medium medium : inventory) {
            if (medium != null) {
                System.out.println(medium.toString());
            }
        }
    }

    public String getName() {
        return name;
    }
}
