import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	//declare a dao that will be used to perform commands to item objects
	Dao dao;
	//declare consoleUtils to call methods to user
	ConsoleUtils consoleUtils;
	
	public Controller() {
		this.dao = new Dao();
		this.consoleUtils = new ConsoleUtils();
	}
	
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
            } else if (action.equals("complete")) {

                processUpdateAction(actionParts);

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
            
                consoleUtils.error("Invalid action");
                
            }
        }

    }
    /**
     * takes ID and uses dao method to mark item as complete
     * @param actionParts input user enters aka item id
     */
    private void processUpdateAction(String[] actionParts) {
    	if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to stop command");
            return;
        }
    	
    	int id = 0;
    	
    	
    	boolean validID = false;
    	while(!validID) {
    		try {
    			id = Integer.parseInt(consoleUtils.promptString("Id to update:"));
    			checkIDExists(id);
    			validID = true;
    	    	dao.markComplete(dao.find(id));
    	        consoleUtils.info("item marked complete");

    		} catch (Exception e) {
    			consoleUtils.error("id does not exist");
    		}
    	}
    	
	}

	private void checkIDExists(int id) {
		if(dao.find(id) == null) {
			throw new IndexOutOfBoundsException();
		}
	}

	/*
	 * The user wants to view a list of timesheet entries
	 * This method conveys that request to the Timesheet,
	 * along with any special options (active-only, filter by project name)
	 */
    public void processListAction(String[] actionParts){
    
        if(actionParts.length > 5){
            consoleUtils.error("Too much stuff to do, just take the day off :)");
            return;
        } else {
        	List<ToDoItem> item = new ArrayList<ToDoItem>();
        	if(actionParts.length>1) {
        		if(actionParts[1].toLowerCase().equals("complete")) {
            		item = dao.listToDoItem(true);
            		consoleUtils.printList(item);
            	} else if (actionParts[1].toLowerCase().equals("pending")) {
            		System.out.println("hey");
            		item = dao.listToDoItem(false);
            		consoleUtils.printList(item);
            	} 
        	} else {
        		item = dao.listToDoItem();
            	consoleUtils.printList(item);
        	}
        	
        	
        }
 
		
    }

	private void processDeleteAction(String[] actionParts) {
		if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to stop command");
            return;
        }
    	
    	int id = 0;
    	
    	
    	boolean validID = false;
    	while(!validID) {
    		try {
    			id = Integer.parseInt(consoleUtils.promptString("Id to delete:"));
    			checkIDExists(id);
    			validID = true;
    			dao.deleteToDoItem(dao.find(id));
    	        consoleUtils.info("item deleted");

    		} catch (Exception e) {
    			consoleUtils.error("id does not exist");
    		}
    	}
    	
	}

	private void processAddAction() {
		String description = consoleUtils.promptString("Description:");
        dao.addToDoItem(description);
        consoleUtils.info("item added");
	}
    

}
