package Automobile;

public class Automobile {
	
	// instantiate variables
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
    // default constructor
    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }
    // parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // add a vehicle
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Successfully added vehicle added to inventory..";
        } catch (Exception e) {
            return "An error occurred while adding vehicle: " + e.getMessage();
        }
    }
    
    // list vehicle information
    public String[] listVehicleInfo() {
        try {
            return new String[] { make, model, color, String.valueOf(year), String.valueOf(mileage) };
        } catch (Exception e) {
            return new String[] { "An error occurred while listing vehicle information: " + e.getMessage() };
        }
    }
    // remove a vehicle
    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Successfully removed vehicle.";
        } catch (Exception e) {
            return "An error occurred while removing vehicle: " + e.getMessage();
        }
    }
    // update vehicle attributes
    public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Successfully updated vehicle.";
        } catch (Exception e) {
            return "An error occurred updating vehicle: " + e.getMessage();
        }
    }

}
