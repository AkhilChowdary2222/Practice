package jdbc.create1;

import java.sql.*;

public class jdbc {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/fsads52";
		String usr = "root";
		String pwd = "2400030170";
		
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, usr, pwd);
			System.out.println("Connection established");
			
			Statement st = con.createStatement();
			
			String Dept = "CREATE TABLE IF NOT EXISTS Dept (" + "Dept_Id INT PRIMARY KEY, " + "Dept_Name VARCHAR(50)" + ")";
			
			st.execute(Dept);
			System.out.println("Dept table created.");
			
			String Emp = "CREATE TABLE IF NOT EXISTS Emp (" + "Emp_Id INT PRIMARY KEY, " + "Emp_Name VARCHAR(50), " + "Salary DOUBLE, " + "Dept_Id INT," + "FOREIGN KEY (Dept_Id) REFERENCES Dept(Dept_Id)" + ")";
			
			st.execute(Emp);
			System.out.println("Emp table created.");
            String insertDept = "INSERT INTO Dept (Dept_Id, Dept_Name) VALUES " + "(101, 'Human Resources'), " + "(102, 'Finance'), " + "(103, 'IT'), " + "(104, 'Marketing'), " + "(105, 'Operations')";
			
			st.executeUpdate(insertDept);
			System.out.println("Values inserted into Dept table.");
			
			String insertEmp = "INSERT INTO Emp (Emp_Id, Emp_Name, Salary, Dept_Id) VALUES " + "(1, 'Aarav Kumar', 45000.50, 101), " + "(2, 'Riya Sharma', 52000.00, 102), " + "(3, 'Karan Patel', 60000.75, 103), " + "(4, 'Neha Singh', 48000.25, 104), " + "(5, 'Vikram Das', 75000.00, 105)";
			
			st.executeUpdate(insertEmp);
			System.out.println("Values inserted into Emp table.");
			
			st.close();
			con.close();
			
		}
catch(Exception e) {
	e.printStackTrace();
	
}
}

}
