package ejerciciosLibro.patronesCreacionales.fabricaAbstracta;

public class Montador {
	private AdslBuilder adslBuilder;
	
	public void setAdslBuilder(AdslBuilder ab) {
		adslBuilder = ab;
	}
	public Adsl getAdsl() {
		return adslBuilder.getAdsl();
	}
	public void construirAdsl() {
		adslBuilder.crearNuevaAdsl();
		adslBuilder.buildReuter();
		adslBuilder.buildVelocidad();
	}
}
