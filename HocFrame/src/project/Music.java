package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

public class Music implements ActionListener{
	
	Player player;
	JFrame frame;
	JButton button;
	
	public Music() {
		frame = new JFrame();
		frame.setSize(400, 350);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		button = new JButton("Play");
		button.setBounds(50, 100, 100, 50);
		button.addActionListener(this);
		try {
			player = new Player(new FileInputStream("music/nhac1.mp3"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Music();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			try {
				player.play();
			} catch (JavaLayerException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
