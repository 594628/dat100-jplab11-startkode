package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private String url; 
	
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		id = super.getId();
		bruker = super.getBruker(); 
		dato = super.getDato(); 
		tekst = super.getTekst(); 
		url = this.url; 
		
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		id = super.getId();
		bruker = super.getBruker(); 
		dato = super.getDato(); 
		tekst = super.getTekst(); 
		url = this.url; 
		likes = super.getLikes(); 
		
	}
		
	
	public String getUrl() {
		return this.url; 

	}

	public void setUrl(String url) {
		this.url = url; 
	}

	@Override
	public String toString() {
		String str = ("BILDE" + "\n" + super.getId() + "\n" + super.getBruker() + "\n" + super.getDato() + "\n" + super.getLikes() + "\n" + getTekst() + this.url +  "\n"  );
		return str; 

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
