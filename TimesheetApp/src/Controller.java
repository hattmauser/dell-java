import java.util.ArrayList;
import java.util.List;

public class Controller {

	/* Member variables */
	
    Timesheet timesheet;
    ConsoleUtils consoleUtils;
    
    /* Constructor */
    
    public Controller(){
        this.timesheet = new Timesheet();
        this.consoleUtils = new ConsoleUtils();
    }
    
    /* Methods */

	/*
	 * Runs the program
	 */
    public void start() {

        consoleUtils.printHelp(); // Print the action menu

        boolean quit = false;
        while(!quit) {

			// Prompt the user for input, collect input, parse into parts
            String input = consoleUtils.promptString("> ");
            String[] actionParts = input.split(" ");
            String action = actionParts[0].trim(); // Primary action

			// Figure out what to do depending on the user's primary action
            if (action.equals("add")) {

                processAddAction();

            } else if (action.equals("delete")) {

                processDeleteAction(actionParts);

            } else if (action.equals("stop")) {

                processStopAction(actionParts);

            } else if (action.equals("list")) {

                processListAction(actionParts);

            } else if (action.equals("quit")) {

                quit = true;

            } else if (action.equals("help")) {

            	ConsoleUtils helper = new ConsoleUtils();
            	helper.printHelp();

            } else if(action.length() ==0 ){
            
                // do nothing.
                
            } else {
            
                // Your code here
                
            }
        }

    }

	/*
	 * The user requested that a given TimesheetEntry be stopped (marked as complete)
	 * This method conveys that request to the Timesheet
	 */
    public void processStopAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to stop command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);

		timesheet.stop(timesheet.get(id));
    }

	/*
	 * The user requested that a given TimesheetEntry be deleted
	 * This method conveys that request to the Timesheet
	 */
    public void processDeleteAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to delete command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);
		
		timesheet.delete(timesheet.get(id));
    }

	/*
	 * The user wants to view a list of timesheet entries
	 * This method conveys that request to the Timesheet,
	 * along with any special options (active-only, filter by project name)
	 */
    public void processListAction(String[] actionParts){
    
        if(actionParts.length > 3){
            consoleUtils.error("Too many inputs to list command");
            return;
        } else {
        	List<TimesheetEntry> entry = new ArrayList<TimesheetEntry>();
        	if(actionParts.length == 2) {
        		if(actionParts[1].equals("-a")) {
            		entry = timesheet.list(true, null);
                	consoleUtils.printList(entry);
            	} else {
            		entry = timesheet.list(false, actionParts[1].toString());
                	consoleUtils.printList(entry);
            	}
        	} else if (actionParts.length == 3) {
        		if(actionParts[1].equals("-a")) {
            		entry = timesheet.list(true, actionParts[2].toString());
                	consoleUtils.printList(entry);
            	} else if(actionParts[2].equals("-a"))  {
            		entry = timesheet.list(true, actionParts[1].toString());
                	consoleUtils.printList(entry);
            	}
        	} else {
        		entry = timesheet.list(false, null);
            	consoleUtils.printList(entry);
        	}
        	
        }
 
		
    }

	/*
	 * The user wants to add a new entry to the Timesheet
	 * This method conveys that request to the Timesheet, along with
	 * the specified project name and task description 
	 */
    public void processAddAction(){
    
        String project = null; 
        
        //implementing try catch to ensure user only enters one word
        boolean oneWord = false;
		while(!oneWord) {
			try {
				project = consoleUtils.promptString("Project Name (one word only):");
				verifyOneWord(project);
				oneWord = true;
				
			} catch (Exception e) {
				System.out.println("Program is throwing an exception: " + e);
				System.out.println("Please enter only one word for project name.");
			} 
		}
		
        String description = consoleUtils.promptString("Task:");
        timesheet.add(project, description);

    }
    
    //method that checks if user only enters one word it trims the string, and then checks if it contains a space
    public static void verifyOneWord (String s) {
		if(s.trim().contains(" ")) {
			throw new IllegalArgumentException();
		}
	}
}