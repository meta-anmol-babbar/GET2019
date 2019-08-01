package question3;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	String stuName;
	List<String> preference = new ArrayList<String>(5);
	String branch;

	public StudentList(String stuName, List<String> preference2) {
		
		this.stuName = stuName;
		this.preference = preference2;
		//System.out.println(this.stuName);
	//	for(int i=0;i<this.preference.size();i++){
		//	System.out.println(this.preference.get(i));
		//}

	}

	public StudentList() {
		
	}

}
