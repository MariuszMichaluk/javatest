import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class Hello extends JFrame 
{
	public Hello ()
	{
		setSize(300,200);
		setTitle("OKIENKO");
		
	}

	public static void main(String[] args) 
	{
		Hello okienko = new Hello();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("Guziczek");
		JLabel label = new JLabel("Jakis napis");
		label.setVisible(false);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setVisible(!label.isVisible());
			}
		});
		panel.setSize(200, 100);
		panel.add(button);
		panel.add(label);
		okienko.add(panel);
	
	}

}
