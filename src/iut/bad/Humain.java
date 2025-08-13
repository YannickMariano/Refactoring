package iut.bad;

public class Humain {
	
	public String nom;
	public String prenom;
	public int age;
    
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Humain() {
		super();
	}

	public void details() {
	    System.out.println(toString());
	}
	
	public void manger() {
	    
	}

	public void boire() {
	   
	}	


}
