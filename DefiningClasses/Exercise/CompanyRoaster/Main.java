package AdvancedExercise.DefiningClasses.CompanyRoaster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List <Employee> employeeList = new ArrayList<>();
        double highestSalary = 0;
        String highestDepartment = "";

        for (int i = 1; i <= n; i++) {
            String employee = scanner.nextLine();
            String[] employeeArr = employee.split(" ");
            String name = employeeArr[0];
            double salary = Double.parseDouble(employeeArr[1]);
            String position = employeeArr[2];
            String department = employeeArr[3];

            String email = "";
            int age = 0;

            if (salary > highestSalary){
                highestSalary = salary;
                highestDepartment = department;
            }
            if (employeeArr.length == 6){
                email = employeeArr[4];
                age = Integer.parseInt(employeeArr[5]);
                Employee currEmployee = new Employee(name, salary, position, department, email, age);
                employeeList.add(currEmployee);
            } else if (employeeArr.length == 5) {
                boolean isNum = Character.isDigit(employeeArr[4].charAt(0));

                if (isNum){
                    age = Integer.parseInt(employeeArr[4]);
                    Employee currEmployee = new Employee(name, salary, position, department, age);
                    employeeList.add(currEmployee);
                }else {
                    email = employeeArr[4];
                    Employee currEmployee = new Employee(name, salary, position, department, email);
                    employeeList.add(currEmployee);
                }
            }else {
                Employee currEmployee = new Employee(name, salary, position, department);
                employeeList.add(currEmployee);
            }
        }
        Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("Highest Average Salary: " + highestDepartment);
        for (Employee employee:employeeList) {
            if (highestDepartment.equals(employee.getDepartment())){
                System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(),
                        employee.getEmail(), employee.getAge());
            }
        }
    }
}
