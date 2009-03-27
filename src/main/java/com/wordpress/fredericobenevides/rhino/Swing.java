package com.wordpress.fredericobenevides.rhino;
import java.awt.Color;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Swing implements Runnable {
	
	private Label label;
	private int labelWidth = 136;
	private int labelHeight = 12;
	private int labelX;
	private int labelY;
	private int labelAX = 1;
	private int labelAY = 6;
	
	
	private JFrame frame;
	
	public void criarFrame() {
		labelX = (int) (1 + Math.random() * 450);
		labelY = (int) (1 + Math.random() * 358);
		
		label = new Label("* Frederico Benevides *");
		label.setForeground(Color.YELLOW);
		label.setBounds(labelX, labelY, labelWidth, labelHeight);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setSize(600, 400);
		panel.add(label);
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.add(panel);
		frame.setSize(600, 400);
		frame.setVisible(true);
		
		Thread t = new Thread(this);
		t.start();
	}
	
	
	public static void main(String[] args) {
		new Swing().criarFrame();
	}


	@Override
	public void run() {
		while (true) {
			label.setBounds(labelX, labelY, labelWidth, labelHeight);
			
			if (labelX < 1 || labelX >= 450) {
				labelAX = -labelAX;
			}
			if (labelY < 1 || labelY >= 358) {
				labelAY = -labelAY;
			}
			labelX += labelAX;
			labelY += labelAY;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
