package AutomobileInventory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import Automobile.Automobile;

public class AutomobileInventory {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create a new automobile
        Automobile car = new Automobile("Subaru", "CrossTrek", "Black", 2019, 50000);
        
        // put this in a try block for error handling
        try {
            // list vehicle information
            String[] vehicleInfo = car.listVehicleInfo();
            System.out.println("Vehicle Information:");
            for (String info : vehicleInfo) {
                System.out.println(info);
            }

            // remove vehicle
            System.out.println(car.removeVehicle());

            // add new vehicle
            System.out.println(car.addVehicle("Toyota", "Tacoma", "Red", 2021, 10000));

            // list new vehicle information
            vehicleInfo = car.listVehicleInfo();
            System.out.println("New Vehicle Information:");
            for (String info : vehicleInfo) {
                System.out.println(info);
            }

            // update vehicle
            System.out.println(car.updateVehicleAttributes("Jeep", "Grand Cherokee", "Black", 2022, 5000));

            // list updated vehicle information
            vehicleInfo = car.listVehicleInfo();
            System.out.println("Updated Vehicle Information:");
            for (String info : vehicleInfo) {
                System.out.println(info);
            }

            // prompt user if they want to print the information to a file
            System.out.print("Do you want to print the information to a file (Y/N)? ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                writeToFile(vehicleInfo);
                System.out.println("Information printed to file.");
            } else {
                System.out.println("File will not be printed.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void writeToFile(String[] vehicleInfo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Temp\\Autos.txt"))) {
            for (String info : vehicleInfo) {
                writer.write(info);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
