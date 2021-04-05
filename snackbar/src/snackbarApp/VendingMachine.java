package snackbarApp;

public class VendingMachine {
    private static int maxId = 1;
    private int id;

    private String name;

    public VendingMachine(String name) {
        id = maxId;
        maxId++;
        this.name = name;
    }

    //getters and setters
    // get id
    public int getId() {
        return id;
    }

    // set and get name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
