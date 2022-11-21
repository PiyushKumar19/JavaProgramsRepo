package AWTEx;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SampleChoice {
	Frame f;
	Choice ch;
	Label l1;
	Button b1;
	
	SampleChoice()
	{
		f=new Frame("Java AWT Choice Example.");
		f.addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		ch=new Choice();
		l1=new Label("Select your country from the Menu :");
		ch.add("India");
		ch.add("Australia");
		ch.add("America");
		ch.add("Russia");
		ch.add("France");
		
		b1=new Button("Submit");
		f.add(l1);
		f.add(ch);
		f.add(b1);
		
		f.setLayout(new FlowLayout());
		f.setSize(260, 220);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		SampleChoice sc= new SampleChoice();

	}

}
