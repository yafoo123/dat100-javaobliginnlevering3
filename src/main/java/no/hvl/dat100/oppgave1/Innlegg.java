package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
    private int id;
    private String bruker;
    private String dato;
    private int likes;

	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
        this.id = id;
        this.bruker = bruker;
        this.dato = dato;
        this.likes = likes;
	}
	
	public String getBruker() {
        return bruker;
	}

	public void setBruker(String nyBruker) {
		bruker = nyBruker;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String nyDato) {
		dato = nyDato;
	}

	public int getId() {
        return id;
	}
	public int getLikes() {
        return likes;
	}
	
	public void doLike () {
		likes = likes + 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
        if(this.id == innlegg.getId()){
            return true;
        }
        return false;
	}
	
	@Override
	public String toString() {
        return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	/*public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
	 */
}
