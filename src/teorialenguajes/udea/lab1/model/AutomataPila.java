package teorialenguajes.udea.lab1.model;

import java.util.List;

/**
 *
 * @author edale
 */
public class AutomataPila {
    private char[] simbolosEntrada;
    private char[] simbolosPila;
    private Estado[] estados;
    private Estado inicial;
    private char[] configuracionInicialPila;
    private List<Transicion> transiciones;

    // CONTRUCTOR
    public AutomataPila(char[] simbolosEntrada, char[] simbolosPila, Estado[] estados, Estado inicial, char[] configuracionInicialPila, List<Transicion> transiciones) {
        this.simbolosEntrada = simbolosEntrada;
        this.simbolosPila = simbolosPila;
        this.estados = estados;
        this.inicial = inicial;
        this.configuracionInicialPila = configuracionInicialPila;
        this.transiciones = transiciones;
    }

    public char[] getSimbolosEntrada() {
        return simbolosEntrada;
    }

    public void setSimbolosEntrada(char[] simbolosEntrada) {
        this.simbolosEntrada = simbolosEntrada;
    }

    public char[] getSimbolosPila() {
        return simbolosPila;
    }
    
    public char getSimboloPila(int index) {
        return simbolosPila[index];
    }
    

    public void setSimbolosPila(char[] simbolosPila) {
        this.simbolosPila = simbolosPila;
    }

    public Estado[] getEstados() {
        return estados;
    }

    public void setEstados(Estado[] estados) {
        this.estados = estados;
    }

    public Estado getInicial() {
        return inicial;
    }

    public void setInicial(Estado inicial) {
        this.inicial = inicial;
    }

    public char[] getConfiguracionInicialPila() {
        return configuracionInicialPila;
    }

    public void setConfiguracionInicialPila(char[] configuracionInicialPila) {
        this.configuracionInicialPila = configuracionInicialPila;
    }

    public List<Transicion> getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(List<Transicion> transiciones) {
        this.transiciones = transiciones;
    }
    
    
}
