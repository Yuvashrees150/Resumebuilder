package bootathon;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class LoginFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel username=new JLabel("USERNAME");
    JLabel password=new JLabel("PASSWORD");
    JTextField userText=new JTextField();
    JPasswordField passwordText=new JPasswordField();
    JButton login=new JButton("LOGIN");
    JButton register=new JButton("REGISTER");
    
	LoginFrame(){  
    setLayout(null);
       username.setBounds(50,100,100,30);
       password.setBounds(50,150,100,30);
       userText.setBounds(150,100,150,30);
       passwordText.setBounds(150,150,150,30);
       login.setBounds(50,240,100,30);
       register.setBounds(200,240,100,30);
       add(username);
       add(password);
       add(userText);
       add(passwordText);
       add(login);
       add(register);
       login.addActionListener(this);
       register.addActionListener(this);
        
   }
	
	 
 
    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == login) {
    		String userName = userText.getText();
            String password = passwordText.getText();
            
            
            App app = new App();
            boolean flag=app.Login(userName, password);
//    		try {
//    			
//    	           Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
//    	               "root", "guruyamu2002");
//
//    	           PreparedStatement st = con.prepareStatement("Select username, password from user where username=? and password=?");
//                   st.setString(1, userName);
//                   st.setString(2, password);
//        
//                   ResultSet rs = st.executeQuery();
//                   if (rs.next()) {
//                    setVisible(false);
//                    new Home();                    	     
//                       }
//                       else {
//                    	  JOptionPane.showMessageDialog(this,"Please enter correct details");                   	  
//                       }
//    	              
//    	       } catch (SQLException sqlException) {
//    	           sqlException.printStackTrace();
//    	       }
            if(flag) {
            	setVisible(false);
            	new Home(userName);
            }
            else {
          	  JOptionPane.showMessageDialog(this,"Please enter correct details");
            }
    	}
    	else {
    		String userName = userText.getText();
    		new Register(userName);
  
    		setVisible(false);
    	}
    }
    }

 


public class Login {
	Login(){
		LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
		
		
	}
	
}