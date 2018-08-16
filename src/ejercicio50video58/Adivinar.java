
package ejercicio50video58;

import java.util.*;
import javax.swing.JOptionPane;

public class Adivinar {
    
    public void ejer(){
        
        Scanner entrdad = new Scanner(System.in);
        
        float guillermo,luis,juan,total;
        
        guillermo = Float.parseFloat(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE DINERO QUE TIENE GUILLERMO"));
        
        luis = guillermo / 2;
        
        juan = (guillermo+luis)/2;
        
        total = guillermo+luis+juan;
        
        JOptionPane.showMessageDialog(null,"DIGITE LA CANTIDAD DE DINERO ENTRE LOS 3 es: " + total);
        
    }
    
}
