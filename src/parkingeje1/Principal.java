
package parkingeje1;

/**
 *
 * @author dam
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Parking artesano;
     artesano = new Parking(3);
     artesano.inicializarPlazas();
     artesano.estadoParking();
    }
    
}
