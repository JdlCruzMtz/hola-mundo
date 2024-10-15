import javax.swing.JOptionPane; 

public class HolaMundo {
    public static void main (String arg[]){
        System.out.println("hola Mundo"); 
        JOptionPane.showMessageDialog(null, "bienvenidos"); 
        Ejemplo2 obj1 = new Ejemplo2();
        System.out.println("Adios " + obj1.capturarDatos());
        
    }
}

class Ejemplo2 {
    public String capturarDatos(){
        String nombre; 
        nombre=JOptionPane.showInputDialog("Escribir tu nombre");
        return nombre; 
    }
}