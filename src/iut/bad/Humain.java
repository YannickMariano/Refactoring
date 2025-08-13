package iut.bad;

public class Humain {
	
	private String nom;
    private String prenom;
    private int age;
    
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Humain() {
		super();
	}
	
	@Override
	public String toString() {
	    return "Nom: " + nom + ", Prénom: " + prenom + ", Age: " + age;
	}

	public void details() {
	    System.out.println(toString());
	}


}
