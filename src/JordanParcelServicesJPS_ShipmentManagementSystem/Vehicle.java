package JordanParcelServicesJPS_ShipmentManagementSystem;


    public abstract class Vehicle {
        protected String model;
        protected String manufacturer;
        protected String registrationCode;

        protected Blackbox blackbox;

        public Vehicle(String model, String manufacturer, String registrationCode) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.registrationCode = registrationCode;
            this.blackbox = Blackbox.getInstance();
        }


        public abstract double calculateFuelConsumption(double distance);

        public Blackbox getBlackBox() {
            return blackbox;
        }
    }

