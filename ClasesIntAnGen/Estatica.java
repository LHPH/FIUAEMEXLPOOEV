package ClasesIntAnGen;

public class Estatica {

	static class K {
		void g() {
			System.out.println("en g");
		}
	}
        
	public static void main(String[] args) {
		H.I es = new H.I();
		es.y();
		K k = new K();
		k.g();
	}

}

class H {
	static class I {void y() {System.out.println("en y");}}
	/*realmente no es estatica, solo dice que la clase es
	 * un miembro estatico de la clase externa
	 * */
}

