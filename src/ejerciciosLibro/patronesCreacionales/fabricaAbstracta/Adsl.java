package ejerciciosLibro.patronesCreacionales.fabricaAbstracta;

public class Adsl {
	private String reuter;
	private int velocidad;
	
	public void setReuter(String reuter) {
		this.reuter = reuter;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
		
	}
	public String toString() {
		return reuter + velocidad;
		
	}
	public static void main(String[] args) {
		String reuter = args[0];
		int velocidad = Integer.parseInt(args[1]);
		Adsl myAdsl = new Adsl();
		myAdsl.setReuter(reuter);
		myAdsl.setVelocidad(velocidad);
		System.out.println(myAdsl);
	}
}
