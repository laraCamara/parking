package parkingeje1;

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

        while ((nplaza < plazas.length) & !encontrado) {
            if (plazas[nplaza].equals("libre")) {
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
            plazas[nplaza]= "OCUPADO";
            System.out.println("La plaza asignada es: \t "+nplaza);
        }
    }
}
