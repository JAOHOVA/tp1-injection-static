package com.m2i.formation.injection;

public class ScrumTeam {

	private TeamMember developper;
	private TeamMember productOwner;
	private TeamMember scrumMaster;

	public TeamMember getDevelopper() {
		return developper;
	}

	public void setDevelopper(TeamMember developper) {
		this.developper = developper;
	}

	public TeamMember getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(TeamMember productOwner) {
		this.productOwner = productOwner;
	}

	public TeamMember getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(TeamMember scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

}
