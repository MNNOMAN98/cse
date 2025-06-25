package Entity;
import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Management
{
	private String s1;
	private String s2;
	private String s3;
	private String s4;
	private String s5;
	private String s6;
	private String s7;
	
	private File file;
	private FileWriter fwriter;
	
	public Management() { }
	public Management(String s1, String s2, String s3, String s4, String s7, String s5, String s6)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s7 = s7;
		this.s5 = s5;
		this.s6 = s6;
		
	}
	public void insertInfo()
	{
		try 
		{
			file = new File("./Data/userdata.txt");
			if (!file.exists()) {
                file.getParentFile().mkdirs(); 
                file.createNewFile(); 
            }
			
			
			LocalDateTime myDateObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");
			String timeAndDate = myDateObj.format(myFormatObj);
			
			fwriter = new FileWriter(file, true);
			fwriter.write("Date and Time: " +timeAndDate+"\n");
			fwriter.write("========================================================"+"\n");
			fwriter.write("Patient Name: "+s1+"\n");
			fwriter.write("Age : "+s2+"\n");
			fwriter.write("Patient Gender: "+s3+"\n");
			fwriter.write("Patient Disease: "+s4+"\n");
			fwriter.write("Doctor Details: "+s5+"\n");
			fwriter.write("Diagnostic : "+s7+"\n");
			fwriter.write("Medicine for Disease : "+s6+"\n");
			fwriter.write("--------------------------------------------------------"+"\n");
			fwriter.flush(); 
			fwriter.close(); 
		}
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error writing to file!");
		}
	}
}