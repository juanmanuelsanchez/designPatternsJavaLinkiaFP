package ejerciciosLibro.patronesCreacionales.fabricaAbstracta;

public class AvanzadoAdslBuilder extends AdslBuilder{
	public void buildReuter() {
		adsl.setReuter("Dlink DSL-3785");
	}
	public void buildVelocidad() {
		adsl.setVelocidad(15);
	}
}