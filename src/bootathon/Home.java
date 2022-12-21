package bootathon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Home extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String username;
    Home(String username){
    	this.username=username;
		JFrame f = new JFrame("Home Page");
		JButton c = new JButton("Create CV");
		JButton l = new JButton("Log Out");
		JButton about = new JButton("About");		
		c.setBounds(150,200,210,75);		
		c.setFont(new Font("Arial", Font.PLAIN, 20));
		c.setBorder(new RoundBtn(45));
		c.setBackground(Color.decode("#3F0071"));
		c.setForeground(Color.WHITE);		
		l.setBounds(350,25,100,30);
		about.setBounds(25,25,100,30);		
		c.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    f.setVisible(false);
				      new Personal(username);
				    }
				  }
				);
		l.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				      //log out code
				    	
				    	new Login();
				    	f.setVisible(false);
				    }
				  }
				);
		about.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	JFrame about_frame = new JFrame("About Us");
				    	JButton goback = new JButton("Back");
				    	goback.setBounds(0,0,100,30);
				    	String about_us = "Each of the templates is designed keeping in mind the modern HR recruiter. Our templates are unique, HR tested, and make you stand out from the crowd of applicants.";
				    	JTextArea about = new JTextArea(about_us);
				    	about.setEditable(false);
				    	about.setBounds(50,150,400,150);
				    	about.setBackground(Color.white);
				    	about.setLineWrap(true);
				    	about.setFont(new Font("Serif", Font.BOLD | Font.BOLD , 20));
				    	about.setWrapStyleWord(true);			    	
				    	JTextArea slogan = new JTextArea("Modern and Professional job-ready resume templates");
				    	slogan.setBackground(Color.white);
				    	slogan.setBounds(50,50,400,100);
				    	slogan.setLineWrap(true);
				    	slogan.setFont(new Font("Serif", Font.BOLD, 24));
				    	slogan.setWrapStyleWord(true);
				    	about_frame.add(goback);
				    	about_frame.add(about);
				    	about_frame.add(slogan);
				    	about_frame.setLayout(null);
				    	about_frame.setSize(500,500);
				    	about_frame.setVisible(true);				    	
				    	goback.addActionListener(
								  new ActionListener() {
								    public void actionPerformed(ActionEvent e) {
								      about_frame.dispose();
								    }
								  }
								);
				    }
				  }
				);
		
		f.add(c);
		f.add(l);
		f.add(about);		
		f.setLayout(null);		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(600,600);}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class RoundBtn implements Border 
{
    private int r;
    RoundBtn(int r) {
        this.r = r;
    }
    public Insets getBorderInsets(Component c) {
        return new Insets(this.r+1, this.r+1, this.r+2, this.r);
    }
    public boolean isBorderOpaque() {
        return true;
    }
    public void paintBorder(Component c, Graphics g, int x, int y, 
    int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, r, r);
    }
}