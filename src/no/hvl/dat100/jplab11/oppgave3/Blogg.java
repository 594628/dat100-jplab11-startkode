package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg[] innleggstabell;
	int nesteledig;

	public Blogg() {
		innleggstabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int i = 0;
		while (!innlegg.erLik(innlegg) && i <= innleggstabell.length) {
			i++;
		}
		if (i < innleggstabell.length)
			return i;
		else
			return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		int i = 0;
		while (!innlegg.erLik(innlegg) && i <= innleggstabell.length) {
			i++;
		}
		if (i < innleggstabell.length)
			return true;
		else
			return false;
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggstabell.length)
			return true;
		else
			return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (ledigPlass() && !finnes(innlegg)){
			innleggstabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		else
			return false;
	}
	
	//public String toString() {
	//	StringBuilder str = new StringBuilder(nesteledig);
	//	for (int i = 0; i < nesteledig; i++){
	//		//str.append("\n"+innleggstabell[i].getClass());
	//		str.append("\n"+innleggstabell[i].getBruker());
	//		str.append("\n"+innleggstabell[i].getDato());
	//		str.append("\n"+innleggstabell[i].getLikes());
	//		//str.append("\n"+innleggstabell[i]);
	//	}
//
	//	//String finalString = str.toString();
	//	return str.toString();
	//}

	public String toString() {
		StringBuilder str = new StringBuilder(nesteledig);
		for (int i = 0; i < nesteledig; i++){
			str.append("\n" + innleggstabell[i].toString());
		}
		return str.toString();
	}
	// "\"\\n\""


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