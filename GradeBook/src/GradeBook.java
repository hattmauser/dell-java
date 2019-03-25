import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Your program should ask the user to input the total number of students in the gradebook.
Your program should ask the user to input each student's name, and a list of grades for that student (as a comma-separated string).
Your program should print out each student's name and the average grade for that student.
Guidelines:

Your program should store the students and the associated grades (as a comma-seperated string) in a Map<String,String>
Your program should compute the average grade for each student, and create a new Map<String,Double> that stores the students and their corresponding grade average.
Use the Map<String,Double> that contains the students and their average grade to retrieve and print out the results.
When implementing your solution, use helper methods and include comments in your code.
 */
public class GradeBook {
	public static void main(String[] args) {
		//Prompting user for input and recording response in scanner
		System.out.print("Input total number of students: ");
		Scanner reader = new Scanner(System.in);
		String studentsInput = reader.nextLine();
		
		//instantiate hashmap for students and grades
		Map<String, String> gradeBook = new HashMap<String, String>();
		
	    //instantiate hashmap for students and averages
	    Map<String, Double> studentAvgs = new HashMap<String, Double>();
		
	    //creating student arraylist to add students so I can reference from map later
	    ArrayList<String> students = new ArrayList<String>();

		//Prompting user to input student grades
	    for(int i=1; i<=Integer.parseInt(studentsInput);i++) {
	      System.out.println("Input the student name.");
	      String studentEntry = reader.nextLine();
	      
	      students.add(studentEntry);

	      System.out.println("Input student grades seperated by comma.");
	      String studentGrades = reader.nextLine();
	      
	      List<String> gradeArray = new ArrayList<String>(Arrays.asList(studentGrades.split(",")));
	    
	      //add grades to mapped student and add up total of grades
	      int gradeTotal = 0;
	      for(int j=0; j < gradeArray.size(); j++) {
	    	  gradeBook.put(studentEntry, gradeArray.get(j));
	    	  gradeTotal += Integer.parseInt(gradeArray.get(j));
	      }
	      
	      //calculate average
	      double studentAvg = (double) gradeTotal/gradeArray.size();
	      
	      //add student and average to avg map
	      studentAvgs.put(studentEntry, studentAvg);
	    }
	    
	    /*
	    Iterator<Double> itr = studentAvgs.values().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
	    //print out student names and averages
		for(int i=0; i<studentAvgs.size(); i++) {
			System.out.println(students.get(i) + ": " + studentAvgs.get(students.get(i)));
		}
	  
		
		
		reader.close();
		
	}
}
