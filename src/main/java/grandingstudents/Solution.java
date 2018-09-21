package grandingstudents;

public class Solution {
    static int[] gradingStudents(int[] grades) {
        if(grades.length < 1){
            return grades;
        }
        int[] newGrades = new int[grades.length];
        for (int i = 0; i < newGrades.length; i++) {
            if (grades[i] < 38){
                newGrades[i] = grades[i];
            }else{
                if(grades[i]%5 >2){
                    newGrades[i] = (grades[i]/5)*5+5;
                }else{
                    newGrades[i] = grades[i];
                }
            }
        }
        return newGrades;
    }

    public static void main(String[] args) {
        int[] array = {73,67,38,33};
        int [] arra = gradingStudents(array);
        for (int i = 0; i < arra.length; i++) {
            System.out.println(arra[i]);
        }
    }
    static int[] gradingStudents2(int[] grades) {
        if(grades.length < 2){
            return grades;
        }
        int[] newGrades = {0,0,0,0};
        newGrades[0] = grades[0];
        for (int i = 1; i < newGrades.length; i++) {
            if (grades[i] < 38){
                newGrades[i] = grades[i];
            }else{
                if(grades[i]%5 >2){
                    newGrades[i] = (grades[i]/5)*5+5;
                }else{
                    newGrades[i] = grades[i];
                }
            }
        }
        return newGrades;
    }
}