package AWTEx;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SampleCheckboxRadio {
	Frame f;
	Checkbox cb1, cb2, cb3;
	SampleCheckboxRadio()
	{
		f= new Frame("Java AWT Checkbox Example.");
		f.addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		cb1=new Checkbox();
		
		cb2=new Checkbox("Yes", true);
		
		cb3=new Checkbox("No");
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		
		f.setLayout(new GridLayout());
		f.setSize(260, 220);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new SampleCheckboxRadio();

	}

}
