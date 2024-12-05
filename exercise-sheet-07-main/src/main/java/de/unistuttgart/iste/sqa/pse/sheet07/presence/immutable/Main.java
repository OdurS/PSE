package de.unistuttgart.iste.sqa.pse.sheet07.presence.immutable;


public class Main {

	public static void main(String[] args) {
		MyImutibleStudent Odur = new MyImutibleStudent("Odur_Schweikert", 12874198);
		String name = Odur.getName();
		long matrikelnummer = Odur.getMatrikelnummer();
		System.err.println(name);
		System.err.println(matrikelnummer);


	}
}