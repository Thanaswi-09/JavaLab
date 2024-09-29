//Create a class called Invoice that a hardware store might use to represent an invoice for an item sold  at  the  store.  An  Invoice  should  include  four  pieces  of  information  as  instance variables-a part number(type String),a part description(type String),a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. In addition, provide a method named getInvoiceAmount that calculates the invoice amount
public class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public void displayInvoice() {
        System.out.println("Invoice Details:");
        System.out.println("Part Number: " + partNumber);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Price per Item: $%.2f%n", pricePerItem);
        System.out.printf("Total Invoice Amount: $%.2f%n", getInvoiceAmount());
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("A123", "Hammer", 5, 12.99);
        invoice.displayInvoice();
    }
}
