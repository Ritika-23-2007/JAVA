package Gui;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
public class Main1{
    public static void main(String[] args) {
        // jframe is a class in javax.swing package 
        // and it is used to create a window in Java GUI applications. 
        // It provides a top-level container for other GUI components like buttons, labels, text fields, etc. 
        // The JFrame class allows developers to create windows with various features 
        // such as title bars, borders, and the ability to close or minimize the window.
        //  In this code snippet, an instance of JFrame is created using the default constructor, 
        // and it initializes a new JFrame object that can be customized and displayed on the screen.
        JFrame frame = new JFrame(); // Create a new JFrame object
        frame.setVisible(true);// Make the JFrame visible on the screen
        frame.setSize(400, 300); // Set the size of the JFrame (width: 400 pixels, height: 300 pixels)
        frame.setTitle("My First GUI Application"); // Set the title of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation to exit the application when the window is closed
        frame.setResizable(true);// changes control of the user from resizing the JFrame

        ImageIcon icon1 = new ImageIcon(Main1.class.getResource("/Gui/logo.png"));
        frame.setIconImage(icon1.getImage());
        frame.getContentPane().setBackground(new Color(208, 166, 232)); // Set the background color of the JFrame's content pane to cyan
    }
} 