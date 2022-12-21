package bootathon;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class PersonalformFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;	
	JLabel firstname=new JLabel("FIRSTNAME");
	JLabel lastname=new JLabel("LASTNAME");
    JLabel emailid=new JLabel("EMAILID");
    JLabel phone_number=new JLabel("CONTACT");
    JLabel linkedin = new JLabel("LINKEDIN URL");
    JLabel profession= new JLabel("PROFESSION");
    JLabel country=new JLabel("COUNTRY");
    JLabel state = new JLabel("STATE");
    JLabel address = new JLabel("ADDRESS");    
    JTextField firstText=new JTextField();
    JTextField lastText=new JTextField();
    JTextField emailText=new JTextField();
    JTextField phoneText=new JTextField();
    JTextField linkedinText=new JTextField();
    JTextField professionText=new JTextField();
     JTextField countryText = new JTextField();
    JTextField stateText = new JTextField();
    JTextArea addressText = new JTextArea();
    JButton next=new JButton("NEXT");
    String username;
    
	PersonalformFrame(String username){
	   this.username=username;
	   setLayout(null);
       firstname.setBounds(50,50,100,30);
       lastname.setBounds(50,100,100,30);
       phone_number.setBounds(50,150,100,30);
       emailid.setBounds(50,200,100,30);
       linkedin.setBounds(50,250,100,30);
       profession.setBounds(50,300,200,30);
       country.setBounds(50,350,200,30);
       state.setBounds(50,400,200,30);
       address.setBounds(50,450,200,30);      
       firstText.setBounds(250,50,150,30);
       lastText.setBounds(250,100,150,30);
       phoneText.setBounds(250,150,150,30);
       emailText.setBounds(250,200,150,30);
       linkedinText.setBounds(250,250,150,30);
       professionText.setBounds(250,300,150,30);
       countryText.setBounds(250,350,150,30);
       stateText.setBounds(250,400,150,30);
       addressText.setBounds(250,450,150,50);
       next.setBounds(180,530,100,30);
       add(firstname);
       add(lastname);
       add(emailid);
       add(phone_number);
       add(linkedin);
       add(profession);
       add(country);
       add(state);
       add(address);
       add(firstText);
       add(lastText);
       add(emailText);
       add(phoneText);
       add(linkedinText);
       add(professionText);
       add(countryText);
       add(stateText);
       add(addressText);
       add(next); 
       next.addActionListener(this);
	}
	
	
    @Override
    public void actionPerformed(ActionEvent e) {
//    	String firstname = firstText.getText();
//    	String lastname = lastText.getText();
//		String email = emailText.getText();
//		String number = phoneText.getText();
		String linkedin = linkedinText.getText();
		String profession = professionText.getText();
//		String country= countryText.getText();
//		String state = stateText.getText();
		String address = addressText.getText();
		
    	if (e.getSource() == next  ) {
    		App app = new App();
    		app.Personal(username,linkedin, profession, address);
    		
//    			PreparedStatement ps = null;
//    			try {
//        			
//     	           Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
//     	               "root", "guruyamu2002");
//     	           String query = "INSERT INTO personal VALUES('"+firstname+"','"+lastname+"','"+email+"','"+number+"','"+linkedin+"','"+profession+"','"+country+"','"+state+"','"+address+"')";
//
//     	           ps = con.prepareStatement(query);
//                   ps.execute();
//                    //next page
//                    setVisible(false);
//     	       } catch (SQLException sqlException) {
//     	           sqlException.printStackTrace();
//     	       }		
    		setVisible(false);
    		new Description(username);
    		}
    	}
}
public class Personal {
	Personal(String username){
        PersonalformFrame frame=new PersonalformFrame(username);
        frame.setTitle("PersonalInfo Form");
        frame.setVisible(true);
        frame.setBounds(10,10,500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
 
    }

}
