/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcarea;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdullatif
 */
public class CalcArea {
 
    public static double calc_area(double Length, double Width)
    {
       double area;
       area = Length*Width;
       return(area);    
    }
    
        public static double calc_perimeter(double Length, double Width)
    {
       double perArea;
       perArea = 2*(Length+Width);
       return(perArea);    
    }
        
       public static double calc_diagonal(double Length, double Width)
    {
       double diagonalArea;
       diagonalArea = (Math.sqrt(Math.pow(Length,2)+ Math.pow(Width,2)));
       return(diagonalArea);    
    }
    public static void main(String[] args) {
        double Length,Width;
        double areaResult, permiterResult,diagonalResult;
        Length= Double.parseDouble(JOptionPane.showInputDialog("Enter the Lenght="));
        Width=  Double.parseDouble(JOptionPane.showInputDialog("Enter the Width="));
        areaResult = calc_area(Length, Width);
        permiterResult = calc_perimeter(Length, Width);
        diagonalResult = calc_diagonal(Length, Width);
        JOptionPane.showMessageDialog(null, "The Area="+areaResult+"\n The Permiter="+permiterResult+"\n The Diagonal="+diagonalResult);
                
    }
    
}

