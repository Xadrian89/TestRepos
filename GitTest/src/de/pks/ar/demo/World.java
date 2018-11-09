package de.pks.ar.demo;

public class World {

	static void antworte(String anfrage) {
		if (anfrage.contains("Hello")) {
			System.out.println("Hello!!!");
		}
		if (anfrage.contains("Bye")) {
			System.out.println("Bye..");
		}
	}
}
