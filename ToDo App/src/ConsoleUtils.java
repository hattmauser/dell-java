import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ConsoleUtils {

	/* Member variables */
	
    private Scanner scanner;
    private DateTimeFormatter timeFormatter;
    
    /* Constructor */
    
    public ConsoleUtils(){
        scanner = new Scanner(System.in);
    }

	/* Methods */
	
	/*
	 * Prints the menu of actions to the console
	 */
    public void printHelp(){
        System.out.println("Valid commands: ");
        System.out.println("  list [pending]    list all items that are pending");
        System.out.println("  list [complete]   list all items that are complete");
        System.out.println("  list              list all itmes");
        System.out.println("  add               add an entry, and set the start time");
        System.out.println("  complete          update entry with the ID");
        System.out.println("  delete            delete entry with the ID");
        System.out.println("  help              display all available functions");
        System.out.println("  quit              to exit");
        System.out.println();

    }

	/*
	 * Prints an informational message to the console
	 */
    public void info(String msg){
        System.out.println("["+msg+"]");
        System.out.println();
    }

	/*
	 * Prints an error message to the console
	 */
    public void error(String msg){
        System.out.println("[ERROR: "+msg+"]");
        System.out.println();
        }

	/*
	 * Prompts the user to enter input
	 * Returns the text entered by the user
	 */
    public String promptString(String label){
        System.out.print(label+" ");
        return scanner.nextLine();
    }

	/*
	 * Prints a list of TimesheetEntry objects in a pretty table
	 */
    public void printList(List<ToDoItem> items){
        int longestDesc =  11;

        for(ToDoItem item : items){
            if(item.getDescription().length() > longestDesc){
                longestDesc = item.getDescription().length();
            }
        }

        String itemDescHeader = String.format("%"+longestDesc+"s", "Description");
        String projectUnderline = "";
        for(int i=0;i<longestDesc;i++){
            projectUnderline+="-";
        }

        System.out.println(" ID | "+itemDescHeader   +" | Status          ");
        System.out.println("----+-"+projectUnderline+"-+----------------");

        for(ToDoItem item : items){
            String project = String.format("%-"+longestDesc+"s", item.getDescription());
            String status = "";
            if(item.isCompletedFlag()) {
            	status = "Complete";
            } else {
            	status = "Pending";
            }

            String line = String.format(" %2s | %s | %s ", item.getId(), project, status);
            System.out.println(line);
        }

        if(items.size() == 1){
            System.out.println("[1 item]");
        } else {
            System.out.println("["+items.size()+" items]");
        }

        System.out.println();
    }
}