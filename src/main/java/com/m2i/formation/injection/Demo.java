package com.m2i.formation.injection;

import org.apache.log4j.Logger;

public class Demo {

	private static final Logger l = Logger.getLogger(Demo.class);

	public ScrumTeam creatScrumTeam() {

		ScrumTeam scrumTeam = new ScrumTeam();

		try {
			l.info("Entrée dans la méthode creatScrumTeam()");

			TeamMember developper = new TeamMember();
			developper.setFirstName("Nicolio");
			developper.setLastName("JAOHOVA");
			developper.setRole("Développeur");

			TeamMember productOwner = new TeamMember();
			productOwner.setFirstName("Toto");
			productOwner.setLastName("Dams");
			productOwner.setRole("PO");

			TeamMember scrumMaster = new TeamMember();
			scrumMaster.setFirstName("Amir");
			scrumMaster.setLastName("Dodo");
			scrumMaster.setRole("Scrum Master");

			scrumTeam.setDevelopper(developper);
			scrumTeam.setProductOwner(productOwner);
			scrumTeam.setScrumMaster(scrumMaster);
			l.info("Sortie de la méthode creatScrumTeam()");
		} catch (Exception e) {
			l.error("Exception dans la methode creatScrumTeam : " + e);
		}
		return scrumTeam;
	}
}
