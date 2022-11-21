package AWTEx;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;    

public class WindowExample extends Frame {
	WindowExample()
	{
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
	}

	public static void main(String[] args) {
		WindowExample s=new WindowExample();

	}

}
