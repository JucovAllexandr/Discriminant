import java.util.ArrayList;

public class QuadEquation {
    // ax^2+bx+c = 0
    double disc;
    double x1,x2;

    public ArrayList<Double> rezEquation(float a, float b, float c){
        disc = b*b-4*a*c;
            if (disc < 0)
                System.out.println("Нет корней");
            else if (disc == 0) {
                x1 = -b/2*a;
            } else {
                x1 = (-b+Math.sqrt(disc))/2*a;
                x2 = (-b-Math.sqrt(disc))/2*a;
            }
        ArrayList<Double> rez = new ArrayList<Double>();
            rez.add(1,x1);
            rez.add(2,x2);
        return rez;
    }
}
