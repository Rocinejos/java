package prog.ud12.ejercicios.ej20;

public class Prueba20 {

	public static void main(String[] args) {
		IMusico[] actuacion = new IMusico[10];

		actuacion[0] = new Trompetista();actuacion[0].setNombre("T1");
		actuacion[1] = new Guitarrista();actuacion[1].setNombre("G1");
		actuacion[2] = new Trompetista();actuacion[2].setNombre("T2");
		actuacion[3] = new Banda();
			actuacion[3].setNombre("La superbanda");
			Guitarrista g1= new Guitarrista();g1.setNombre("Pepe");
			Guitarrista g2= new Guitarrista();g2.setNombre("Juan");
			((Banda)actuacion[3]).addMusico(g1);
			((Banda)actuacion[3]).addMusico(g2);
		actuacion[4] = new Banda();
			actuacion[4].setNombre("La megabanda");
			((Banda)actuacion[4]).addMusico(new Trompetista());
			((Banda)actuacion[4]).addMusico(actuacion[3]);
		
		
		
		for (int i = 0; i < 10; i++) {
			if (actuacion[i] != null) {
				System.out.println("======== ACTUACIÓN "+(i+1)+" =============");
				actuacion[i].tocar();
			}
		}

	}

}
