package ejerciciosLibro.patronesCreacionales.fabricaAbstracta;

public class BasicoAdslBuilder extends AdslBuilder {
	public void buildReuter() {
		adsl.setReuter("DLink T-504");
	}
	public void buildVelocidad() {
		adsl.setVelocidad(12);
	}
}
