package AdvancedExercise.DefiningClasses.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int engineCount = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        for (int i = 1; i <= engineCount ; i++) {
            String engineInfo = scanner.nextLine();
            String[] engineInfoArr = engineInfo.split(" ");
            String model = engineInfoArr[0];
            int power = Integer.parseInt(engineInfoArr[1]);
            int displacement;
            String efficiency = "";

            if (engineInfoArr.length == 4){
                displacement = Integer.parseInt(engineInfoArr[2]);
                efficiency = engineInfoArr[3];
                Engine engine = new Engine(model, power, displacement, efficiency);
                engineList.add(engine);
            } else if (engineInfoArr.length == 3) {
                if (Character.isDigit(engineInfoArr[2].charAt(0))){
                    displacement = Integer.parseInt(engineInfoArr[2]);
                    Engine engine = new Engine(model, power, displacement);
                    engineList.add(engine);
                }else {
                    efficiency = engineInfoArr[2];
                    Engine engine = new Engine(model, power, efficiency);
                    engineList.add(engine);
                }
            }else {
                Engine engine = new Engine(model, power);
                engineList.add(engine);
            }
        }

        int carCount = Integer.parseInt(scanner.nextLine());
        List <Car> carList = new ArrayList<>();
        for (int i = 1; i <= carCount ; i++) {
            String carInfo = scanner.nextLine();
            String[] carInfoArr = carInfo.split(" ");
            String model = carInfoArr[0];
            String engine = carInfoArr[1];
            int weight;
            String color = "";
            if (carInfoArr.length == 4){
                weight = Integer.parseInt(carInfoArr[2]);
                color = carInfoArr[3];
                Car car = new Car(model, engine, weight, color);
                carList.add(car);
            } else if (carInfoArr.length == 3) {
                if (Character.isDigit(carInfoArr[2].charAt(0))) {
                    weight = Integer.parseInt(carInfoArr[2]);
                    Car car = new Car(model, engine, weight);
                    carList.add(car);
                }else {
                    color = carInfoArr[2];
                    Car car = new Car(model,engine,color);
                    carList.add(car);
                }
            }else {
                Car car = new Car(model, engine);
                carList.add(car);
            }
        }
        for (Car car:carList) {
            System.out.printf("%s:%n", car.getModel());
            for (Engine engine:engineList) {
                if (car.getEngine().equals(engine.getModel())){
                    System.out.printf("%s:%n", engine.getModel());
                    System.out.printf("Power: %s%n", engine.getPower());
                    System.out.printf("Displacement: %s%n", engine.getDisplacement());
                    System.out.printf("Efficiency: %s%n", engine.getEfficiency());
                }
            }
            System.out.printf("Weight: %s%n", car.getWeight());
            System.out.printf("Color: %s%n", car.getColor());
        }
    }
}
