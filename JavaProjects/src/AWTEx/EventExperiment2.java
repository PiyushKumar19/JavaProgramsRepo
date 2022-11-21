package AWTEx;
import java.awt.*;
import java.awt.event.*;

class Outer implements ActionListener{
	EventExperiment2 obj;
	Outer(EventExperiment2 obj){
		this.obj=obj;
	}
	public void actionPerformed(ActionEvent e) {
		obj.tf.setText("Welcome User...");
	}
}

public class EventExperiment2 extends Frame {
	
	TextField tf;
	EventExperiment2(){
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		tf=new TextField();
		tf.setBounds(60, 50, 170, 20);
		Button b=new Button("Click Me!!");
		b.setBounds(100, 120, 80, 30);
		b.setBackground(Color.red);
		Outer o=new Outer(this);
		b.addActionListener(o);
		add(b);
		add(tf);
		this.setBackground(Color.DARK_GRAY);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventExperiment2();

	}

}

