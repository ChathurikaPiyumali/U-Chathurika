package tasks.supervisor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class TasksDBUtil {
	
	
	//Create database connection
	private static boolean isSuccess;  //instant variable
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	
	//Inserts a new task into the database.
	
	public static boolean inserttasks(String taskName,String deadline,int employeeId,String status, int supervisorId) {
		 isSuccess = false;
			
				try {
					
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					
					
					//insert parameters to database
					
					String sql = "insert into tasks values(0,'"+taskName+"','"+deadline+"','" +employeeId+"','"+status+"','"+supervisorId+"')";
					
					int rs = stmt.executeUpdate(sql); 
					
					if(rs > 0) {
						isSuccess = true;
					}
					else {
						isSuccess = false;
					}
						
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		
		
		return isSuccess;

	}
	
	//Updates an existing task in the database.
	public static boolean updatetasks(int taskId,String taskName,String deadline,int employeeId,String status, int supervisorId) {
		isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			//update query
			String sql = "update tasks set taskName='" + taskName + "', deadline='" + deadline + "', employeeId='" + employeeId + "', status='" + status + "', supervisorId='" + supervisorId + "' "
			        + "where taskId='" + taskId + "'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;	
			}
			else
			{
				isSuccess = false;
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
		//Retrieves the details of a task based on the task ID.
	  public static List<Tasks> getTasksDetails(String taskId) {
	        ArrayList<Tasks> tasks = new ArrayList<>();

	        try {
	            con = DBConnect.getConnection();
	            stmt = con.createStatement();

	            String sql = "SELECT * FROM tasks WHERE taskId = '" + taskId + "'";
	            rs = stmt.executeQuery(sql);

	            while (rs.next()) {
	                int tId = rs.getInt("taskId");
	                String tName = rs.getString("taskName");
	                String deadline = rs.getString("deadline");
	                int eId = rs.getInt("employeeId");
	                String status = rs.getString("status");
	                int sId = rs.getInt("supervisorId");

	                Tasks task = new Tasks(tId, tName, deadline, eId, status, sId);
	                tasks.add(task);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return tasks;
	    }
	  
	  
	  //Retrieves all tasks from the database.
	  
	  public static List<Tasks> getAllTasks() {
		    ArrayList<Tasks> tasks = new ArrayList<>();

		    try {
		        con = DBConnect.getConnection();
		        stmt = con.createStatement();

		        String sql = "SELECT * FROM tasks";
		        rs = stmt.executeQuery(sql);

		        while (rs.next()) {
		            int tId = rs.getInt("taskId");
		            String tName = rs.getString("taskName");
		            String deadline = rs.getString("deadline");
		            int eId = rs.getInt("employeeId");
		            String status = rs.getString("status");
		            int sId = rs.getInt("supervisorId");

		            Tasks task = new Tasks(tId, tName, deadline, eId, status, sId);
		            tasks.add(task);
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return tasks;
		}
	
	  //Deletes a task from the database based on the task ID.
	  
	  public static boolean deleteTask(String taskId) {
		    boolean isSuccess = false;

		    try {
		        con = DBConnect.getConnection();
		        stmt = con.createStatement();

		        if (taskId != null && !taskId.trim().isEmpty()) {
		            int convId = Integer.parseInt(taskId.trim());
		            String sql = "DELETE FROM tasks WHERE taskId = '" + convId + "'";
		            int r = stmt.executeUpdate(sql);

		            if (r > 0) {
		                isSuccess = true;
		            }
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }

		    return isSuccess;
		}
	
	
	
	
	
	
	
}
