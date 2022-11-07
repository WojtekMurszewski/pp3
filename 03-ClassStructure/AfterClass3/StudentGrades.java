
public class StudentGrades{
    String studentName;
    double[] grades;
    static int number;
    static double lowest;
    static double highest;
    static double average;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    
    public static void lowestGrade(double[] grades){
        double lowest=grades[0];
        for (int i=0; i<=grades.length-2;i++){
            if (grades[i+1]<grades[i]){
                lowest=grades[i+1];
            }
        }
        System.out.println(lowest);
    }
    
    public static void highestGrade(double[] grades){
        double highest=grades[0];
        for (int i=0; i<=grades.length-2;i++){
            if (grades[i+1]>grades[i]){
                highest=grades[i+1];
            }
        }
        System.out.println(highest);
    }
    
    public static void numberOfGrades(double[] grades){
        int number=0;
        for (int i=0; i<=grades.length-1;i++){
            number+=1;
        }
        System.out.println(number);
    }
    
    public static void graidAverage(double[] grades){
        double sum=0;
        for (int i=0; i<=grades.length-1;i++){
            sum+=grades[i];
        }
        int number=0;
        for (int i=0; i<=grades.length-1;i++){
            number+=1;
        }
        double result = sum/number;
        System.out.println(result);
    }
    
    public void displayRecord(){
        System.out.println("name: "+studentName);
        System.out.println("grades: "+grades);
        System.out.println("number of grades: "+number);
        System.out.println("lowest grade: "+lowest);
        System.out.println("highest grade: "+highest);
        System.out.println("grade point average: "+average);
    }
    
    public static void main(String[] args){
        StudentGrades s1 = new StudentGrades("Amanda", args1);
        StudentGrades s2 = new StudentGrades("James", args1);
        
        s1.displayRecord();
        s2.displayRecord();
    }
}
