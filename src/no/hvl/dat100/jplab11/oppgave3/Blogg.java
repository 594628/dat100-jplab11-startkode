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
	
	public String toString() {
		int lengde = innleggstabell.length;
		String finalstr = String.format("%d", lengde);
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