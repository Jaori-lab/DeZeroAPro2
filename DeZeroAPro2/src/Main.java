
public class Main {

	public static void main(String[] args) {
	// System.out.println("Does this shit works ???");
		
		for(Langage l : Langage.values()) {
			if(Langage.Javascript.equals(l)) {
				System.out.println("I really love JAVASCRIPT !!");
			}
			else if(Langage.Python.equals(l)) {
				System.out.println("I'm going to learn that one too !!!");
			}
			else {
				System.out.println(l.toString());
			}
		}
		
		
	}

}
