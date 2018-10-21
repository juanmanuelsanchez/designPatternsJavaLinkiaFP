package ejerciciosLibro.patronesCreacionales.Singleton;

public class Prueba {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		if(s1 == s2) {
			System.out.println("Es el mismo objeto");
			}
		}
}
