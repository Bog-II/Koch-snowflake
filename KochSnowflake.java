import java.awt.*;
import java.lang.Math;

/**
 * KochSnowflake
 */
public class KochSnowflake {


    /**
     * This function prints the pattern
     * 
     * @param xA 
     * @param yA 
     * @param xB
     * @param yB
     * @param n Precision of the pattern
     */
    public static void afficherMotif(double xA, double yA, double xB, double yB, int n) {

        if (n == 0) {

            StdDraw.line(xA, yA, xB, yB);

        } else {
            
            // Calcul des Coordonnées des points C, D, E
            
            double xC = (xB - xA)/3 + xA;
            double yC = (yB - yA)/3 + yA;
            
            double xD = 2 * xC - xA ;
            double yD = 2 * yC - yA;

            double xE = (xD - xC) * Math.cos(Math.PI/3) - (yD - yC) * Math.sin(Math.PI/3) + xC;
            double yE = (xD - xC) * Math.sin(Math.PI/3) + (yD - yC) * Math.cos(Math.PI/3) + yC;

            afficherMotif(xA, yA, xC, yC, n-1);
            afficherMotif(xC, yC, xE, yE, n-1);
            afficherMotif(xE, yE, xD, yD, n-1);
            afficherMotif(xD, yD, xB, yB, n-1);

        }

    }

    public static void main(String[] args) {

        StdDraw.setXscale(00.00, 2); 
        StdDraw.setYscale(00.00, 2); 

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.002);


        // ==== Decomment below for taking parameters in console ====
       
        // double xA = Double.parseDouble(args[0]);
        // double yA = Double.parseDouble(args[1]);
        // double xB = Double.parseDouble(args[2]);
        // double yB = Double.parseDouble(args[3]);
        // int n = Integer.parseInt(args[4]);
        
        // afficherMotif(xA, yA, xB, yB, n);
        
        // ==== Decomment above for taking parameters in console ====

        // Example
        afficherMotif(1.61, 1.62, 0.95, 0.48, 5);
        afficherMotif(0.39, 1.62, 1.61, 1.62, 5);
        afficherMotif(0.95, 0.48, 0.39, 1.62, 5);
        
        // Other cool patterns
        // afficherMotif(0.63, 1.61, 0.95, 0.48, n);
        // afficherMotif(0.63, 1.61, 1.77, 1.32, n);
        // afficherMotif(0.95, 0.48, 1.77, 1.32, n);

        // afficherMotif(0.95, 0.48, 1.61, 1.62, n);
        // afficherMotif(1.61, 1.62, 0.39, 1.62, n);
        // afficherMotif(0.39, 1.62, 0.95, 0.48, n);


    }
}
