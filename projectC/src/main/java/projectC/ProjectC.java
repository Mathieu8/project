package projectC;

import projectB.ProjectB;

public class ProjectC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProjectC().printProjectA();
		new ProjectB().printProjectB();

	}

	public void printProjectA() {
		System.out.println("In project C");
	}
	
}
