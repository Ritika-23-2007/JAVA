package OOPs;
class Student {

        // Instance variables (attributes)
        String name;
        int age;
        String grade;

        // Constructor to initialize the attributes
        public Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        // Method to display student information
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }
    }
public class UserDefinedDataTypes {
   
    public static void main(String[] args) {
        Student student1 = new Student ("Alice", "A");
        student1.displayInfo();
    }
}
