package prog.ud12.ejercicios.ej21;

public class Prueba21 {

	public static void main(String[] args) {
		IMusico[] actuacion = new IMusico[10];

		actuacion[0] = new Trompetista();actuacion[0].setNombre("T1");
		actuacion[1] = new Guitarrista();actuacion[1].setNombre("G1");
		actuacion[2] = new Trompetista();actuacion[2].setNombre("T2");
		actuacion[3] = new BandaDeTrompetas();
			actuacion[3].setNombre("La superbanda");
			Guitarrista g1= new Guitarrista();g1.setNombre("Pepe");
			Trompetista t1 = new Trompetista();t1.setNombre("Manuel");
			Guitarrista g2= new Guitarrista();g2.setNombre("Juan");
			((IBanda)actuacion[3]).addMusico(g1);
			((IBanda)actuacion[3]).addMusico(g2);
			((IBanda)actuacion[3]).addMusico(t1);
		actuacion[4] = new BandaDeSolistas();
			actuacion[4].setNombre("La megabanda");
			((IBanda)actuacion[4]).addMusico(new Trompetista());
			((IBanda)actuacion[4]).addMusico(actuacion[3]);
		
		
		
		for (int i = 0; i < 10; i++) {
			if (actuacion[i] != null) {
				System.out.println("======== ACTUACIÓN "+(i+1)+" =============");
				actuacion[i].tocar();
			}
		}

	}

}
