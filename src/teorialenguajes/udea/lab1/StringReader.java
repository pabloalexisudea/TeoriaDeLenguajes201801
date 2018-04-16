package teorialenguajes.udea.lab1;

import java.util.Stack;

import javax.swing.JOptionPane;

import teorialenguajes.udea.lab1.model.AutomataPila;

public class StringReader {
	char primeroPila = ' ';
	char caracter, caracterPila;
	String nombreTransicion;
	String accion;
	int primerEstado = 0;
	Stack<Character> pila = new Stack<Character>();
	String cadena;
	AutomataPila automata;

	public void leerCadena(AutomataPila automata, String cadena) {
		this.cadena = cadena;
		this.automata = automata;
		
		//Llenamos la pila con la configuración inicial
		for (int p= 0; p<automata.getConfiguracionInicialPila().length; p++) {
			pila.push(automata.getConfiguracionInicialPila()[p]);
		}
		// Identificamos cual es el primer estado en la pila
		for(; primerEstado<automata.getEstados().length; primerEstado++) {
			if(automata.getInicial().getNombre()== automata.getEstados()[primerEstado].getNombre()) {
				nombreTransicion(primerEstado);
			}
		}
	}

	public void nombreTransicion(int primerEstado) {
	
	//Capturamos la cadena y sacamos el primer caracter
	for(int i = 0; i<cadena.length(); i++) {
		caracter = cadena.charAt(i);
		
		System.out.println(caracter);
		
		//Comparamos este caracter con alguno de los simbolos de entrada
		for(int j = 0; j<automata.getSimbolosEntrada().length; j++) {
			if(caracter == automata.getSimbolosEntrada()[j]) {
				
			//Desapilamos un simbolo y lo comparamos con el simbolo de la pila
			caracterPila = pila.pop();
			for(int k = 0; k<automata.getSimbolosPila().length; k++) {
				if(caracterPila == automata.getSimbolosPila()[k]) {
					nombreTransicion = automata.getEstados()[primerEstado].getTransiciones()[k][j];
					pila.push(caracterPila);
					
			//Recorremos las transiciones y comparamos cual tiene el mismo nombre que la que capturamos
				for(int z= 0; z < automata.getTransiciones().size(); z++) {
					if(nombreTransicion.equals(automata.getTransiciones().get(z).getNombre())) {
						
						accion =  automata.getTransiciones().get(z).getOperacionEnPila();
						System.out.println(pila.size());
						System.out.println(accion);
						if(accion.substring(0, 5).equals("apile")) {
							pila.push(caracter);
							System.out.println("Apilado");
						}else if(accion.length()==8) {
							pila.pop();
							System.out.println("Desapilado");
						}else if(accion.equals("Acepte")) {
							JOptionPane.showMessageDialog(null, "Secuencia con estado aceptado");
						}else {
							JOptionPane.showMessageDialog(null, "Secuencia con estado rechazado");
						}
					}
				}
				
			}
			}
		}
		}
	}
}

}


		
	
