package AWTEx;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SampleList {
	Frame f;
	List list;
	Label lb1;
	String[] country;
	
	SampleList()
	{
		f=new Frame("Java AWT list example.");
		f.addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		list=new List(6);
		lb1= new Label("Select your country from the list : ");
		list.add("India");
		list.add("Australia");
		list.add("America");
		list.add("Russia");
		list.add("France");
		list.add("China");
		f.add(lb1);
		f.add(list);
		f.setLayout(new FlowLayout());
		f.setSize(260, 220);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		SampleList sampleList1=new SampleList();

	}

}
