package prog.ud11.ejercicios.ej07;

public class PruebaPadres {

	
	public static void main(String[] args) {
		Persona abuelo = new Persona(0, "abuelo");
		Persona padre = new Persona(1, "padre",abuelo);
		Persona hijo = new Persona(2, "hijo", padre);
		
		System.out.println(hijo.getPadre().getPadre().getNombre());
		
	}

}
