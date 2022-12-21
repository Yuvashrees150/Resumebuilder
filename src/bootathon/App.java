package bootathon;
import java.sql.*;


public class App {
public static void main(String[] args) {
	new Login();
}

public String username;
App(){
	
}
App(String username){
	this.username=username;
}
public String Register(String username,String password,String firstname,String secondname,String email,String country,String state) {
	try( Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
            "root", "guruyamu2002");) {
		PreparedStatement ps=null;
		this.username=username;
		String query ="insert into user(username,password,firstname,secondname,email,country,state) values('"+username+"','"+password+"','"+firstname+"','"+secondname+"','"+email+"','"+country+"','"+state+"')";
		ps=con.prepareStatement(query);
		ps.execute(query);
		con.close();
		
	} catch (Exception e) {
		
	}
	
	return username;
	
}
public void Skills(String username,String domain,String skills,String skill_description) {
	try( Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
            "root", "guruyamu2002");) {
		PreparedStatement ps=null;
		ps = con.prepareStatement("update user set domain='" + domain + "',skills='" + skills + "',skills_desc='" + skill_description + "' where username=?");
		ps.setString(1, this.username);
	    ps.execute();
	    con.close();
		
		
	} catch (Exception e) {
		
	}
	
}
public void Personal(String username,String linkedin,String profession,String address) {
	try( Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
            "root", "guruyamu2002");) {
		PreparedStatement ps=null;
		ps = con.prepareStatement("update user set linkedin='" + linkedin + "',profession='" + profession + "',address='" + address + "' where username=?");
		ps.setString(1, this.username);
	    ps.execute();
	    con.close();
		
		//linkedin,profession,address
	} catch (Exception e) {
		
	}
	
}
public void Education(String username,String school,String college,String domain_job,int duration,String cgpa) {
	try( Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
            "root", "guruyamu2002");) {
		PreparedStatement ps=null;
		String query = "update user set school='" + school + "',college='" + college + "',domain_job='" + domain_job + "',duration='" + duration + "',cgpa='"+cgpa+"' where username=?";
		ps=con.prepareStatement(query);
		ps.execute(query);
		
	} catch (Exception e) {
		
	}
	
}
public boolean Login(String username,String password) {
	try( Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
            "root", "guruyamu2002");) {
		PreparedStatement ps=null;
		 ps = con.prepareStatement("Select username, password from user where username=? and password=?");
         ps.setString(1, username);
         ps.setString(2, password);
         ResultSet rs = ps.executeQuery();
         if (rs.next()) {
        	 return true;
         }
         else return false;
		
	} catch (Exception e) {
		
	}
	return false;
}
public void Description(String username,String description) {
	try( Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
            "root", "guruyamu2002");) {
		PreparedStatement ps=null;
		ps = con.prepareStatement("update user set personal='" + description + "' where username=?");
	    ps.execute();
		
	} catch (Exception e) {
		
	}
	
}
}