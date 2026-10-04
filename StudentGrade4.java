//Urbano, Chrisitan James E. 
//BSIT-NS/1st Year/1-1
public class StudentGrade4 
{
    public static void main(String[] args) 
    {
        int grade = 80;

        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
