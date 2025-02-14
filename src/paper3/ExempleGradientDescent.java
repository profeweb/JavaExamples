package paper3;

import access.a.A;
import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;
import java.util.function.Function;

public class ExempleGradientDescent extends PApplet {

    GradientDescent gd;
    Function<Double, Double> df;
    ArrayList<PVector> punts;
    double xRef, yRef;
    double minX, minY;

    public static void main(String[] args) {
        PApplet.main("paper3.ExempleGradientDescent", args);
    }

    public void settings(){
        size(1400, 800);
        smooth(10);
    }

    public void setup() {

        df = x -> StrictMath.abs(StrictMath.pow(x, 3)) - ( 3* StrictMath.pow(x, 2)) + x;
        gd = new GradientDescent();
        xRef = 0;
        yRef = 0;
        minX = gd.findLocalMinimum(df, xRef);
        minY = df.apply(minX);

        punts = new ArrayList<>();
        for(double x=-3; x<=3; x+=0.001){
            double y = df.apply(x);
            float mappedX = map((float)x, -3, 3, 10, width-10);
            float mappedY = map((float)y, -10, 10, height-100, 100);
            //println(mappedX, mappedY);
            punts.add(new PVector(mappedX, mappedY));
        }

        println("DONE");
    }

    public void draw(){
        background(255);

        stroke(0); strokeWeight(1);
        line (width/2, 0, width/2, height);
        line (0, height/2, width, height/2);


        for(int i=0; i<punts.size()-1; i++){
            PVector p1 = punts.get(i);
            PVector p2 = punts.get(i+1);
            stroke(0); strokeWeight(2);
            line(p1.x, p1.y, p2.x, p2.y);
        }

        fill(255, 0, 0); stroke(255, 0, 0);
        float mappedXref = map((float)xRef, -3, 3, 10, width-10);
        float mappedYref = map((float)yRef, -10, 10, height-100, 100);

        stroke(255, 0, 0);
        line(mappedXref, 0, mappedXref, height);
        circle(mappedXref, mappedYref, 10);

        float mappedXmin= map((float)minX, -3, 3, 10, width-10);
        float mappedYmin = map((float)minY, -10, 10, height-100, 100);
        fill(0, 0, 255); stroke(0, 0, 255);
        circle(mappedXmin, mappedYmin, 10);
    }

    public void mousePressed(){
        xRef = map(mouseX, 10, width-10, -3, 3);
        yRef = df.apply(xRef);
        minX = gd.findLocalMinimum(df, xRef);
        minY = df.apply(minX);
    }


    public static class GradientDescent {

        private final double precision = 0.000001;

        public double findLocalMinimum(Function<Double, Double> f, double initialX) {

            double stepCoefficient = 0.1;
            double previousStep = 1.0;
            double currentX = initialX;
            double previousX = initialX;
            double previousY = f.apply(previousX);
            int iter = 100;

            currentX += stepCoefficient * previousY;

            while (previousStep > precision && iter > 0) {
                iter--;
                double currentY = f.apply(currentX);
                if (currentY > previousY) {
                    stepCoefficient = -stepCoefficient / 2;
                }
                previousX = currentX;
                currentX += stepCoefficient * previousY;
                previousY = currentY;
                previousStep = StrictMath.abs(currentX - previousX);
            }
            return currentX;
        }
    }
}
