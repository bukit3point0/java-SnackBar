package snackbarApp;

public class Snack {
    private static int maxId = 1;
    private int id;

    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(
        String name,
        int quantity,
        double cost,
        int vendingMachineId
    ) {
        id = maxId;
        maxId++;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
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

    // set and get cost
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    // set and get vending machine id
    public int getVendingMachineId() {
        return vendingMachineId;
    }
    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    // get quantity
    public int getQuantity() {
        
        return quantity;
    }
    
    // add quantity when given how many to add
    public void addQuantity(int addStock) {
        this.quantity += addStock;
        System.out.println("Quantity of " + name + " is " + quantity);
    }

    // buy snack when given how many to buy

    public void buySnack (int num) {
        this.quantity -= num;
        System.out.println("Quantity of " + name + " is " + quantity);
    }

    // get total cost given a quantity
    public double totalCost (int num) {
        return this.cost * num;
    }

}