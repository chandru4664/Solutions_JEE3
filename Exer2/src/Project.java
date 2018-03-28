
public class Project {

	int projectId;
	String projectName;
	String projectHead;
	int noOfResources;

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}

	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}
	

	public static void main(String[] args){
		
	Project proj=new Project();
	
	proj.setProjectHead("Bhavani");
	proj.setProjectId(1);
	proj.setProjectName("My first Exercise");
	proj.setNoOfResources(17);
	
	System.out.println("Project Id      :"+proj.projectId);
	System.out.println("Project Head    :"+proj.projectHead);
	System.out.println("Project Name    :"+proj.projectName);
	System.out.println("No of Resources :"+proj.noOfResources);
	}


}