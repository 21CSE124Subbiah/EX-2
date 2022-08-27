class circle
{
    double radius;
    String c;
    private double r=1.0;
    private String colour="Red";
    circle()
    {
         radius=r;
         String c=colour;
    }
    circle(double rad)
    {
         radius=rad;
    }
    double getRadius()
    {
        return radius;
    }
    double getArea()
    {
        return (3.14*radius*radius);
    }
    
}
        
public class circle1 
{
    public static void main(String[] args)
    {
        circle c=new circle();
        System.out.println("Radius of the circle with default value\t"+c.getRadius());
        System.out.println("Area of the circle with default value\t"+c.getArea());
        circle c1=new circle(4);
        System.out.println("Radius of the circle with passed value\t"+c1.getRadius());
        System.out.println("Area of the circle with passed value\t"+c1.getArea());    
    }
}
