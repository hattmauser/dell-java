/*
 * id
description
completed flag
 */
public class ToDoItem {
	protected int id;
	protected String description;
	protected boolean completedFlag;
	
	public ToDoItem(int id, String description) {
		this.id = id;
		this.description = description;
		this.completedFlag = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompletedFlag() {
		return completedFlag;
	}

	public void setCompletedFlag(boolean completedFlag) {
		this.completedFlag = completedFlag;
	}
	
	
	
}
