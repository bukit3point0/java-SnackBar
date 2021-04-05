package snackbarApp;

public class Main {
    public static void main(String[] args) {
        workWithData();
    }

    private static void workWithData() {
        Customer jane = new Customer(
            "Jane", 
            45.25
        );

        Customer bob = new Customer(
            "Bob",
            33.14
        );

        VendingMachine food = new VendingMachine(
            "Food"
        );
        VendingMachine drink = new VendingMachine(
            "Drink"
        );
        VendingMachine office = new VendingMachine(
            "Office"
        );

        Snack chips = new Snack(
            "Chips", 
            36, 
            1.75, 
            1
        );
        Snack chocolatebar = new Snack(
            "ChocolateBar", 
            36, 
            1.00, 
            1
        );
        Snack pretzel = new Snack(
            "Pretzel", 
            30, 
            2.00, 
            1
        );
        Snack soda = new Snack(
            "Soda", 
            24, 
            2.50, 
            2
        );
        Snack water = new Snack(
            "Water", 
            20, 
            2.75, 
            2
        );

        // Jane buys 3 sodas
            // print Jane's cash on hand
            jane.buySnack(soda.totalCost(3));
            // print quantity of soda
            soda.buySnack(3);
        
        // Jane buys 1 pretzel
            // print Jane's cash on hand
            jane.buySnack(pretzel.totalCost(1));
            // print quantity of pretzel
            pretzel.buySnack(1);

        // Bob buys 2 sodas
            // print Bob's cash on hand
            bob.buySnack(soda.totalCost(2));
            // print quantity of soda
            soda.buySnack(2);

        // Jane finds $10
            // print Jane's cash on hand
            jane.addCash(10.00);

        // Jane buys 1 chocolate bar
            // print Jane's cash on hand
            jane.buySnack(chocolatebar.totalCost(1));
            // print quantity of chocolate bars
            chocolatebar.buySnack(1);

        // Add 12 pretzels
            // print quantity of pretzels
            pretzel.addQuantity(12);
        
        // Bob buys 3 pretzels 
            // print Bob's cash on hand
            bob.buySnack(pretzel.totalCost(3));
            // print quantity of pretzels
            pretzel.buySnack(3);
        
    };
}
