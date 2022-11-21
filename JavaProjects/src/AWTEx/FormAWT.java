package AWTEx;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FormAWT extends Frame{
	Label lbTitle, lbName, lbFather, lbAge, lbGender, lbCourse, lbHobbies, lbAddress;
	TextField txtName, txtFather, txtAge;
	TextArea txtAddress;
	Checkbox ckMale, ckFemale, hob1, hob2, hob3, hob4;
	CheckboxGroup ckg;
	Choice Course;
	Button btnSave, btnClear;
	public FormAWT() {
		super("User Registration Form");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		Color formColor= new Color(53,59, 72);
		setBackground(formColor);
		
		Font titleFont=new Font("arial", Font.BOLD, 25);
		Font lbFont=new Font("arial", Font.PLAIN, 18);
		Font txtFont=new Font("arial", Font.PLAIN, 15);
		
		//Base title
		lbTitle = new Label("Registration Form");
		lbTitle.setBounds(250, 40, 300, 50);
		lbTitle.setFont(titleFont);
		lbTitle.setForeground(Color.YELLOW);
		add(lbTitle);
		
		//Title
		lbName=new Label("Name");  
		lbName.setBounds(250,100,150,30);
		lbName.setFont(lbFont);  
		lbName.setForeground(Color.WHITE);
		add(lbName);
		
		txtName=new TextField();
		txtName.setBounds(400,100,400,30);
		txtName.setFont(txtFont);
		add(txtName);
		
		//Father Name
		lbFather = new Label("Father Name");
		lbFather.setBounds(250, 150, 400, 30);
		lbFather.setFont(txtFont);
		lbFather.setForeground(Color.WHITE);
		add(lbFather);
		
		txtFather=new TextField();
		txtFather.setBounds(400,150,400,30);
		txtFather.setFont(txtFont);
		add(txtFather);
		
		//Age
		lbAge = new Label("Age");
		lbAge.setBounds(250, 150, 400, 30);
		lbAge.setFont(txtFont);
		lbAge.setForeground(Color.WHITE);
		add(lbAge);
		
		txtAge=new TextField();
		txtAge.setBounds(400,100,400,30);
		txtAge.setFont(txtFont);
		add(txtAge);
		
		//Gender
		lbGender = new Label("Gender");
		lbGender.setBounds(250, 150, 400, 30);
		lbGender.setFont(lbFont);
		lbGender.setForeground(Color.WHITE);
		add(lbGender);
		
		ckg = new CheckboxGroup();
		
		//Male
		ckMale = new Checkbox("Male",ckg,true);
		ckMale.setBounds(400,250, 100, 30);
		ckMale.setFont(lbFont);
		ckMale.setForeground(Color.WHITE);
		add(ckMale);
 
		ckFemale = new Checkbox("Female",ckg,false);
		ckFemale.setBounds(500,250, 100, 30);
		ckFemale.setFont(lbFont);
		ckFemale.setForeground(Color.WHITE);
		add(ckFemale);
 
		//Course
		lbCourse=new Label("Course");  
		lbCourse.setBounds(250,300,150,30);
		lbCourse.setFont(lbFont);
		lbCourse.setForeground(Color.WHITE);
		add(lbCourse);
 
		Course= new Choice();
		Course.setFont(lbFont);
		Course.setBounds(400, 300, 400, 50);
		Course.add("C");
		Course.add("C++");
		Course.add("Java");
		Course.add("C#");
		Course.add("Python");
		add(Course);
		
		//Hobbies
		lbHobbies=new Label("Hobbies");  
		lbHobbies.setBounds(250,350,150,30);
		lbHobbies.setFont(lbFont);
		lbHobbies.setForeground(Color.WHITE);
		add(lbHobbies);
 
		hob1=new Checkbox("Drawing");
		hob1.setBounds(400, 350, 100, 50);
		hob1.setFont(lbFont);
		hob1.setForeground(Color.WHITE);
		add(hob1);
 
		hob2=new Checkbox("Singing");
		hob2.setBounds(500, 350, 100, 50);
		hob2.setFont(lbFont);
		hob2.setForeground(Color.WHITE);
		add(hob2);
 
		hob3=new Checkbox("Music");
		hob3.setBounds(600, 350, 100, 50);
		hob3.setFont(lbFont);
		hob3.setForeground(Color.WHITE);
		add(hob3);
 
		hob4=new Checkbox("Others");
		hob4.setBounds(700, 350, 100, 50);
		hob4.setFont(lbFont);
		hob4.setForeground(Color.WHITE);
		add(hob4);
 
		//Address
		lbAddress=new Label("Address");  
		lbAddress.setBounds(250,400,150,30);
		lbAddress.setFont(lbFont);
		lbAddress.setForeground(Color.WHITE);
		add(lbAddress);
 
		txtAddress=new TextArea(10,30);
		txtAddress.setBounds(400,400,400,100);
		txtAddress.setFont(lbFont);
		add(txtAddress);
		
		//Save Button
		btnSave=new Button("Save Details");
		btnSave.setBounds(400,530,150,30);
		btnSave.setFont(lbFont);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.WHITE);
		add(btnSave);
 
		//Clear Button
		btnClear=new Button("Clear All");
		btnClear.setBounds(560,530,150,30);
		btnClear.setFont(lbFont);
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		add(btnClear);
		
		//Code for button closing
		this.addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		FormAWT f=new FormAWT();

	}

}
