public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(2, 4);
        double radius = myCylinder.getRadius();
        double height = myCylinder.getHeight();
        myCylinder.setRadius(2);
        myCylinder.setHeight(8);
        double surfaceArea = myCylinder.getSurfaceArea();
        System.out.println("Surface area: " + surfaceArea);

    }
}
