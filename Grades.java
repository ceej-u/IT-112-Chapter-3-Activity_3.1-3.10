//Urbano, Chrisitan James E. 
//BSIT-NS/1st Year/1-1i
mport java.util.Scanner;

public class Grades 
{
    public static void main(String[] args) 
    {
        Scanner ES = new Scanner(System.in);
        String score;
        char grade;

        System.out.print("Enter Your Score : ");
        score = ES.next();
        int scores = Integer.parseInt(score);

        if (scores >= 90)
            grade = 'A';
        else if (scores >= 80)
            grade = 'B';
        else if (scores >= 70)
            grade = 'C';
        else if (scores >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Score = " + score);
        System.out.println("Grade = " + grade);
    }
}
