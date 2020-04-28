package co.product.employee;

public class Project {
	String Projectname;
	String ProjectDomain;
	int ProjectId;
	int ProjectBudject;
	public Project(String projectname, String projectDomain, int projectId, int projectBudject) {
		super();
		Projectname = projectname;
		ProjectDomain = projectDomain;
		ProjectId = projectId;
		ProjectBudject = projectBudject;
	}
	
	
	public void showProject() {
		System.out.println("\nproject details :-");
		System.out.println("project name      :" + Projectname);
		System.out.println("project domain    :" + ProjectDomain);
		System.out.println("project id        :" + ProjectId);
		System.out.println("project budject   :" + ProjectBudject);
	}
	
	
}
