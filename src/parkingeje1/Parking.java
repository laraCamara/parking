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

}
