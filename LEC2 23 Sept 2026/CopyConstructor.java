import java.util.*;
class Student{
    int roll;
    String name;
    int[] marks = new int[5];

    // Create 2 constructors one with roll and name
    // One with roll, name, marks
    // Write getter and setter methods
    // Write toString() method

    public Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }

    public Student(int roll, String name, int[] marks){
        this.roll = roll;
        this.name = name;
        // SHALLOW COPY
        this.marks = marks;
    }

    // COPY CONSTRUCTOR
    public Student(Student s){
        this.roll = s.roll;
        this.name = s.name;
        // DEEP COPY
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s.marks[i];
        }
    }

    public void setRoll(int roll){
        this.roll = roll;
    }
    public int getRoll(){
        return this.roll;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setMarks(int[] marks){
        this.marks = marks;
    }
    public int[] getMarks(){
        return this.marks;
    }
    
    public String toString(){
        return "Roll = " + this.roll + ", Name = " + this.name + ", Marks = " + Arrays.toString(this.marks);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        // SHALLOW COPY
        Student s1 = new Student(1439, "Harman");
        System.out.println(s1.getName());
        s1.setMarks(new int[] {90,80,97,98,89});
        System.out.println(s1.toString());

        Student s2 = new Student(7980, "Simran", new int[] {100, 95, 94, 87, 75});
        System.out.println(s2.getRoll());

        Student s3 = new Student(1078, "Drishti", new int[] {80, 87, 98, 90, 95});
        System.out.println(Arrays.toString(s3.getMarks()));

        // While doing SHALLOW COPY if we will make a single marks[] array for all objects then while doing any changes in the array each object's marks will be changed whereas in DEEP COPY this does not happen.

        // DEEP COPY

        int[] marks = {90,98,89,90,80};
        Student s4 = new Student(798, "Sushant", marks);
        System.out.println(Arrays.toString(s4.getMarks()));

        Student s5 = new Student(s4);
        System.out.println(Arrays.toString(s5.getMarks()));

        s4.marks[4] = 100;
        System.out.println(Arrays.toString(s4.getMarks()));
        System.out.println(Arrays.toString(s5.getMarks()));
         
    }
}