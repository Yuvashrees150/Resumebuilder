package bootathon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Skillframe extends JFrame implements ActionListener {
	/**
	 * 
	 */
	public String username;
	private static final long serialVersionUID = 1L;
	Skillframe(String username){
	JLabel skills = new JLabel("SKILLS");
	JLabel Domain = new JLabel("DOMAIN");
    JLabel skill=new JLabel("SKILL");
    JRadioButton r1 = new JRadioButton();
    JRadioButton r2 = new JRadioButton();
    JRadioButton r3 = new JRadioButton(); 
    JRadioButton r4 = new JRadioButton();
    r1.setText("CSE");
    r1.setActionCommand("cse");
    r2.setText("ECE");
    r2.setActionCommand("ece");
    r3.setText("EEE");
    r3.setActionCommand("eee");
    r4.setText("Other");
    r4.setActionCommand("other");
    ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    bg.add(r3);
    bg.add(r4);
   
    JLabel description=new JLabel("DESCRIPTION");
    JTextArea skillText=new JTextArea();
    JTextArea descriptionText=new JTextArea();
    JButton submit=new JButton("NEXT");
    setLayout(null);
 skills.setFont(new Font("Serif",Font.PLAIN,24));
       skills.setBounds(300,10,100,100);
       skill.setBounds(50,210,100,30);
       description.setBounds(50,410,100,30);
       Domain.setBounds(50,140,100,30);
       r1.setBounds(150,130,50,50);
       r2.setBounds(200,130,50,50);
       r3.setBounds(250,130,50,50);
       r4.setBounds(300,130,100,50);
       skillText.setBounds(150,200,300,150);
       descriptionText.setBounds(150,400,300,150);
       submit.setBounds(650,600,100,30);
       add(skills);
       add(Domain);
       add(r1);
       add(r2);
       add(r3);
       add(r4);
       add(skill);      
       add(description);
       add(skillText);
       add(descriptionText);
       add(submit);
       
       submit.addActionListener( new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String description= descriptionText.getText();
		    	String skills= skillText.getText();
		    	String domain=bg.getSelection().getActionCommand();
		    	App app = new App();
		    	app.Skills(username,domain, skills, description);
		    	
		    	
		    	
		    }});
      
       
   }



	@Override
	public void actionPerformed(ActionEvent e) {
		
		        
		
	}
}
public class Skills {
	Skills(String username){
        Skillframe frame=new Skillframe(username);
        frame.setTitle("Skills form");
        frame.setVisible(true);
        frame.setBounds(100,200,400,1200);
        frame.setSize(800,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);}
}