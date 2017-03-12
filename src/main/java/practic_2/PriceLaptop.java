package practic_2;

/**
 * Created by SergLion on 20.01.2017.
 */
public class PriceLaptop {

    private String model;
    private String description;
    private double price;

    public PriceLaptop(String model, String description, double price) {
        this.model = model;
        this.description = description;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PriceLaptop{" +
                "model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
