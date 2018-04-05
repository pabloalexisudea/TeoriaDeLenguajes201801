package teorialenguajes.udea.lab1.model;

/**
 *
 * @author edale
 */
public class Transicion {
    
    private String nombre;
    private String operacionEnPila;
    private String operacionDeEstado;
    private String operacionDeEntrada;

    // CONTRUCTOR
    public Transicion(String nombre, String operacionEnPila, String operacionDeEstado, String operacionDeEntrada) {
        this.nombre = nombre;
        this.operacionEnPila = operacionEnPila;
        this.operacionDeEstado = operacionDeEstado;
        this.operacionDeEntrada = operacionDeEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOperacionEnPila() {
        return operacionEnPila;
    }

    public String getOperacionDeEstado() {
        return operacionDeEstado;
    }

    public String getOperacionDeEntrada() {
        return operacionDeEntrada;
    }
}
