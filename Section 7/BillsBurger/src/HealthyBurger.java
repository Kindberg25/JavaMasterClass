
public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private Double healthyExtra1Price;
    private String healthyExtra2Name;
    private Double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Dark");
        super.addHamburgerAddition1("Chips", 3.00);
        super.addHamburgerAddition2("Drink", 2.10);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalHamburgerPrice = super.itemizeHamburger();


        if (this.healthyExtra1Name != null) {
            totalHamburgerPrice += this.healthyExtra1Price;
            System.out.println("Additional " + this.healthyExtra1Name + " for a cost of " + this.healthyExtra1Price + "$.");
        }

        if (this.healthyExtra2Name != null) {
            totalHamburgerPrice += this.healthyExtra2Price;
            System.out.println("Additional " + this.healthyExtra2Name + " for a cost of " + this.healthyExtra2Price + "$.");
        }


        return totalHamburgerPrice;
    }


}
