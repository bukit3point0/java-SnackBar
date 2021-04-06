package snackbarApp;

public class Customer {
    private static int maxId = 1;
    private int id;

    private String name;
    private double cashOnHand;

    public Customer(
        String name,
        double cashOnHand
    ) {
        id = maxId;
        maxId++;
        this.name = name;
        this.cashOnHand = cashOnHand;
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

    // add cash to cash on hand
    public void addCash(double cash) {
        
        this.cashOnHand += cash;
        System.out.printf(name + "'s cash on hand is $%,.2f\n", cashOnHand);
    }

    // get cash on hand
    public double getCashOnHand() {
        return cashOnHand;
    }

    // buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
    public void buySnack(double total) {
        this.cashOnHand -= total;
        System.out.printf(name + "'s cash on hand is $%,.2f\n",cashOnHand);
    }
}
