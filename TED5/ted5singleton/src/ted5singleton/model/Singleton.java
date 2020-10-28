package ted5singleton.model;

public class Singleton {
	private static int count = 0;
	private int numero;

	private static Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();

		}return instance;
	}

	private Singleton() {
		numero = ++count;
	}

	public String toString() {
		return "Incremental " + numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}