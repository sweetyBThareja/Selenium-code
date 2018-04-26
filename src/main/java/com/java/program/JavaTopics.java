package com.java.program;

/**
 * Created by skumari on 2/14/2018.
 */
public class JavaTopics {
//    //Variables:
//    String name; //Instance variables
//    int age;
//    int salary;
//    static int count = 0;
//
//    public void employeeDetails(String name, int age, int salary){
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        count+=1;
//    }
//
//    public void showDetails(){
//        String S = "OSI Technology";
//        System.out.println("Details of employee " + " " + name + " " + age + " " + salary + " and name of company " + S);
//        System.out.println("Total number of employees: " + count);
//    }
//
//       public static void main(String args[]){
//        JavaTopics obj = new JavaTopics();
//        JavaTopics obj1 = new JavaTopics();
//        obj.employeeDetails("ram", 23, 20000);
//        obj.showDetails();
//        obj1.employeeDetails("Shyam", 24, 30000);
//        obj1.showDetails();
//    }

   /* //Type conversion and type casting -- single line comment
    public static void main(String args[]) {
        int i = 10;
        double d = i;
        double k;
        System.out.println("type conversion " + d);

        int j;
        Double a = 20.0;
        j = (int)d;
        System.out.println("type casting " + j);
    }*/ //multiple line comment

 //constructor:
//    int id;
//    String name;
//    int salary;
//    JavaTopics(){
//        System.out.println("I am default constructor having no parameter");
//    }
//    JavaTopics(int id, String name, int salary){
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public void showDetails(){
//        System.out.println("Employee details are : " + id +" " + name + " " + salary);
//    }
//
//    public static void main(String args[]){
//        JavaTopics obj = new JavaTopics();
//        JavaTopics obj1 = new JavaTopics(1,"Ram",200000);
//        obj.showDetails();
//        obj1.showDetails();
//    }

////varargs:
//    public void walk(int start, int...nums){
//        System.out.println(nums.length);
//    }
//    public static void main(String args[]){
//        JavaTopics obj = new JavaTopics();
//        obj.walk(1);
//        obj.walk(1,2,3);
//        obj.walk(1, new int[3]);
//    }

//    //this keyword:
//    int id;
//    String name;
//    int fee;
//    JavaTopics(int id, String name){
//        this.id  = id; //refers current class instance variables
//        this.name = name;
//    }
//
//    JavaTopics(int id, String name, int fee){
//        this(id, name); //invoke current class constructor
//        this.fee = fee;
//    }
//
//    public void m(JavaTopics obj){
//        System.out.println("My school name is abc");
//    }
//    public void details(){
//        m(this); //pass as an argument in method
//        System.out.println("I am new student");
//    }
//
//    public void showData(){
//        System.out.println("Details of student: " + id + " " + name + " " + fee);
//        this.details(); //invoke current class method
//    }
//
//    public static void main(String args[]){
//        JavaTopics obj = new JavaTopics(1, "Ram" , 30000);
//        obj.showData();
//        JavaTopics obj1 = new JavaTopics(2, "Shyam" , 40000);
//        obj1.showData();
//
//    }

//    //static:
//    private static int count = 1; //can declare access modifier
//    static {System.out.println("Hello I am static block and will load at the time of class loading");}
//
//        public static void student(){
//        System.out.println("Total number of students : " + count);
//        count+=1;
//    }
//
//
//    public static void main(String args[]){
//        JavaTopics.student();
//        JavaTopics.student();
//        JavaTopics obj = new JavaTopics(); //can also call by instance
//        obj.count = count + 6;
//        System.out.println(obj.count);
//    }

//    //initialization order:
//  private static int count = 0;
//    static{System.out.println("Count is : " + count);}
//    {System.out.println("I am instance initializer block");}
//
//    JavaTopics(){
//        System.out.println("I am default constructor");
//    }
//    public static void main(String args[]){
//        System.out.println("Within main method");
//        JavaTopics obj = new JavaTopics();
//    }

////if statement: Largest of 3 numbers
//    public static void main(String args[]){
//        int i = 10;
//        int j = 30;
//        int k = 3;
//        int x = 1;
//        if(x){
//            System.out.println("value is true"); //compile time error - int can't convert to boolean. In java 0 and 1 doesn't consider as false and true
//        }
//
//        if(i >= j && i >= k){
//            System.out.println("Largest number is : " + i);
//        }else if(j >= k){
//            System.out.println("Largest number is : " + j);
//        }else {
//            System.out.println("Largest number is : " + k);
//        }
//
//    }

////while loop: print table of 3
//   public static void main(String args[]){
//       int i = 1;
//       while(i<10){
//           System.out.println(3*i);
//           i++;
//       }
//   }

//    //do while loop: print table of 3
//    public static void main(String args[]){
//        int i = 1;
//        do{
//          System.out.println(3*i);
//            i++;
//        }while(i<=10);
//    }

//    //for loop: Ascending sorting
//
//    public static void main(String args[]) {
//        int a[] = {23, 12, 46, 32, 4};
//        int temp = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] > a[j]) {
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        for (int k = 0; k < a.length; k++) {
//            System.out.print(a[k] + " ");
//        }
//
//
//    }

//    //Switch statement: day of week
//    public static void main(String args[]){
//        int dayOfWeek = 5;
//        switch(dayOfWeek){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
////            case true:
////                System.out.println("incompatible type boolean");
////                break;
////            case 5.0f:
////                System.out.println("incompatible type long, float and double");
////                break;
//            default:
//                System.out.println("Weekend");
//        }
//
//    }

//    //break and continue statement: print number
//
//    public static void main(String args[]) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 7) {
//                break;
//            }
//
//            if (i == 4) {
//                continue;
//            }
//            System.out.println("Number is: " + i);
//        }
//    }
//      //Method overloading:
//
//    public int add(int a, int b){
//        return a+b;
//    }
//
//    public int add(int a, int b, int c){
//        return a+b+c;
//    }
//
//    public double add(double a, double b, double c){
//        return a+b+c;
//    }
//
//    public static void main(String args[]){
//        JavaTopics obj = new JavaTopics();
//        System.out.println(obj.add(10,20));
//        System.out.println(obj.add(30,24,34));
//        System.out.println(obj.add(12.0,10,7));
//
//    }




}
