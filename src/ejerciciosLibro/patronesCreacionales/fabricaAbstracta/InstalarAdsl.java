package ejerciciosLibro.patronesCreacionales.fabricaAbstracta;

public class InstalarAdsl {

	public static void main(String[] args) {
		Montador montador = new Montador();
		AdslBuilder basico_adslBuilder = new BasicoAdslBuilder();
		AdslBuilder avanzado_adslBuilder = new AvanzadoAdslBuilder();
		
		montador.setAdslBuilder(avanzado_adslBuilder);
		montador.construirAdsl();

		
		Adsl adsl1 = montador.getAdsl();
		System.out.println(adsl1);
		
		montador.setAdslBuilder(basico_adslBuilder);
		montador.construirAdsl();
		
		Adsl adsl2 = montador.getAdsl();
		System.out.println(adsl2);
		
	}
}
