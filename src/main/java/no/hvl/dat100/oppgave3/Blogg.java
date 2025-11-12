package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
    private Innlegg[] innlegstabell;
    private int nesteLedig;

	public Blogg() {
        innlegstabell = new Innlegg[20];
        nesteLedig = 0;
	}

	public Blogg(int lengde){
        innlegstabell = new Innlegg[lengde];
        nesteLedig = 0;
	}

	public int getAntall() {
		int antall = 0;

        for(int i = 0; i < innlegstabell.length; i++){
            if(innlegstabell[i] != null){
                antall++;
            }
        }

        return antall;
	}
	
	public Innlegg[] getSamling() {
        return innlegstabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
        int pos = -1;

        for(int i = 0; i < innlegstabell.length; i++){
            if(innlegstabell[i] != null && innlegstabell[i].erLik(innlegg)){
                return i;
            }
        }

        return pos;
	}

	public boolean finnes(Innlegg innlegg) {

        for(int i = 0; i < innlegstabell.length; i++){
            if(innlegstabell[i] != null && innlegg.getId() == innlegstabell[i].getId()){
                return true;
            }
        }

        return false;
	}

	public boolean ledigPlass() {

        for(int i = 0; i < innlegstabell.length; i++){
            if(innlegstabell[i] == null){
                return true;
            }
        }

        return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {

        if(finnes(innlegg)){
            return false;
        }

        for(int i = 0; i < innlegstabell.length; i++){
            if(innlegstabell[i] == null){
                innlegstabell[i] = innlegg;
                return true;
            }
        }

        return false;
	}

    @Override
	public String toString() {
		String resultat = getAntall() + "\n";

        for(int i = 0; i < innlegstabell.length; i++){
            if(innlegstabell[i] != null){
                resultat += innlegstabell[i].toString();
            }
        }
        return resultat;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}


}