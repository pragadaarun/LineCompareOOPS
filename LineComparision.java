public class LineComparision{
 
    double x1, x2, y1, y2, x3, x4, y3, y4;
    double lineOneLength, lineTwoLength;

    // method for line1
    public double lineOneCal(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);

        lineOneLength = Math.sqrt(x + y);
        return lineOneLength;
    }
    
    // method for line2
    public double lineTwoCal(double x3, double x4, double y3, double y4) {
        this.x3 = x3;
        this.x4 = x4;
        this.y3 = y3;
        this.y4 = y4;
        double x = Math.pow((x4 - x3), 2);
        double y = Math.pow((y4 - y3), 2);

        lineTwoLength = Math.sqrt(x + y);
        return lineTwoLength;
    }

    public static void main(String[] args) {
        LineComparision l = new LineComparision();
        double lengthOne = l.lineOneCal(2, 4, 5, 7);
        double lengthTwo = l.lineTwoCal(4, 6, 9, 11);
        String length1 = String.valueOf(lengthOne);
        String length2 = String.valueOf(lengthTwo);
        double res = length1.compareTo(length2);
        if (res == 0) {
            System.out.println("The Two Lines Are Equal");
        } else if (res > 0) {
            System.out.println("LineOne is greater than LineTwo");

        } else {
            System.out.println("LineTwo is greater than LineOne");
        }
    }
}
