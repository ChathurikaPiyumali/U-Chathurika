package tasks.supervisor;

public class Tasks {
	private int taskId;
	private  String taskName;
	private String deadline;
	private int employeeId;
	private String status;
	private int supervisorId;
	
	//constructor
	public Tasks(int taskId, String taskName, String deadline, int employeeId, String status, int supervisorId) {
		
		this.taskId = taskId;
		this.taskName = taskName;
		this.deadline = deadline;
		this.employeeId = employeeId;
		this.status = status;
		this.supervisorId = supervisorId;
		
	}


	public int getTaskId() {
		return taskId;
	}


	public String getTaskName() {
		return taskName;
	}


	public String getDeadline() {
		return deadline;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public String getStatus() {
		return status;
	}


	public int getSupervisorId() {
		return supervisorId;
	}

	
}
