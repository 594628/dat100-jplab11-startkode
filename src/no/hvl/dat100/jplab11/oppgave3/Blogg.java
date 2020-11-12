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
		boolean funnet = false;
		while (!innlegg.erLik(innlegg) && i <= innleggstabell.length) {
			i++;
		}
		if (i < innleggstabell.length)
			funnet = true;
		return funnet;
	}

	public boolean ledigPlass() {
		boolean ledig = false;
		if (nesteledig < innleggstabell.length)
			ledig = true;
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil = false;
		if (ledigPlass() && finnes(innlegg)){
			innleggstabell[nesteledig] = innlegg;
			nesteledig++;
			lagtTil = true;
		}
		return lagtTil;
	}

	public String toString() {
		String str = nesteledig + "\n";
		for (int i = 0; i < nesteledig; i++){
			str += innleggstabell[i].toString();
		}

		return str;
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