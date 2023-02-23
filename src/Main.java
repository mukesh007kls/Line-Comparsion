public class Main {
    public static final int X1 = 0;
    public static final int Y1 = 10;
    public static final int X2 = 1;
    public static final int Y2 = 6;
    public static final int X3=2;
    public static final int Y3=5;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparsion Program");
        System.out.println("Starting point is:-(" + X1 + "," + Y1 + ")");
        double firstLineLength = 0;
        firstLineLength = Math.sqrt(((X1 - X2) * (X1 - X2)) + ((Y1 - Y2) * (Y1 - Y2)));
        double secondLineLength=0;
        secondLineLength=Math.sqrt(((X1 - X3) * (X1 - X3)) + ((Y1 - Y3) * (Y1 - Y3)));
        Double a=new Double(firstLineLength);
        Double b=new Double(secondLineLength);
        if (a>b){
            System.out.println("Length of First line is greater:-"+firstLineLength+" "+secondLineLength);
        }else if(a<b){
            System.out.println("Length of second line is greater:-"+firstLineLength+" "+secondLineLength);
        }else{
            System.out.println("Both the lengths are equal:-"+firstLineLength+" "+secondLineLength);
        }
    }
}