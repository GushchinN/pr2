public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius){
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Circle(){
        this.center = new Point();
        this.radius = 1;
    }

    public Point getCenter(){return center;}
    public void setCenter(Point center){this.center = center;}
    public double getRadius(){return radius;}
    public void setRadius(double radius){this.radius = radius;}

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getLength(){
        return 2 * Math.PI * radius;
    }

    public int compare(Circle other){
        if(this.radius > other.radius) return 1;
        if(this.radius < other.radius) return -1;
        return 0;
    }

    @Override
    public String toString(){
        return "Circle{" + "центр = " + center + ", радиус = " + radius + "}";
    }
}
