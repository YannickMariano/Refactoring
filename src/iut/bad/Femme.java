package iut.bad;

public class Femme extends Humain{
	
	public Femme(String string, String string2, int i) {
		super(string, string2, i);
	}

	public String toString() {
	    return "Nom: " + nom + ", Prénom: " + prenom + ", Age: " + age;
	}
	
	public static void main(String[] args) {
		Homme h = new Homme("Dupont", "Jean", 30);
	    Femme f = new Femme("Martin", "Sophie", 28);
	    
	    
	    h.ami(f);
	}
    
}
