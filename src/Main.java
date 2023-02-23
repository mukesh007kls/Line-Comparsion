public class Main {
    public static final int X1 = 3;
    public static final int Y1 = 10;
    public static final int X2 = 3;
    public static final int Y2 = 9;
    public static final int X3=3;
    public static final int Y3=7;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparsion Program");
        System.out.println("Starting point is:-(" + X1 + "," + Y1 + ")");
        double firstLineLength = 0;
        firstLineLength = Math.sqrt(((X1 - X2) * (X1 - X2)) + ((Y1 - Y2) * (Y1 - Y2)));
        double secondLineLength=0;
        secondLineLength=Math.sqrt(((X1 - X3) * (X1 - X3)) + ((Y1 - Y3) * (Y1 - Y3)));
        Double a=new Double(firstLineLength);
        Double b=new Double(secondLineLength);
        System.out.println(firstLineLength+" "+secondLineLength);
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
}