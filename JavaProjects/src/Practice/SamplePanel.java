package Practice;
import java.awt.*;

public class SamplePanel extends Frame {
	Panel p1,p2;
	Label l1,l2;
	SamplePanel()
	{
		setLayout(new FlowLayout());
		p1=new Panel();
		l1=new Label("Panel 1");
		p1.add(l1);
		Button b1=new Button("Button 1");
		p1.add(b1);
		p1.setBackground(Color.red);
		add(p1);
	}

	public static void main(String[] args) {
		SamplePanel s=new SamplePanel();
		s.setTitle("Hello Java AWT");
		s.setSize(500,300);
		s.setVisible(true);

	}

}
