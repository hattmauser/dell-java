import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Timesheet {
	private List<TimesheetEntry> database;

	/**
	 * constructor initializes a new list of type arraylist
	 */
	public Timesheet() {
		database = new ArrayList<TimesheetEntry>();
	}
	
	public void add(String project, String task) {
        TimesheetEntry userTimesheet = new TimesheetEntry(project, task);
        database.add(userTimesheet);
	}
	
	/**
	 * when called
	 * @return the list array of current timesheet entries
	 */
	public List<TimesheetEntry> list(boolean activeOnly, String name){
		if(activeOnly && (name != null)) {
			List<TimesheetEntry> activeProjectDatabase = new ArrayList<TimesheetEntry>();
			for (TimesheetEntry e : database) {
				LocalDateTime listEndTime = e.getEndTime();
				if(listEndTime == null && (e.getProjectName().equals(name))) {
					activeProjectDatabase.add(e);
				}
			}
			return activeProjectDatabase;
		} else if(name != null) {
			List<TimesheetEntry> projectDatabase = new ArrayList<TimesheetEntry>();
			for(TimesheetEntry e: database) {
				if(e.getProjectName().equals(name)) {
					projectDatabase.add(e);
				}
			}
			return projectDatabase;
		} else if(activeOnly) {
			List<TimesheetEntry> activeDatabase = new ArrayList<TimesheetEntry>();
			for (TimesheetEntry e : database) {
				LocalDateTime listEndTime = e.getEndTime();
				if(listEndTime == null) {
					activeDatabase.add(e);
				}
			}
			return activeDatabase;
		} else {
			return database;
		}
		
	}
	
	/**
	 * method that will return timesheet entry from id entry
	 * @param id is given
	 * @return the timesheet entry for that id
	 */
	public TimesheetEntry get(int id) {
		if(database.get(id-1) != null) {
			return database.get(id-1);
		} else
		return null;
		
	}
	
	/**
	 * deletes a timesheetentry
	 * @param entry to delete
	 */
	public void delete(TimesheetEntry entry) {
		int entryDelete = database.indexOf(entry);
		database.remove(entryDelete);
	}
	
	public void stop(TimesheetEntry entry) {
		entry.updateEndTime();
	}
}
