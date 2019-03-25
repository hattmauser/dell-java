import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Create a class that drives all the updates to the database. This class is usually called a DAO (Data Access Object). The Dao.java class should have the following member variable:
For database Version 1, use an ArrayList to store the user's to-do items.
For database Version 2, store a Connection to the SQLite database file.
 */
public class Dao {
	//declare database that is just array list
	protected ArrayList<ToDoItem> database;
	protected int idCount = 1;;
	
	//constructor to instantiate new database
	public Dao() {
		database = new ArrayList<ToDoItem>();
	}
	
	/**
	 * method that will return timesheet entry from id entry
	 * @param id is given
	 * @return the timesheet entry for that id
	 */
	public ToDoItem find(int id) {
		if(database.get(id-1) != null) {
			return database.get(id-1);
		} else
		return null;
		
	}
	
	//marks complete for a given todo item
	public void markComplete(ToDoItem item) {
		item.setCompletedFlag(true);
	}
	
	//adds todo item to the database
	public void addToDoItem(String desc) {
		ToDoItem item = new ToDoItem(idCount, desc);
		database.add(item);
		idCount++;
	}
	
	//delete todo object frorm database array
	public void deleteToDoItem(ToDoItem item) {
		int entryDelete = database.indexOf(item);
		database.remove(entryDelete);
	}
	public List<ToDoItem> listToDoItem(){
		return database;
		
	}
	//given pending true or false will show all pending todo items or all todo items
	public List<ToDoItem> listToDoItem(boolean complete){
		//if given false, list items that are not completed, iscompletedflag = false
		if(!complete) {
			List<ToDoItem> pendingDatabase = new ArrayList<ToDoItem>();
			for (ToDoItem e : database) {
				boolean completed = e.isCompletedFlag();
				if(!completed) {
					pendingDatabase.add(e);
				}
			}
			return pendingDatabase;
		//else, return everything in database
		} else {
			List<ToDoItem> completeDatabase = new ArrayList<ToDoItem>();
			for (ToDoItem e : database) {
				boolean completed = e.isCompletedFlag();
				if(completed) {
					completeDatabase.add(e);
				}
			}
			return completeDatabase;
		}
	}
}
