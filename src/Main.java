public class Main {
    public static final int X1 = 50;
    public static final int Y1 = 10;
    public static final int X2 = 2;
    public static final int Y2 = 6;
    public static final int X3=2;
    public static final int Y3=6;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparsion Program");
        System.out.println("Starting point is:-(" + X1 + "," + Y1 + ")");
        int firstLineLength = 0;
        firstLineLength = (int)Math.sqrt(((X1 - X2) * (X1 - X2)) + ((Y1 - Y2) * (Y1 - Y2)));
        int secondLineLength=0;
        secondLineLength=(int)Math.sqrt(((X1 - X3) * (X1 - X3)) + ((Y1 - Y3) * (Y1 - Y3)));
        Integer a=new Integer(firstLineLength);
        Integer b=new Integer(secondLineLength);
        System.out.println(a.equals(b));
    }
}