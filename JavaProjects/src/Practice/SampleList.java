package Practice;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SampleList {
	Frame f;
	Choice c;
	Label l1;
	SampleList()
	{
		f=new Frame("Hello Java AWT");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		c=new Choice();
		l1=new Label("Select City:");
		c.add("Delhi");
		c.add("Indraprastha");
		c.add("Patliputra");
		f.add(l1);
		f.add(c);
		Button b1=new Button("CLick");
		f.add(b1);
		f.setLayout(new FlowLayout());
		f.setSize(260,220);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		SampleList s=new SampleList();

	}

}
