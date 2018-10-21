package ejerciciosLibro.patronesCreacionales.Singleton;

public class Singleton {
	
	private static Singleton _singleton;
	//Hacemos el constructor privado para eludir el uso de "new".
	private Singleton() {}
	
	public static Singleton getSingleton() {
		// Inicialización diferida.
		if(_singleton == null) {
			_singleton = new Singleton();
			System.out.println("Se ha creado una instancia Singleton");
		}
		return _singleton;
	}
}

