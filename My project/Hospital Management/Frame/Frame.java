package Frame;
import Entity.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Frame extends JFrame implements MouseListener, ActionListener
{
	private Font f1, f2;
	private Color c1, c2;
	private JPanel panel;
	private JLabel label1, label2, label3, label4, label5, label6, label7,lebel8,label9,label10;
	private JTextField tf1;
	private JPasswordField pf1;
	private JButton bt1, bt2, bt3;
	private JRadioButton rb1, rb2;
	private ButtonGroup bg;
	private JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8,cb9,cb10,cb11,cb12,cb13,cb14;
	private JComboBox cb;
	private JTextArea ta, ta2;
	private ImageIcon img;
	
	public Frame(){
	super("MY PROJECT");
		super.setBounds(200,10,1000,800); 
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		c2 = new Color(187, 222, 251);
		panel.setBackground(c2);
		
		f1 = new Font("Arial",Font.BOLD, 30); 
		f2 = new Font("Arial",Font.BOLD, 20); 
		c1 = new Color(32,42,68);
		
		label1 = new JLabel("HOSPITALIZED MANAGEMENT");
		label1.setBounds(180, 0, 500,40);
		label1.setFont(f1);
		label1.setForeground(c1);
		label1.addMouseListener(this);
		panel.add(label1);
		
		label3 = new JLabel("Patient Name :");
		label3.setBounds(10, 50, 150,30);
		label3.setFont(f2);
		panel.add(label3);
		
		tf1 = new JTextField();
		tf1.setBounds(150, 50, 350,30);
		tf1.setFont(f2);
		panel.add(tf1);
		
		label4 = new JLabel("Patient age  :");
		label4.setBounds(10, 90, 350,30);
		label4.setFont(f2);
		panel.add(label4);
		
		pf1 = new JPasswordField();
		pf1.setBounds(150, 90,350,30);
		pf1.setFont(f2);
		pf1.setEchoChar('*');
		pf1.addActionListener(this);
		panel.add(pf1);
		
		bt3 = new JButton("Show");
		bt3.setBounds(520,90,150,30); 
		bt3.setFont(f2);
		bt3.setBackground(Color.GREEN);
		bt3.addActionListener(this);
		panel.add(bt3);
		
		label4 = new JLabel("Patient Gender :");
		label4.setBounds(10,130,180,30); 
		label4.setFont(f2);
		panel.add(label4);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(170,130,80,30); 
		rb1.setFont(f2);
		panel.add(rb1);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(270,130,100,30);
		rb2.setFont(f2);
		panel.add(rb2);
		
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		label5 = new JLabel("Disease :");
		label5.setBounds(10,200,150,30); 
		label5.setFont(f2);
		panel.add(label5);
		
		cb1 = new JCheckBox("Opthalmology");
		cb1.setBounds(110,200,360,30); 
		cb1.setFont(f2);
		panel.add(cb1);
		
		cb2 = new JCheckBox("Cardiovascular Disease");
		cb2.setBounds(110,250,360,30); 
		cb2.setFont(f2);
		panel.add(cb2);
		
		cb3 = new JCheckBox("Diabetes ");
		cb3.setBounds(110,300,360,30); 
		cb3.setFont(f2);
		panel.add(cb3);
		
		cb4 = new JCheckBox("Dementia and Alzheimer's Disease");
		cb4.setBounds(110,350,360,30);
		cb4.setFont(f2);
		panel.add(cb4);

		cb5 = new JCheckBox("Cancer");
		cb5.setBounds(550,350,370,30); 
		cb5.setFont(f2);
		panel.add(cb5);

		cb6 = new JCheckBox("Infectious Diseases");
		cb6.setBounds(550,200,370,30); 
		cb6.setFont(f2);
		panel.add(cb6);
		
		cb7 = new JCheckBox("Respiratory Diseases");
		cb7.setBounds(550,250,370,30); 
		cb7.setFont(f2);
		panel.add(cb7);
		
		cb8 = new JCheckBox(" Mental Health Conditions");
		cb8.setBounds(550,300,370,30); 
		cb8.setFont(f2);
		panel.add(cb8);
		
		label6 = new JLabel("Doctor Details :");
		label6.setBounds(10,400,150,30);
		label6.setFont(f2);
		panel.add(label6);

		String items[] = new String[] 
		{"Dr. Asif - ENT Specelist", "Dr.Raj - Cardiologist", "Dr. Asha - Endocrinologist", "Dr. Naim - Neurologists","Dr. Toma - Oncologist","Dr.Faruk - Infectiologist","Dr.Adil - Respirologist","Dr.Noman - Psychiatrist"};
		cb = new JComboBox(items);
		cb.setBounds(170, 400, 270,30);
		cb.setFont(f2);
		cb.setForeground(Color.RED);
		panel.add(cb);

		label6 = new JLabel("Diagnostic :");
		label6.setBounds(10,450,150,30); 
		label6.setFont(f2);
		label6.setBackground(Color.WHITE);
		
		panel.add(label6);
		
		cb9 = new JCheckBox("X-Ray");
		cb9.setBounds(130,450,160,30); 
		cb9.setFont(f2);
		panel.add(cb9);
		
		cb10 = new JCheckBox("MRI");
		cb10.setBounds(130,500,160,30); 
		cb10.setFont(f2);
		panel.add(cb10);

		cb11 = new JCheckBox("ECG");
		cb11.setBounds(130,550,160,30); 
		cb11.setFont(f2);
		panel.add(cb11);
		
		cb12 = new JCheckBox("ETT");
		cb12.setBounds(130,600,160,30); 
		cb12.setFont(f2);
		panel.add(cb12);
		
		cb13 = new JCheckBox("OGTT");
		cb13.setBounds(130,650,160,30); 
		cb13.setFont(f2);
		panel.add(cb13);
		
		cb14 = new JCheckBox("ESR");
		cb14.setBounds(130,700,160,30); 
		cb14.setFont(f2);
		panel.add(cb14);
		
		label7 = new JLabel("Medicine for Disease:");
		label7.setBounds(310,450,250,30); 
		label7.setFont(f2);
		label7.addMouseListener(this);
		panel.add(label7);
		
		ta = new JTextArea();
		ta.setBounds(310, 480, 200,210);
		ta.setFont(f2);
		panel.add(ta);
		
		img = new ImageIcon("Picture/MEDICAL.png");
		label9 = new JLabel(img);
		label9.setBounds(700, 10, 200, 180);
		panel.add(label9);
		
		label10 = new JLabel("Details :");
		label10.setBounds(680,380,250,30); 
		label10.setFont(f2);
		label10.setBackground(Color.WHITE);
		panel.add(label10);
		
		ta2 = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(ta2);
		scrollPane.setBounds(520, 410, 420,280);
		ta2.setFont(f2);
		panel.add(scrollPane);
		
		bt1 = new JButton("Submit");
		bt1.setBounds(620, 700, 100,30);
		bt1.setFont(f2);
		bt1.setBackground(Color.GREEN);
		bt1.addMouseListener(this);
		bt1.addActionListener(this);
		panel.add(bt1);
		
		bt2 = new JButton("Exit");
		bt2.setBounds(740, 700, 100,30);
		bt2.setFont(f2);
		bt2.setBackground(Color.RED);
		bt2.addActionListener(this);
		panel.add(bt2);
		
		super.add(panel);
	}
	public void mouseClicked(MouseEvent me)
	
	{
		if(me.getSource() == label1)
		{
			label1.setText("Medicine");
		}
		else { }
	}
	public void mousePressed(MouseEvent me) 
	{ 
		if(me.getSource() == label7)
		{
			label7.setText("Prasurel");
		}
		else { }
	}
	public void mouseReleased(MouseEvent me) 
	{ 
		if(me.getSource() == label7)
		{
			label7.setText("Medicine for Disease:");
		}
		else { }
	}
		public void mouseEntered(MouseEvent me) 
		{ 
		if(me.getSource() == bt1)
		{
			bt1.setBackground(Color.BLUE);
			bt1.setForeground(Color.WHITE);
		}
		else { }
	}
	public void mouseExited(MouseEvent me) 
	{
		if(me.getSource() == bt1)
		{
			bt1.setBackground(Color.GREEN);
			bt1.setForeground(Color.WHITE);
		}
		else { }
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == bt2)
		{
			System.exit(0);
		}
		if(ae.getSource() == bt3)
		{
			pf1.setEchoChar((char)0);
		}
		if(ae.getSource() == bt1)
		{
		String s1, s2, s3, s4, s7, s5, s6;
		s1 = tf1.getText();
		s2 = pf1.getText();
		if(rb1.isSelected()) { s3 = rb1.getText(); }
		else if(rb2.isSelected()) { s3 = rb2.getText(); }
		else { s3 = ""; }
		
		if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected() && cb4.isSelected() && cb5.isSelected() && cb6.isSelected() && cb7.isSelected() && cb8.isSelected() && cb9.isSelected() && cb10.isSelected() && cb11.isSelected() && cb12.isSelected() && cb13.isSelected() && cb14.isSelected())
			{
				s4 = cb1.getText()+" "+cb2.getText()+" "+cb3.getText()+" "+cb4.getText()+" "+cb5.getText()+" "+cb6.getText()+" "+cb7.getText()+" "+cb8.getText()+" "+cb9.getText()+" "+cb10.getText()+" "+cb11.getText()+" "+cb12.getText()+" "+cb13.getText()+" "+cb14.getText();
			}
			else if(cb1.isSelected()) { s4 = cb1.getText(); }
			else if(cb2.isSelected()) { s4 = cb2.getText(); }
			else if(cb3.isSelected()) { s4 = cb3.getText(); }
			else if(cb4.isSelected()) { s4 = cb4.getText(); }
			else if(cb5.isSelected()) { s4 = cb5.getText(); }
			else if(cb6.isSelected()) { s4 = cb6.getText(); }
			else if(cb7.isSelected()) { s4 = cb7.getText(); }
			else if(cb8.isSelected()) { s4 = cb8.getText(); }
			else { s4 = ""; }
		
		if(cb9.isSelected() && cb10.isSelected() && cb11.isSelected() && cb12.isSelected() && cb13.isSelected() && cb14.isSelected())
			{
				s7 = cb9.getText()+" "+cb10.getText()+" "+cb11.getText()+" "+cb12.getText()+" "+cb13.getText()+" "+cb14.getText();
			}
			else if(cb9.isSelected()) { s7 = cb9.getText(); }
			else if(cb10.isSelected()) { s7 = cb10.getText(); }
			else if(cb11.isSelected()) { s7 = cb11.getText(); }
			else if(cb12.isSelected()) { s7 = cb12.getText(); }
			else if(cb13.isSelected()) { s7 = cb13.getText(); }
			else if(cb14.isSelected()) { s7 = cb14.getText(); }
			else { s7 = ""; }
			s5 = cb.getSelectedItem().toString();
			s6 = ta.getText();
				if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s4.isEmpty() || s7.isEmpty() || s6.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Please fill up all information!");
			}
			else 
			{
				Management obj1 = new Management(s1,s2,s3,s4,s7,s5,s6);
				obj1.insertInfo();
				JOptionPane.showMessageDialog(this,"Information saved!");
				check();
			}
		}
	}
			
	private void check() {
        try {
            File file = new File("./Data/userdata.txt");
            if (file.exists()) {
				FileReader fr = new FileReader(file); 
                BufferedReader br = new BufferedReader(fr); 
                String line;
                while ((line = br.readLine()) != null) {
                    ta2.append(line + "\n");
                }
                br.close();
            }
        }
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this,"Error!");
		}
    }
}