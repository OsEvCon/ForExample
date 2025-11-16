package base;

public class Bus {
    private String model;
    private int number;
    private int mileage;

    public Bus(BusBuilder builder) {
        this.model = builder.model;
        this.number = builder.number;
        this.mileage = builder.mileage;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", mileage=" + mileage +
                '}';
    }

    public static class BusBuilder {
        private String model;
        private int number;
        private int mileage;

        public BusBuilder setModel(String model) {
            if (model != null) {
                this.model = model;
            }

            return this;
        }

        public BusBuilder setNumber(int number) {
            this.number = number;
            return this;
        }

        public BusBuilder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Bus build() {
            return new Bus(this);
        }
    }
}
