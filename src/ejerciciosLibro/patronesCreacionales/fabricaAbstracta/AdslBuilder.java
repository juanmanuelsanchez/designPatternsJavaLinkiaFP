package ejerciciosLibro.patronesCreacionales.fabricaAbstracta;

public abstract class AdslBuilder {
	protected Adsl adsl;
	
	public Adsl getAdsl() {
		return adsl;
	}
	public void crearNuevaAdsl() {
		adsl = new Adsl();
	}
	
	public abstract void buildReuter();
	public abstract void buildVelocidad();
}
