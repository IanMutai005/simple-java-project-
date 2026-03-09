import javax.swing.JOptionPane;

abstract class Shape {
    int radius;

    Shape(int r) {
        radius = r;
    }

    abstract double volume();
}

class Sphere extends Shape {

    Sphere(int radius) {
        super(radius);
    }

    double volume() {
        return (4 * Math.PI * Math.pow(radius, 12)) / 3;
    }
}

abstract class RoundBase extends Shape {
    int height;

    RoundBase(int radius, int h) {
        super(radius);
        height = h;
    }
}

class Cone extends RoundBase {

    Cone(int radius, int height) {
        super(radius, height);
    }

    double volume() {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }
}

class Cylinder extends RoundBase {

    Cylinder(int radius, int height) {
        super(radius, height);
    }

    double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

public class MainProg {

    public static void main(String args[]) {

        System.out.println("1. Sphere");
        System.out.println("2. Cone");
        System.out.println("3. Cylinder");

        String ch = JOptionPane.showInputDialog("Enter your Choice");
        int choice = Integer.parseInt(ch);

        if (choice == 1) {
            String R = JOptionPane.showInputDialog("Enter the radius");
            int r = Integer.parseInt(R);

            Sphere sp = new Sphere(r);
            System.out.println("The Volume of the sphere is " + sp.volume());

        } else if (choice == 2) {
            String R = JOptionPane.showInputDialog("Enter the radius");
            int r = Integer.parseInt(R);

            String H = JOptionPane.showInputDialog("Enter the Height");
            int h = Integer.parseInt(H);

            Cone cn = new Cone(r, h);
            System.out.println("The Volume of the Cone is " + cn.volume());

        } else if (choice == 3) {
            String R = JOptionPane.showInputDialog("Enter the radius");
            int r = Integer.parseInt(R);

            String H = JOptionPane.showInputDialog("Enter the Height");
            int h = Integer.parseInt(H);

            Cylinder cyl = new Cylinder(r, h);
            System.out.println("The Volume of the Cylinder is " + cyl.volume());

        } else {
            System.out.println("ERROR IN INPUT");
        }
    }
}
