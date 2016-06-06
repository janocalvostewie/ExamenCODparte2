package examenfinalparte2;

import static examenfinalparte2.Metodos.imprimeDatos;
import static examenfinalparte2.Metodos.insertaDatos;
import javax.swing.JOptionPane;

public class Principal {

    public static boolean imprimir = false;

    public static void main(String arg[]) {
        /**
         * Inicialización de las variables, se ponen a 0 ya que
         */
        int digito = 0;

        if (digito <= 0) {
            digito = insertaDatos();
        }
        /**
         * Creación de un bucle
         */
        for (int i = 1; i <= 99999; i++) {
            /**
             * No podemos prescindir de la variable 'auxiliar' ya que de lo
             * contrario, si usásemos 'i', el bucle no sería igual ni el
             * resultado final
             */
            int auxiliar = i;
            /**
             * Se ha eliminado la variable 'contador' ya que era innecesaria.
             * Puesto que se tenía la variable 'ndig' (a la que se le ha
             * cambiado el nombre) y sólo recibía el valor de 'contador'
             */
            int numeroDigito = 0;

            while (auxiliar != 0) {
                auxiliar = auxiliar / 10;
                numeroDigito++;
            }

            /**
             * Comienzan las condicionales que darán valor a la variable
             * 'imprimir' que decidirá si el valor de 'i' se imprime al final o
             * no.
             */
            if (numeroDigito == digito) {
                if (i < 4) {
                    imprimir = true;
                } else if (i % 2 == 0) {
                    imprimir = false;
                } else {
                    int contador1 = 0;
                    int numero1 = 1;
                    int numero2 = (i - 1) / 2;
                    if (numero2 % 2 == 0) {
                        numero2--;
                    }

                    while (numero1 <= numero2) {
                        if (i % numero1 == 0) {
                            contador1++;
                        }
                        numero1 += 2;
                        if (contador1 == 2) {
                            numero1 = numero2 + 1;
                        }
                    }

                    if (contador1 == 1) {
                        imprimir = true;
                    }
                }

                if (imprimir == true) {
                    imprimeDatos(i);
                }
            }
        }
    }

}
