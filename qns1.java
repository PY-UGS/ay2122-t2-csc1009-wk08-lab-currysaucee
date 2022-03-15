import java.util.*;

class circle_qns1{
    
    private double radius;
    
    circle_qns1(double radius){
        this.radius = radius;
        System.out.println("Circle created of radius:" + radius);
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return (this.radius*this.radius*3.142);
    }
    public double getDiameter(){
        return 2*this.radius;
    }

}

class UserDefinedException extends Exception{ public UserDefinedException(String message){ super(message); } }

public class qns1 {

    public static void main(String[] args) throws UserDefinedException{
        System.out.println("Input radius:");
        Scanner scan = new Scanner(System.in);
        double userInput = scan.nextDouble();
        scan.close();
        if (userInput<0){ 
            throw new IllegalArgumentException("Value is negative");
        }
        else{
            circle_qns1 c = new circle_qns1(userInput);
            double area = c.getArea();
            if(area>1000){
                throw new UserDefinedException("Area is too big....");
            }
            System.out.println("Area of your circle is:"+area);

        }
    }
}
