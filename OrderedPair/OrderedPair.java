
/**
 * AP CSA Problem Set 2B
 * Angela Chen
 * September 21st, 2023
 */

public class OrderedPair {

    double x, y; //Instance Variables

    public OrderedPair() { //Constructor 1
        x = 0.0;
        y = 0.0;
    }

    public OrderedPair(double _x, double _y) { //Constructor 2
        x = _x;
        y = _y;

    }

    //Behaviour Methods
    public String toString() {
        return x + ", " + y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}


