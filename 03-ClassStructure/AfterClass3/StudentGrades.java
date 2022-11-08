
public class StudentGrades{
    static String studentName;
    static double[] grades;
    static int number;
    static double lowest;
    static double highest;
    static double average;

    StudentGrades(String name, double[] oceny) {
        studentName = name;
        grades = grades;
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
    
    public static void displayRecord(){
        System.out.println("name: "+studentName);
        System.out.println("grades: "+grades);
        System.out.println("number of grades: "+number);
        System.out.println("lowest grade: "+lowest);
        System.out.println("highest grade: "+highest);
        System.out.println("grade point average: "+average);
    }
    
    public static void main(String[] args){
        double[] args1={3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        double[] args2={2.0, 3.0, 2.0, 4.5, 4.5};
        
        StudentGrades s1 = new StudentGrades("Amanda", args1);
        StudentGrades s2 = new StudentGrades("James", args2);
        
        s1.displayRecord();
        s2.displayRecord();
    }
}
