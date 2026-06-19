
package actividad4.pkg2;

import javax.swing.JOptionPane;

public class Vendedor {
    public String nombre;
    public String apellidos;
    public int edad;
    
    Vendedor(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
       
    public void imprimir(){
        
        JOptionPane.showMessageDialog(null, "nombre", "Nombre del vendedor", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "apellido", "Apellido del vendedor", JOptionPane.INFORMATION_MESSAGE);         
        JOptionPane.showMessageDialog(null, "edad", "Edad del vendedor", JOptionPane.INFORMATION_MESSAGE);        
    }
    
    public int verificarEdad(int edad){
        if (edad < 18){
        JOptionPane.showMessageDialog(null, "Edad registrada con exito: " + edad);
        return edad;
        }
        else {
                JOptionPane.showMessageDialog(null, "La edad no puede ser negativa ni mayor a 120",
                        "Error de Rango",
                        JOptionPane.INFORMATION_MESSAGE);
             return -1;
        }
       
        
}
}
    

