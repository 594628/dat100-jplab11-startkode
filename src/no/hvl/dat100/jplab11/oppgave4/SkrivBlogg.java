package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
	
	String MAPPE_STR;; 
	String filnavn; 
	
	

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
			PrintWriter skriver = new PrintWriter("/src/no/hvl/dat100/tests/blogg.dat"); 
			skriver.write("hei"); 
			skriver.flush();
			skriver.close();
		}  catch (FileNotFoundException e) {
			System.out.println("fant ikke fil"); 
		}
		finally {
			System.out.println("tekst ble skrevet ut"); 
		}
		return true; 
	}
}
