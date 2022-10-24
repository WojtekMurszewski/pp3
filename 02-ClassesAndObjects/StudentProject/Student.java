public class Student {
    
    // Class attributes
    String name;
    int age;
    String studentID;
    boolean isValid;
    int semester;
    double averageGrade;
    
    // Class methods
    public void sayHello() {
        System.out.println("Hello!");
    }
    
    public void displayName() {
        System.out.println("Student's name is " + name + ".");
    }
    
    public void displayAge() {
        System.out.println("Student's age is " + age + ".");
    }

    public void displaySemesterNumber() {
        System.out.println("Student is on the semester number " + semester + ".");
    }
    
    public void displayAverageGrade() {
        System.out.println("Student's average grade is " + averageGrade + ".");
    }
    
    public void displayStudentID() {
        System.out.println("Is student's ID \"" + studentID + "\" valid? " + isValid);
    }
    
    public void displayBatch1() {
        sayHello();
        displayName();
        displayAge();
    }
    
    public void changeIsValid() {
        isValid = !isValid;
    }
    
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Paul";
        student1.age = 23;
        student1.studentID = "234232523";
        student1.isValid = true;
        student1.semester = 5;
        student1.averageGrade = 2.74;
        
        student1.displayName();
        student1.displayAge();
        student1.displaySemesterNumber();
        student1.displayAverageGrade();
        student1.displayStudentID();
        student1.displayBatch1();
        student1.changeIsValid();
    }
}
