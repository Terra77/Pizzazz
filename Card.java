/*
 *  @author ICarroll
 */
package Pizzazz;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card {
	private String faceName;
	private int faceValue;
	private BufferedImage cardImage;
	
	/**
	 * The constructor for the Card class
	 * @param face = "B", "C", "D" etc
	 * @param value = 15, 15, 10 etc
	 * @param card = a BufferedIamge that represents the card
	 */
	
	public Card(String face, int value, BufferedImage card)
	{
		faceName = face;
		faceValue = value;
		cardImage = card;
		
	}
	
	public String toString()
	{
		return faceName;
	}
	
	public int getfaceValue()
	{
		return faceValue;
	}
	
	public static void main(String[] args) throws IOException
	{
		Card letterB = new Card("B",15,ImageIO.read(new File("letterB.png")));
		
		System.out.println("The letter " + letterB.toString() + " has a value of " + letterB.faceValue);
		
		JFrame window = new JFrame("Display card");
		window.setSize(400,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		JPanel contentPane = new JPanel(new BorderLayout());
		
		JLabel cardLabel = new JLabel(new ImageIcon(letterB.getCardImage()));
		cardLabel.setSize(300,400);
		
		contentPane.add(cardLabel);
		window.add(contentPane);
		
		window.setVisible(true);
	}


	
}
