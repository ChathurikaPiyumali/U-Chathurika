package November2022A;

import java.util.ArrayList;

public class DempoApp {

	public static void main(String[] args) {
		
		//permenentEmp arraylist 
		
		ArrayList<PermanentEmp>  permenentEmp = new ArrayList<>();
		permenentEmp.add(new PermanentEmp(101,"Nimali" ,56000.00));
		permenentEmp.add(new PermanentEmp(102,"Amal" ,74000.00));
		
		
		//call calculate net salary and display
		
		for(PermanentEmp pemp :permenentEmp ) {
			pemp. calculateNetSalary() ;
			pemp.display();
			System.out.println(); //add empty line for better readability
		}
		
		
		//TemporaryEmp arrayList 
		
		ArrayList< TemporaryEmp>   temporaryEmp = new ArrayList<>();
		temporaryEmp.add(new TemporaryEmp (201,"Sunil",8,25.5));
		temporaryEmp.add(new TemporaryEmp (202,"Piyal",8,25.5));

		//call calculate net salary and display
		
				for(TemporaryEmp temp :temporaryEmp ) {
					temp. calculateNetSalary() ;
					temp.display();
					System.out.println(); //add empty line for better readability
				}
		
		
	}

}
