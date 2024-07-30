package Comparable_Comparator;

import java.util.*;
    
   
    public class Emp implements Comparable<Emp>,Comparator<Emp> {
        private int empId;
        private String empName;
        private double empBasicSalary;

        //constructor
        Emp(int empId, String empName, double empBasicSalary) {
            this.empId = empId;
            this.empName = empName;
            this.empBasicSalary = empBasicSalary;
        }
       
        //constructor 
        public Emp() {
        }


        //gettter and setter methods
        public void setEmpId(int empId) {
            this.empId = empId;
        }
        public int getEmpId() {
            return empId;
        }
        public void setEmpName(String empName) {
            this.empName = empName;
        }
        public String getEmpName() {
            return empName;
        }
        public void setEmpBasicSalary(double empBasicSalary) {
            this.empBasicSalary = empBasicSalary;
        }
        public double getEmpBasicSalary() {
            return empBasicSalary;
        }


        public static void displaySortByName(ArrayList<Emp> arrList) {
            System.out.println("List sorted by name in descending order:");
            Collections.sort(arrList);  //comparable method called
            Iterator<Emp> iterator  = arrList.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }  
        }
        public static void displaySortBySalary(ArrayList<Emp> arrList) {
            System.out.println("List sorted by salary in ascending order:");
            Emp e =new Emp();
            Collections.sort(arrList,e);
            Iterator<Emp> iterator = arrList.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }  
        }

    //write compareTo method of Comparable
    @Override
        
        public int compareTo(Emp arg) {
     
        }

        @Override
        public String toString(){
            return "Employee [id=" + empId + ", name=" + empName + ", salary=" + empBasicSalary + "]";
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            ArrayList<Emp> arrList = new ArrayList<Emp>();
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int empId = scan.nextInt();
                String empName = scan.next();
                double empBasicSalary = scan.nextDouble();
                Emp emp = new Emp(empId, empName, empBasicSalary);
                arrList.add(emp);
            } 

            System.out.println("Employee List:");
            Iterator<Emp> iterator = arrList.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }  
            System.out.println();
            displaySortByName(arrList);
            System.out.println();
            displaySortBySalary(arrList);
     
        }
        @Override
        //wirte compare method of comparator
    }
