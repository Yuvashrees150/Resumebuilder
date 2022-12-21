package bootathon;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class EducaDet extends JFrame implements ActionListener {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String username;
	JLabel college = new JLabel("COLLEGE");
	JLabel school=new JLabel("SCHOOL");
	JLabel domain=new JLabel("DOMAIN");
    JLabel duration=new JLabel("DURATION");
    JLabel cgpa=new JLabel("CGPA");
    
    JTextField collegeText=new JTextField();
    JTextField schoolText=new JTextField();
    JTextField domainText=new JTextField();
    JTextField durationText=new JTextField();
    JTextField cgpaText=new JTextField();
    
    JButton next=new JButton("NEXT");
	EducaDet(String username){
	   setLayout(null);
       
       college.setBounds(50,100,100,30);
       school.setBounds(50,150,100,30);
       domain.setBounds(50,200,100,30);
       duration.setBounds(50,250,100,30);
       cgpa.setBounds(50,300,100,30);
       collegeText.setBounds(150,100,250,30);
       schoolText.setBounds(150,150,250,30);
       domainText.setBounds(150,200,250,30);
       durationText.setBounds(150,250,250,30);
       cgpaText.setBounds(150,300,250,30);
  
       next.setBounds(150,400,100,30);
       
       add(college);
       add(school);
       add(domain);
       add(duration);
       add(cgpa);
       add(collegeText);
       add(schoolText);
       add(domainText);
       add(durationText);
       add(cgpaText);
       add(next);
       next.addActionListener(this);
   }
	
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
    	String coll = collegeText.getText();
		String schoo = schoolText.getText();
		String doma = domainText.getText();
		String durat = durationText.getText();
		String cgp= cgpaText.getText();
    	if (e.getSource() == next  ) {
//    			PreparedStatement ps = null;
//    			try {
//        			
//     	           Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bootathon",
//     	               "root", "guruyamu2002");
//     	           String query = "INSERT INTO edu VALUES('"+coll+"','"+schoo+"','"+doma+"','"+durat+"','"+cgp+"')";
//
//     	           ps = con.prepareStatement(query);
//                   ps.execute();
                     
                   //next page
    		       App app = new App();
    		       int duration = Integer.parseInt(durat);
    		       
    		       app.Education(username,schoo, coll, doma,duration,cgp);
                   setVisible(false);
                   new Skills(username);
                   
                   
                        
     	              
//     	       } catch (SQLException sqlException) {
//     	           sqlException.printStackTrace();
//     	       }		
    		}
    		
    	}
    	
    
}
 


public class Education {
//	public static void main(String[] args){
	    Education(String username){
        EducaDet frame=new EducaDet(username);
        frame.setTitle("Education Details");
        frame.setVisible(true);
        frame.setBounds(10,10,500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}
