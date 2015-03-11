package prog.ud11.ejercicios.ej08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PruebaPadres {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Persona abuelo = new Persona(0, "abuelo");
		Persona padre = new Persona(1, "padre",100, abuelo);
		Persona hijo = new Persona(2, "hijo", 100, padre);
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("src/prog/ud11/ejercicios/ej08/dat/padres.srl")
				);
		oos.writeObject (abuelo);
		oos.writeObject (padre);
		oos.writeObject (hijo);
		oos.writeObject("PEPITO");
		oos.writeObject (hijo);
		
		oos.close();
		
		Persona abuelo2, padre2, hijo2;
		
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("src/prog/ud11/ejercicios/ej08/dat/padres.srl")
				);
		abuelo2 = (Persona)(ois.readObject());
		padre2 = (Persona)(ois.readObject());
		hijo2 = (Persona)(ois.readObject());
		String miString = (String)(ois.readObject());
		ois.readObject();
		
		System.out.println(hijo2.getPadre().getPadre().getNombre());
		System.out.println(miString);
		ois.close();
		
	}

}
