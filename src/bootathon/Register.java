package bootathon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


class RegformFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel register = new JLabel("Register");
	JLabel firstname=new JLabel("FIRSTNAME");
	JLabel lastname=new JLabel("LASTNAME");
    JLabel username=new JLabel("USERNAME");
    JLabel emailid=new JLabel("EMAILID");
    JLabel phone_number=new JLabel("CONTACT");
    JLabel country=new JLabel("PASSWORD");
    JLabel state = new JLabel("CONFIRM_PASSWORD");
    JLabel password = new JLabel("COUNTRY");
    JLabel confirm_password= new JLabel("STATE");
    JTextField firstText=new JTextField();
    JTextField lastText=new JTextField();
    JTextField userText=new JTextField();
    JTextField emailText=new JTextField();
    JTextField phoneText=new JTextField();
    JPasswordField passwordText=new JPasswordField();
    JPasswordField confirmText=new JPasswordField();
    JTextField countryText = new JTextField();
    JTextField stateText = new JTextField();
    JButton Signup=new JButton("SIGNUP");
    public String Username;


	

	RegformFrame(String Username){
	
    setLayout(null);
    register.setFont(new Font("Serif", Font.PLAIN, 24));
       register.setBounds(200, 30, 100, 30);
       firstname.setBounds(50,100,100,30);
       lastname.setBounds(50,150,100,30);
       username.setBounds(50,200,100,30);
       phone_number.setBounds(50,250,100,30);
       emailid.setBounds(50,300,100,30);
       password.setBounds(50,350,100,30);
       confirm_password.setBounds(50,400,200,30);
       country.setBounds(50,450,200,30);
       state.setBounds(50,500,200,30);     
       firstText.setBounds(250,100,150,30);
       lastText.setBounds(250,150,150,30);
       userText.setBounds(250,200,150,30);
       phoneText.setBounds(250,250,150,30);
       emailText.setBounds(250,300,150,30);
       countryText.setBounds(250,350,150,30);
       stateText.setBounds(250,400,150,30);
       passwordText.setBounds(250,450,150,30);
       confirmText.setBounds(250,500,150,30);
       Signup.setBounds(150,550,100,30);       
       add(register);
       add(firstname);
       add(lastname);
       add(username);
       add(emailid);
       add(password);
       add(confirm_password);
       add(phone_number);
       add(country);
       add(state);
       add(userText);
       add(passwordText);
       add(firstText);
       add(lastText);
       add(confirmText);
       add(emailText);
       add(phoneText);
       add(countryText);
       add(stateText);
       add(Signup);      
       Signup.addActionListener(this);      
   }
	
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
    	String username = userText.getText();
    	String firstname=firstText.getText();
    	String secondname=lastText.getText();
		String email = emailText.getText();
		String number = phoneText.getText();
		String password = passwordText.getText();
		String country= countryText.getText();
		String state = stateText.getText();
		String confirm = confirmText.getText();
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		 boolean result = email.matches(regex);
    	if (e.getSource() == Signup  ) {
    		
    		
    		if(!password.equals(confirm) || password.equals(null)) {
    			JOptionPane.showMessageDialog(this,"password mismatch");
    		}
    		else if (number.length()< 10){
    			JOptionPane.showMessageDialog(this,"phone number must contain 10 digits");
    				
    		}
    		else if(!result || email.equals(null) ) {
    			
    			JOptionPane.showMessageDialog(this,"invalid email");
    		}
    		else {
    			App app = new App();
    			app.Register(username, password, firstname, secondname, email, country, state);
    			JOptionPane.showMessageDialog(this,"Registered");
                 setVisible(false);
                 new Login();
    			
    			
    			
//    			PreparedStatement ps = null;
//    			try {
//        			
//     	           Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
//     	               "root", "guruyamu2002");
//     	           String query = "INSERT INTO USER VALUES('"+username+"','"+password+"','"+email+"','"+country+"','"+state+"','"+number+"')";
//
//     	           ps = con.prepareStatement(query);
//
//                    ps.execute();
//                    
//                   JOptionPane.showMessageDialog(this,"Registered");
//                   setVisible(false);
//                   new Login();
//                   
//                        
//     	              
//     	       } catch (SQLException sqlException) {
//     	           sqlException.printStackTrace();
//     	       }		
    		}
    		
    	}
    	
    }
}
 


public class Register {
	Register(String Username){
        RegformFrame frame=new RegformFrame(Username);
        frame.setTitle("Registration Form");
        frame.setVisible(true);
        frame.setBounds(10,10,500,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
 
    }
}
