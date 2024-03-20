package flappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener
{
    public static FlappyBird flappyBird;

    public final int WIDTH = 800, HEIGHT = 800;

    public Renderer renderer;

    public Rectangle bird;
    
    public FlappyBird()
    {

        JFrame jframe = new JFrame();
        
        renderer = new Renderer();

        Timer timer = new Timer(20, this);

        bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);



        jframe.add(renderer);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setVisible(true);

        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
    
        renderer.repaint();
        
    }
    public void repaint(Graphics g) 
    {
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.ORANGE);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);
    }
    public static void main (String[] args)
    {
        
        flappyBird = new FlappyBird();

    }
    
}
