public abstract class Vehicle {

    protected int id;
    protected static int idGen = 0;
    protected String model;
    protected int year;
    protected double basePrice;

    // Constructor
    public Vehicle(String model, int year, double basePrice) {
        this.id = idGen++;
        setModel(model);
        setYear(year);
        setBasePrice(basePrice);
    }

    // Getters & setters with validation
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty");
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2100) {
            throw new IllegalArgumentException("Invalid year");
        }
        this.year = year;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Base price must be > 0");
        }
        this.basePrice = basePrice;
    }

    // Concrete method
    public int getAge(int currentYear) {
        return currentYear - year;
    }

    // Abstract method (NO BODY)
    public abstract double calculateInsuranceFee();

    @Override
    public String toString() {
        return "Vehicle{id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", basePrice=" + basePrice + '}';
    }
}
