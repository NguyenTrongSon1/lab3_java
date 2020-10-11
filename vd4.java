package lab3;

class  Circle{
    public double getPI(){
        return 3.14;
    }
}

public class vd4 {
    public void calArea(Circle objPi, double rad){

        double area = objPi.getPI() * rad *rad ;

        System.out.println("Area of is: " +area);
    }

    public static void main(String[] args) {
        vd4 p1 = new vd4();
        p1.calArea(new Circle(),2);
    }

}
