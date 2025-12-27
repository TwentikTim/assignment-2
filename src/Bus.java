public class Bus extends Vehicle implements Servicable {

    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        setPassengerCapacity(passengerCapacity);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException("Capacity must be > 0");
        }
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.08;
    }


    @Override
    public void performService() {
        System.out.println("Bus " + getId() + " is undergoing full maintenance");
    }

    @Override
    public int getServiceIntervalKm() {
        return 20000;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                ", capacity=" + passengerCapacity + '}';
    }
}
