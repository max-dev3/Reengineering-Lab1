public class Main {
    public static void main(String[] args) {
        HumanBMI person = new HumanBMI(80, 1.52);
        System.out.println("Initial weight: " + person.getWeight());
        System.out.println("Initial height: " + person.getHeight());
        System.out.println("Initial BMI: " + person.getBmi());
        System.out.println("BMI category: " + person.getResult());

        //Update height and weight
        person.setWeight(75);
        person.setHeight(1.68);
        System.out.println("\nUpdated Person:");
        System.out.println("Updated weight: " + person.getWeight());
        System.out.println("Updated height: " + person.getHeight());
        System.out.println("Updated BMI: " + person.getBmi());
        System.out.println("BMI category: " + person.getResult());
    }
}

class HumanBMI {
    private double weight; // Weight of the person
    private double height; // Height of the person
    private double bmi; // Body Mass Index

    // Constants for BMI ranges
    private static final double LOW_BMI_LIMIT = 18.5;
    private static final double NORMAL_BMI_LIMIT = 25.0;
    private static final double HIGH_BMI_LIMIT = 30.0;

    // Constructor with validation
    public HumanBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be greater than zero.");
        }
        this.weight = weight;
        this.height = height;
        calculateBMI();
    }

    // Method to calculate BMI
    private void calculateBMI() {
        this.bmi = weight / (height * height);
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight with validation
    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be greater than zero.");
        }
        this.weight = weight;
        calculateBMI();
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height with validation
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero.");
        }
        this.height = height;
        calculateBMI();
    }

    // Getter for BMI
    public double getBmi() {
        return bmi;
    }

    // Method to return BMI category based on its value
    public String getResult() {
        if (bmi < LOW_BMI_LIMIT) {
            return "Deficit";
        } else if (bmi >= LOW_BMI_LIMIT && bmi < NORMAL_BMI_LIMIT) {
            return "Norm";
        } else if (bmi >= NORMAL_BMI_LIMIT && bmi < HIGH_BMI_LIMIT) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }
}
