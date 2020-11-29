import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Bounce extends JFrame {
    private JPanel canvas;
	public Bounce() {
      setSize(300, 200);
      setTitle("Bounce");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  Container contentPane = getContentPane();
      canvas = new JPanel();
      contentPane.add(canvas, "Center");
      JPanel p = new JPanel();
      JButton start = new JButton("Start");
	  start.addActionListener(new ActionListener()
         {  public void actionPerformed(ActionEvent evt)
            {  Ball b = new Ball(canvas);
               b.bounce();
            }
         });
      p.add(start);
      contentPane.add(p, "South");
   }
  
   public static void main(String[] args) {
     JFrame frame = new Bounce();
      frame.show();
   }		
}

class Ball  {
   private JPanel box;
   private static final int XSIZE = 30;
   private static final int YSIZE = 30;
   private int x = 0;
   private int y = 0;
   private int dx = 2;
   private int dy = 2;
  

	public Ball(JPanel b) { box = b; }

   public void draw()
   {  Graphics g = box.getGraphics();
      g.fillOval(x, y, XSIZE, YSIZE);
      g.dispose();
   }

   public void move()
   {  Graphics g = box.getGraphics();
      g.setXORMode(box.getBackground());
      g.fillOval(x, y, XSIZE, YSIZE);
      x += dx;
      y += dy;
      Dimension d = box.getSize();
      if ((x < 0) || (x + XSIZE >= d.width))   dx = -dx;
      if ((y < 0) || (y + YSIZE >= d.height))  dy = -dy; 
      g.fillOval(x, y, XSIZE, YSIZE);
      g.dispose();
   }

   public void bounce()
   {  draw();
      for (int i = 1; i <= 1000; i++)
      {  move();
         try { Thread.sleep(5); }
         catch(InterruptedException e) {}
      }
   }
}


