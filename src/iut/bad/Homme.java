package iut.bad;

public class Homme extends Humain {

	public Homme(String string, String string2, int i) {
		super(string, string2, i);
	}

	public String toString() {
	    return "Nom: " + nom + ", Prénom: " + prenom + ", Age: " + age;
	}
}
