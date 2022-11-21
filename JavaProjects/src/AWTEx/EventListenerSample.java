package AWTEx;
import java.awt.*;
import java.awt.event.*;

public class EventListenerSample extends Frame implements ActionListener {

	TextField tf;
	EventListenerSample(){
		tf=new TextField();
		tf.setBounds(60,50,170,20);
		Button b=new Button("Click me");
		b.setBounds(100, 120, 80, 30);
		
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		b.addActionListener(this);
		add(b);
		add(tf);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome");
	}
	public static void main(String[] args) {
		new EventListenerSample();

	}

}
