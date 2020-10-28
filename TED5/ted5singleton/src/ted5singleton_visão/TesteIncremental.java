package ted5singleton_visão;

import ted5singleton.model.*;

public class TesteIncremental {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Singleton object = Singleton.getInstance();
			System.out.println(object.getNumero());

		}

	}
}
