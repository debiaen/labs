package mypackage;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = Math.max(0, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Math.max(0, price);
    }

    public void displayInfo() {
        System.out.println("Товар: " + name + ", Ціна: " + price + " грн");
    }
}

class Toy extends Product {
    private String ageGroup;

    public Toy(String name, double price, String ageGroup) {
        super(name, price);
        this.ageGroup = ageGroup;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Вікова група: " + ageGroup);
    }
}

class DairyProduct extends Product {
    private String expirationDate;

    public DairyProduct(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Термін придатності: " + expirationDate);
    }
}

public class Lab02 {
    public static void main(String[] args) {
        Toy toy = new Toy("Конструктор LEGO", 1500, "6+");
        toy.displayInfo();

        System.out.println();

        DairyProduct milk = new DairyProduct("Молоко", 25, "01.01.2025");
        milk.displayInfo();
    }
}
