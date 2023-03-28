package appjava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Créer_joueur {

	public static void main(String[] args) {
		   JTextField t1,t2,t3,t4,t5,t6;
		    JLabel title1=new JLabel("Ajouter equipe");
		    title1.setBounds(10,10,210,50);
		    title1.setFont(new Font("TimesRoman",50,23));
		    JFrame f= new JFrame("Create account");    
		    JLabel l1=new JLabel("id_Equipe");
		    l1.setBounds(10,100,400,30);
		    JLabel l2=new JLabel("NOM Equipe");
		    l2.setBounds(10,150,400,30);
		    t1=new JTextField();  
		    t1.setBounds(250,100, 400,30);  
		    t2=new JTextField();  
		    t2.setBounds(250,150, 400,30);
		    JLabel title2=new JLabel("Modifier equipe");
		    title2.setBounds(10,250,210,50);
		    title2.setFont(new Font("TimesRoman",50,23));
		    JLabel l3=new JLabel("NOM Equipe");
		    l3.setBounds(10,300,400,30);
		    t3=new JTextField();  
		    t3.setBounds(250,300,400,30);
		    JLabel l4=new JLabel("Id_Equipe");
		    l4.setBounds(10,350,400,30);
		    t4=new JTextField();  
		    t4.setBounds(250,350,400,30);   
		    JButton c=new JButton("Create Team");
		    c.setBounds(250, 200, 200, 60);
		    JButton c2=new JButton("Cancel");
		    c2.setBounds(450, 200, 200, 60);
		    JButton c3=new JButton("cancel");
		    c3.setBounds(450, 400, 200, 60);
		    JButton c4=new JButton("Modify Team");
		    c4.setBounds(250, 400, 200, 60);
		    JLabel title3=new JLabel("Supprimer equipe");
		    title3.setBounds(10,450,210,50);
		    title3.setFont(new Font("TimesRoman",50,23));
		    JLabel l5=new JLabel("NOM Equipe");
		    l5.setBounds(10,500,400,30);
		    t5=new JTextField();  
		    t5.setBounds(250,500,400,30);
		    JLabel l6=new JLabel("Id_Equipe");
		    l6.setBounds(10,550,400,30);
		    t6=new JTextField();  
		    t6.setBounds(250,550,400,30);   
		    JButton c5=new JButton("cancel");
		    c5.setBounds(450, 600, 200, 60);
		    JButton c6=new JButton("Delete Team");
		    c6.setBounds(250, 600, 200, 60);
		    f.add(title1);
		    f.add(title3);
		    f.add(l1);
		    f.add(t1);
		    f.add(l2);
		    f.add(t2);  
		    f.add(c);
		    f.add(c2);
		    f.add(c3);
		    f.add(c4);
		    f.add(c5);
		    f.add(c6);
		    f.add(title2);
		    f.add(l3);
		    f.add(t3);
		    f.add(l4);
		    f.add(t4);
		    f.add(t5);
		    f.add(t6);
		    f.add(l5);
		    f.add(l6);
		    
		    f.setBounds(50, 200, 1000, 700);
		    f.setLayout(null);  
		    f.setVisible(true);
		   

	}

}
