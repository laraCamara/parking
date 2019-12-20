package parkingeje1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lara
 */
public class Parking {

    String[] plazas;

    public Parking() {

        plazas = new String[100];
    }

    public Parking(int numeroPlazas) {
        plazas = new String[numeroPlazas];
        //este constructor es solo para que hagamos una prueba para no tener que meter 100 valores
    }

    public void inicializarPlazas() {
        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {
            plazas[nplaza] = "LIBRE";
        }
    }

    public void estadoParking() {
        int nplaza;

        System.out.println("Nº plaza Estado ");
        for (nplaza = 0; nplaza < plazas.length; nplaza++) {
            System.out.println(nplaza + "\t - \t" + plazas[nplaza]);
        }
    }
/**
 * Búsqueda secuencial. Encuentra el primer valor igual a libre. 
 * @return  posición donde se encuentra el primer valor igual a libre, -1 en caso contrario. 
 */
    public int busquedaSecuencial() {
        int nplaza = 0;
        boolean encontrado = false;

        while ((nplaza < plazas.length) && !encontrado) {
            if (plazas[nplaza].equalsIgnoreCase("libre")) {
                encontrado = true;
            } else {
                nplaza++;
            }
        }
        if (!encontrado) {
            nplaza = -1;
        }
        return nplaza;
    }
    public void entrada(){
        int nplaza;
        nplaza = busquedaSecuencial ();
        
        if (nplaza==-1){
            System.out.println("PARKING COMPLETO");
            
        }
        else {
            plazas[nplaza]= "OCUPADA";
            System.out.println("La plaza asignada es: \t "+nplaza);
        }
    }
     public float pedirNumero(String mensaje, int linferior, int lsuperior) {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        float numero = 0;
        try {
            boolean bien = false;
            while (!bien) {
                try {
                    System.out.println(mensaje);
                    numero = Float.parseFloat(teclado.readLine());
                    if (numero < linferior | numero > lsuperior) {

                        System.out.println("ERROR: el número  no es correcto");
                    } else {
                        bien = true;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("El valor introducido no es un número");
                }//catch 
            }//while
        } catch (IOException ex) {
        }
        return numero;
    }
     
     public void Salida (){
         int nplaza;
        Parking n = new Parking ();
         nplaza= (int) n.pedirNumero ("plaza que estaba ocupada: ",0,plazas.length-1);
         if (plazas [nplaza].equalsIgnoreCase("OCUPADA"))
                 {
             plazas [nplaza] = "LIBRE";
         }
         else {
             System.out.println("Esa plaza ya estaba libre");
         }
                 
     }
}
