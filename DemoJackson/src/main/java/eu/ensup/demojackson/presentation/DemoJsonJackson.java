package eu.ensup.demojackson.presentation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.ensup.demojackson.domaine.Employe;

public class DemoJsonJackson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();
		Employe employe = new Employe("BA", "Amadou");
		Employe employe2 = new Employe("BAA", "AAmadou");

		List<Employe> listEmploye = new ArrayList<Employe>();
		listEmploye.add(employe2);
		listEmploye.add(employe);

		File resultFile = new File("employe.json");

		// mapper.writeValue(resultFile, employe);
		mapper.writeValue(resultFile, listEmploye);
		// Employe empl = mapper.readValue(resultFile, Employe.class);
		List<Employe> listResultat = new ArrayList<Employe>();
		listResultat = mapper.readValue(resultFile, List.class);
		// System.out.println(empl);
		System.out.println(listResultat);

	}

}
