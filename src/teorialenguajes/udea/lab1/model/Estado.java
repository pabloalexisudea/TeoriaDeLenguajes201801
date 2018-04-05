package teorialenguajes.udea.lab1.model;

/**
 *
 * @author edale
 */
public class Estado {
    
    private String nombre;
    private boolean esInicial;
    private String[][] transiciones;

    // CONTRUCTOR
    public Estado(String nombre, boolean esInicial, String[][] transiciones) {
        this.nombre = nombre;
        this.esInicial = esInicial;
        this.transiciones = transiciones;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEsInicial() {
        return esInicial;
    }

    public String[][] getTransiciones() {
        return transiciones;
    }

}
