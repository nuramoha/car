


// fields
public class CarRentalSystem {

    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;

    public static String companyName = "Just Rentals";
    public static int totalCars = 0;

    public CarRentalSystem() {
        this.plateNumber = "unknown";
        this.carModel = "unknown";
        this.dailyRate = 0;
        this.rent = false;
        totalCars++;
    }


    public CarRentalSystem(String plateNumber,
                           String carModel,
                           double dailyRate,
                           boolean rent) {

        this.plateNumber = plateNumber;
        this.carModel = carModel;

        if (dailyRate >= 0) {
            this.dailyRate = dailyRate;
        }

        this.rent = rent;
        totalCars++;
    }

    // Constructor with 3 parameters
    public CarRentalSystem(String plateNumber,
                           String carModel,
                           double dailyRate) {

        this.plateNumber = plateNumber;
        this.carModel = carModel;

        if (dailyRate >= 0) {
            this.dailyRate = dailyRate;
        }

        this.rent = false;
        totalCars++;
    }

    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rent;
    }

    // Setter
    public void setDailyRate(double dailyRate) {
        if (dailyRate >= 0) {
            this.dailyRate = dailyRate;
        }
    }

    // Rent car
    public void rent() {
        if (rent == false) {
            rent = true;
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Car is already rented.");
        }
    }

    // Return car
    public void returnCar() {
        if (rent == true) {
            rent = false;
            System.out.println("Car returned successfully.");
        } else {
            System.out.println("Car is not rented.");
        }
    }

    // Display info
    public void displayInfo() {
        System.out.println("plateNumber: " + plateNumber);
        System.out.println("carModel: " + carModel);
        System.out.println("dailyRate: " + dailyRate);
        System.out.println("Rented: " + rent);
    }


    public static void displayCompanyName() {
        System.out.println("CompanyName: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("TotalCars: " + totalCars);
    }



    //public class TestCar {

    public static void main(String[] args) {

        // Create cars
        System.out.println("Creating Cars...");

        CarRentalSystem car1 = new CarRentalSystem(
                "ABC123",
                "Toyota Corolla",
                40.0
        );

        CarRentalSystem car2 = new CarRentalSystem(
                "XYZ456",
                "Honda Civic",
                50.0
        );

        // Display company name
        System.out.println("\nCompany Name:");
        CarRentalSystem.displayCompanyName();

        // Display total cars
        System.out.println("\nTotal Cars:");
        CarRentalSystem.displayTotalCars();

        // Display car information
        System.out.println("\nCar 1 Information:");
        car1.displayInfo();

        System.out.println("\nCar 2 Information:");
        car2.displayInfo();

        // Rent a car
        System.out.println("\nRenting Car 1:");
        car1.rent();

        // Display car after renting
        System.out.println("\nCar 1 after renting:");
        car1.displayInfo();

        // Try to rent already rented car
        System.out.println("\nTrying to rent Car 1 again:");
        car1.rent();

        // Return car
        System.out.println("\nReturning Car 1:");
        car1.returnCar();

        // Display car after returning
        System.out.println("\nCar 1 after returning:");
        car1.displayInfo();

        // Display total cars
        System.out.println("\nFinal Total Cars:");
        CarRentalSystem.displayTotalCars();
    }
}