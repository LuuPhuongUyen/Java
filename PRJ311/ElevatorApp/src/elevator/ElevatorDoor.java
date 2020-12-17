package elevator;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ElevatorDoor extends JPanel {

    private int w, h;
    private JButton b, c;
    private JPanel leftDoor, rightDoor;
    private boolean isOpen = false;

    public boolean isOpen() {
        return isOpen;
    }

    public void doorsClose() {
        leftDoor.setVisible(true);
        rightDoor.setVisible(true);
    }

    public void doorsOpen() {
        leftDoor.setVisible(false);
        rightDoor.setVisible(false);
    }

    class EDoor extends JPanel {

        public EDoor() {
            super();
            setBackground(Color.YELLOW);
            setDoubleBuffered(true);
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Image Img = Toolkit.getDefaultToolkit().getImage("door.jpg");
            g.drawImage(Img, 2, 2, getWidth() - 4, getHeight() - 4, this);
        }
    }

    public ElevatorDoor(Elevator e) {
        w = e.getWidths() / 2;
        h = e.getHeights() / e.getFloors();
        setBackground(Color.BLUE);
        setLayout(new BorderLayout());
        JPanel doors = new JPanel(new GridLayout(1, 2, 1, 1));
        doors.setBackground(Color.BLUE);
        leftDoor = new EDoor();
        rightDoor = new EDoor();
        doors.add(leftDoor);
        doors.add(rightDoor);
        add(doors);
        b = new JButton("<||>");
        b.addActionListener(e1 -> {
            open();
        });
        c = new JButton("|><|");
        c.addActionListener(f -> {
            close();
        });
        JPanel p = new JPanel(new GridLayout(1, 2, 5, 5));
        p.add(c);
        p.add(b);
        add(p, BorderLayout.SOUTH);
        setSize(2 * w, h + 60);
        this.setDoubleBuffered(true);
    }

    public void open() {
        if (isOpen) {
            return;
        }
        Graphics g = this.getGraphics();
        g.setColor(Color.ORANGE);
        for (int x = 1; x < w; x++) {
            g.fillRect(1, 0, w - x, h);
            g.fillRect(w + 2 + x, 0, w - x, h);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ElevatorDoor.class.getName()).log(Level.SEVERE, null, ex);
            }
            g.setXORMode(this.getBackground());
            g.fillRect(1, 0, w - x, h);
            g.fillRect(w + 2 + x, 0, w - x, h);
        }
        isOpen = true;
        doorsOpen();
        g.dispose();
    }

    public void close() {
        if (!isOpen) {
            return;
        }
        Graphics g = this.getGraphics();
        g.setColor(Color.ORANGE);
        int x = 0;
        for (x = 1; x < w; x++) {
            g.fillRect(1, 0, x, h);
            g.fillRect(2 * w - x, 0, x, h);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ElevatorDoor.class.getName()).log(Level.SEVERE, null, ex);
            }
            g.setXORMode(this.getBackground());
            g.fillRect(1, 0, x, h);
            g.fillRect(2 * w - x, 0, x, h);
        }
        isOpen = false;
        doorsClose();
        g.dispose();
    }
//--------------------------------------------------------------------------------    

    public static void main(String[] a) {
        JFrame f = new JFrame();
        ElevatorDoor ed = new ElevatorDoor(new Elevator(4));
        //f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setContentPane(ed);
        f.setSize(160, 160);
        f.show();
    }

}
