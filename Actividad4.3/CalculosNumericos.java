package actividad4.pkg3;

import java.util.*;
import javax.swing.JOptionPane;

public class CalculosNumericos {
    
    static double calcularLogaritmoNeperiano(double valor){
        double resultado = 0;
        
        try {
            if (valor <= 0) {
                throw new ArithmeticException("El valor debe ser un numero positivo");
            }
            resultado = Math.log(valor);
            JOptionPane.showMessageDialog(null, "Resultado; " + resultado, "Calculo exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "El valor debe ser positivo", "Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        return resultado;
    }
    
static double calcularRaizCuadrada(double valor){

    double resultado = 0;

    try {

        if (valor < 0) {
            throw new ArithmeticException("El valor debe ser positivo");
        }

        resultado = Math.sqrt(valor);

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado,"Cálculo exitoso",JOptionPane.INFORMATION_MESSAGE);

    } catch (ArithmeticException e){

        JOptionPane.showMessageDialog(null, "El valor debe ser positivo para calcular la raíz cuadrada","Error",JOptionPane.ERROR_MESSAGE);
    } catch (InputMismatchException e) {
        JOptionPane.showMessageDialog(null, "El valor debe ser numerico", "Ingreso un dato malo", JOptionPane.ERROR_MESSAGE);
    }

    return resultado;
}
}
