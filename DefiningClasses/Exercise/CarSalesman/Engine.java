package AdvancedExercise.DefiningClasses.CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }
    public Engine (String model, int power){
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDisplacement() {
        if(displacement == 0){
            return "n/a";
        }else {
            return String.valueOf(displacement);
        }
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        if (efficiency == null) {
            return "n/a";
        } else {
            return efficiency;
        }
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }
    @Override
    public String toString() {
        return String.format("%s: %s: %d: %s:", model, power, displacement, efficiency);
    }
}
