package question3;

import java.util.ArrayList;
import java.util.List;
/**
 * This class maintains a  list of students their preferences and their allocated branches
 * @author Babbar's
 */
public class StudentList {
	String stuName;
	List<String> preference = new ArrayList<String>(5);
	String branch;

	// parameterized constructor
	public StudentList(String stuName, List<String> preference2) {

		this.stuName = stuName;
		this.preference = preference2;
	}

	public StudentList() {

	}

}
