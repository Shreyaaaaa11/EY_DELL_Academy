package com.programming;
import java.util.Arrays;

import java.util.Comparator;

 

public class Employee {

    private int empId;

    private int empAge;

    private String empName;

    private int empSalary;

 

    public static void main(String[] args) {

        // TODO Auto-generated method stub

 

    }

 

    public int getEmpId() {

        return empId;

    }

 

    public void setEmpId(int empId) {

        this.empId = empId;

    }

 

    public int getEmpAge() {

        return empAge;

    }

 

    public void setEmpAge(int empAge) {

        this.empAge = empAge;

    }

 

    public String getEmpName() {

        return empName;

    }

 

    public void setEmpName(String empName) {

        this.empName = empName;

    }

 

    public int getEmpSalary() {

        return empSalary;

    }

 

    public void setEmpSalary(int empSalary) {

        this.empSalary = empSalary;

    }

 

    Employee (int empId,String empName,int empAge){

  this.empId =empId;

    this.empName=empName;

    this.empAge=empAge;

    this.empSalary=empSalary;

    }

    public String toString() {

        return "id is" + this.empId + "and name is" + this.empName + " and the age is" + this.empName

                + "and the salary is" + this.empSalary;

    

}

public int compareto(Employee o) {

    return this.empId -o.empId;

    

}

 

public static Comparator<Employee> agecomparator= new comparator<>() {

    public int compare(employee o1,Employee o2) {

        return o1.getEmpAge() -o2.getAge();

    

};

 

public static Comparator<Employee> namecomparator= new comparator<>() {

    public int compare(employee o1,Employee o2) {

        return o1.getEmpName() -compareTo(o2.getEmpName());

    }

};

 

public static Comparator<Employee> salarycomparator= new comparator<>() {

    public int compare(employee o1,Employee o2) {

        return o1.getEmpsalary() - o2.getEmpsalary();

    }

};

public class SortingTheObjects {

    public static void main(String[] args) {

 

        Employee[] empArr = new Employee[4];

        empArr[0] = new Employee(123, "A", 25, 5000);

        empArr[1] = new Employee(101, "Z", 24, 5500);

        empArr[2] = new Employee(134, "X", 26, 5400);

        empArr[3] = new Employee(130, "B", 27, 5800);

 

        Arrays.sort(empArr);

        System.out.println("Sorted emp array is" + Arrays.toString(empArr));

        

        Arrays.sort(empArr,Employee.agecomparator);

        System.out.println("Sorted emp array is" + Arrays.toString(empArr));

        

        Arrays.sort(empArr,Employee.namecomparator);

        System.out.println("Sorted emp array is" + Arrays.toString(empArr));

        

        Arrays.sort(empArr,Employee.salarycomparator);

        System.out.println("Sorted emp array is" + Arrays.toString(empArr));

    }

    }

    }
