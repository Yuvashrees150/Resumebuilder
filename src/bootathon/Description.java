package bootathon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DescriptionpageFrame extends JFrame  implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String username;

	DescriptionpageFrame(String username){
		this.username=username;
		JFrame f = new JFrame("PERSONAL DESCRIPTION");
		JLabel Personal_description = new JLabel("PERSONAL DESCRIPTION");
		JLabel Description = new JLabel("Description:");
		JTextArea descrip = new JTextArea();
		JButton Next=new JButton("NEXT");
		f.setLayout (null);				
		Personal_description.setBounds(400,15,300,30);
		Description.setBounds(30, 60, 100, 30);
		descrip.setBounds(150,60,750,350);
		Description.setFont(new Font("Arial", Font.PLAIN, 18));
		Personal_description.setFont(new Font("Arial", Font.PLAIN, 18));
		Next.setBounds(860,500,100,30);	
		String description=descrip.getText();
		Next.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
//			    	try{   
//				    		Connection con=DriverManager.getConnection(  
//				    		"jdbc:mysql://localhost:3306/sample","root","guruyamu2002");  				    		//here reg is database name, root is the username and password  				    		Statement stmt=con.createStatement(); 
//				    		String Description = descrip.getText();
//				    		Statement stmt = con.createStatement();
//				    		stmt.executeUpdate("insert into description values('"+username+"','"+Description+"');");
//				    		
//				    		}				    	catch(Exception ex){ 
//				    		System.out.println(ex);
//				    
//				    		}  
				    	
				    	
				    	App app = new App();
				    	app.Description(username,description);
				    	f.setVisible(false);
				    	new Skills(username);
				    }
				  }
				);
		
		f.add(Personal_description);
		f.add(descrip);
		f.add(Description);
		f.add(Next);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	    f.setVisible(true);
	    f.setBounds(100,50,1000,600);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setResizable(false);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			}	}


public class Description  {
	
	Description(String username){
		new DescriptionpageFrame(username);	}
}