/**
 * File: If Statements
 * Author: Mikah Ho
 * Date Created: Mar 24, 2026
 * Date Last Modified: Mar 24, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	//q1
	public static String evenOrOdd(int num) {
	    
	    if (num % 2 != 0) {
	        return "Odd";
	    }
	    
	    return "Even";
	}
	
	//q2
	public static String teacherOrStudent(String name) {
	    
	    if (name.equals("Kalisz")) {
	        return "Teacher";
	    }
	    
	    return "Student";
	}

	//q3
	public static int fartherFromZero(int num) {
	    
	    if (num > 0) {
	        return num + 5;
	    }
	    
	    if (num == 0) {
	        return num;
	    }
	    
	    return num - 5;
	}
}
