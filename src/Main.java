public class Main {
    public static final int X1 = 50;
    public static final int Y1 = 10;
    public static final int X2 = 2;
    public static final int Y2 = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparsion Program");
        double lineLength = 0;
        lineLength = Math.sqrt(((X1 - X2) * (X1 - X2)) + ((Y1 - Y2) * (Y1 - Y2)));
        System.out.println("Length of line is:-" + lineLength);
    }
}