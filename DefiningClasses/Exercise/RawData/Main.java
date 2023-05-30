package AdvancedExercise.DefiningClasses.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 1; i <= numberOfCars; i++) {
            String carInfo = scanner.nextLine();
            String[] carInfoArr = carInfo.split(" ");
            String model = carInfoArr[0];
            int engineSpeed = Integer.parseInt(carInfoArr[1]);
            int enginePower = Integer.parseInt(carInfoArr[2]);
            int cargoWeight = Integer.parseInt(carInfoArr[3]);
            String cargoType = carInfoArr[4];
            double tire1Pressure = Double.parseDouble(carInfoArr[5]);
            int tire1Age = Integer.parseInt(carInfoArr[6]);
            double tire2Pressure = Double.parseDouble(carInfoArr[7]);
            int tire2Age = Integer.parseInt(carInfoArr[8]);
            double tire3Pressure = Double.parseDouble(carInfoArr[9]);
            int tire3Age = Integer.parseInt(carInfoArr[10]);
            double tire4Pressure = Double.parseDouble(carInfoArr[11]);
            int tire4Age = Integer.parseInt(carInfoArr[12]);

            Car currentCar = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tire1Pressure, tire1Age,
                    tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);
            carList.add(currentCar);
        }
        String command = scanner.nextLine();
        if (command.equals("fragile")){
            printingFragileType(command, carList);
        } else {
            printingFlamableType(command, carList);
        }
    }
    public static void printingFragileType(String command, List<Car> carList){
        for (Car item:carList) {
            if (command.equals(item.getCargoType()) && item.getTire1Pressure() < 1 || item.getTire2Pressure() < 1
                    || item.getTire3Pressure() < 1 || item.getTire4Pressure() < 1){
                System.out.println(item.getModel());
            }
        }
    }
    public static void printingFlamableType(String command, List<Car> carList){
        for (Car item: carList) {
            if (command.equals(item.getCargoType()) && item.getEnginePower() > 250){
                System.out.println(item.getModel());
            }

        }
    }
}
