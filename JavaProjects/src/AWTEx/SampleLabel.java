package AWTEx;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SampleLabel {
	Frame f;
	Label l1,l2,l3,l4;
	SampleLabel()
	{
		f=new Frame("Java AWT Label Example.");
		f.addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		l1=new Label("Hi!");
		l2=new Label("Good Morning!");
		l3=new Label("Good Evening!");
		l4=new Label("Thanks!");
		
		l4.setText("Thanks you and Hello!");
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		
		f.setLayout(new FlowLayout());
		f.setSize(260, 220);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new SampleLabel();

	}

}
