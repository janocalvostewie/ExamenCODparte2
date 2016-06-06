
package examenfinalparte2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Metodos {
    
    /**
     * Método de inserción de datos
     * @return 
     */
    public static int insertaDatos(){
    int digito = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese como parámetro,\n un numero de digitos correcto\n (mayor que 0): "));
    return digito;
    }
    
    /**
     * Método para imprimir datos por pantalla
     * @param variable dato que aparecerá por pantalla
     */
    public static void imprimeDatos(int variable){
       System.out.println(variable);
    }
}
