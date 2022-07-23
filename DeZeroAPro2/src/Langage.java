
public enum Langage {
Java ("Langage Java"),
Javascript ("Langage Javascript"),
Php ("Langage Php"),
Python ("Langage Python"),
Css ("Langage Css"),
Html ("Langage Html");

private String name = "";	
	
Langage(String name) {
	this.name = name;
}

public String toString() {
	return name;
}
}
