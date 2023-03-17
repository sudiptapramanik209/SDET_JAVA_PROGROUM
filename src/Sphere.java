public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return (4.0 * Math.PI * Math.pow(radius, 3))/3.0;
    }


    public static void main(String[] args) {
        Sphere mySphere = new Sphere(3.0);
        double surfaceArea = mySphere.getSurfaceArea();
        double volume = mySphere.getVolume();
        System.out.println(surfaceArea);
        System.out.println(volume);

    }
}
