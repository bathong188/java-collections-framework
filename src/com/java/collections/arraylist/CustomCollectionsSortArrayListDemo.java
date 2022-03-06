package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomCollectionsSortArrayListDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Vy", 23, 80_000));
        employees.add(new Employee(2, "Rau", 24, 60_000));
        employees.add(new Employee(3, "Jay", 41, 90_000));
        employees.add(new Employee(4, "Kate", 33, 95_000));
        employees.add(new Employee(4, "Ave", 29, 72_000));

        // SORT BY SALARY IN ASCENDING ORDER

        // Create a custom Comparator object that compares
        // the salaries between two Employee
        Comparator<Employee> ascendingSalaryComparator = new SortByAscendingSalary();

        // Using the Collections sort() method,
        // pass in the target List and custom Comparator
        // to sort Employees by salary in ascending order
        Collections.sort(employees, ascendingSalaryComparator);

        /*************************************************************************/
        // Alternatively, create a custom Comparator using anonymous implementation
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getSalary() - e2.getSalary();
            }
        });

        // Or create a custom Comparator using lambda expression
        // Option 1:
        Collections.sort(employees, ((e1, e2) -> e1.getSalary() - e2.getSalary()));

        // Option 2:
        Collections.sort(employees, (Comparator.comparingInt(Employee::getSalary)));
        /*************************************************************************/

        employees.forEach(employee -> System.out.println(employee));


        // SORT BY SALARY IN DESCENDING ORDER
        Collections.sort(employees, ((e1, e2) -> e2.getSalary() - e1.getSalary()));

        employees.forEach(employee -> System.out.println(employee));


        // SORT BY NAME IN ASCENDING ORDER
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));

        // or
        Collections.sort(employees, Comparator.comparing(Employee::getName));

        employees.forEach(employee -> System.out.println(employee));
    }
}

/**
 * Implement Comparator interface and override compare() method
 * to compare the salaries between two Employees objects
 */
class SortByAscendingSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary() - e2.getSalary();
    }
}

class Employee {
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
