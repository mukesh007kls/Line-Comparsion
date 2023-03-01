import java.util.Scanner;

public class Line_Computation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparsion Program");
        System.out.println("First line:-");
        Line_Computation lc1=new Line_Computation();
        double firstLineLength = lc1.length_Of_Line();

        System.out.println("Second line:-");
        Line_Computation lc2=new Line_Computation();
        double secondLineLength= lc2.length_Of_Line();

        Double a=new Double(firstLineLength);
        Double b=new Double(secondLineLength);

        System.out.println();
        System.out.println("Length of first line:- "+firstLineLength+"\n Length of second line:- "+secondLineLength);

        int choice=a.compareTo(b);
        switch (choice){
            default:
                System.out.println("Equal");
                break;
            case 1:
                System.out.println("First line greater");
                break;
            case -1:
                System.out.println("Second line is greater");
                break;
        }
    }
    double length_Of_Line(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting Point values:- ");
        int x1= sc.nextInt();
        int y1= sc.nextInt();

        System.out.println("Enter the end point values:-");
        int x2= sc.nextInt();
        int y2= sc.nextInt();

        double length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length of the line is:-"+length);

        return length;
    }
}