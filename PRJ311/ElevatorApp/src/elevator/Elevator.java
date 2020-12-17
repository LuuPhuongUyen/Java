package elevator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public final class Elevator extends JPanel implements Runnable {

    private int floors, curFloor;
    private final int WIDTHS = 160;
    private final int HEIGHTS = 100;
    private final ElevatorDoor eDoor;
    private ElevatorCommand elc;
    private JPanel controlPane;
    private final JButton[] a;

    public int getFloors() {
        return floors;
    }

    public void createControlPane() {
        ElevatorPane[] eps = new ElevatorPane[floors];
        for (int i = 0; i < floors; i++) {
            eps[i] = new ElevatorPane(this, i, elc);
            this.add(eps[i]);
            eps[i].setBounds(WIDTHS + 1, HEIGHTS * i + 10, 100, HEIGHTS - 10);
        }
    }

    public Elevator(int f) {
        elc = new ElevatorCommand();
        floors = f;
        curFloor = 0;
        this.setBackground(Color.red);
        this.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 4));
        eDoor = new ElevatorDoor(this);
        setLayout(null);
        add(eDoor);
        eDoor.setBounds(0, curFloor * HEIGHTS, WIDTHS, HEIGHTS + 25);
        JPanel cPane = new JPanel(new GridLayout(0, 3, 1, 1));
        a = new JButton[f];
        for (int i = 1; i <= f; i++) {
            a[i - 1] = new JButton("" + i);
            cPane.add(a[i - 1]);
            final int j = i - 1;
            a[i - 1].addActionListener((ActionEvent e) -> {
                move(curFloor, j);
            });
        }
        add(cPane);
        cPane.setBounds(0, f * HEIGHTS + 40, WIDTHS, 40);
        this.setDoubleBuffered(true);
        createControlPane();
    }

    public int getWidths() {
        return WIDTHS;
    }

    public int getHeights() {
        return HEIGHTS * floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void smartMove(int fr, int to) {
        for (int i = fr; i < to; i++) {
            move(i, i + 1);
        }
    }

    @Override
    public void move(int fr, int to) {
        if (eDoor.isOpen()) {
            eDoor.close();
        }
        Graphics g = this.getGraphics();
        g.setColor(Color.ORANGE);
        if (fr < to) {
            for (int i = fr * HEIGHTS; i < to * HEIGHTS; i++) {
                g.fillRect(1, i, WIDTHS, HEIGHTS + 25);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Elevator.class.getName()).log(Level.SEVERE, null, ex);
                }
                g.setXORMode(this.getBackground());
                g.fillRect(1, i, WIDTHS, HEIGHTS + 25);
            }
        } else if (fr > to) {
            for (int i = fr * HEIGHTS; i > to * HEIGHTS; i--) {
                g.fillRect(1, i, WIDTHS, HEIGHTS + 25);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Elevator.class.getName()).log(Level.SEVERE, null, ex);
                }
                g.setXORMode(this.getBackground());
                g.fillRect(1, i, WIDTHS, HEIGHTS + 25);
            }
        }
        eDoor.setBounds(1, to * HEIGHTS, WIDTHS, HEIGHTS + 25);
        eDoor.open();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Elevator.class.getName()).log(Level.SEVERE, null, ex);
        }
        eDoor.close();
        curFloor = to;
        elc.removeCommand(to);
    }

    public void elevatorRun() {
        while (!elc.isEmpty()) {
            int to = elc.getNextCmd(this);
            move(curFloor, to);
            elc.removeCommand(to);
        }
    }

    public int getCurFloor() {
        return curFloor;
    }

    public void run() {
        while (true) {
            elevatorRun();
            try {
                Thread.sleep(6);
            } catch (InterruptedException ex) {
                Logger.getLogger(Elevator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
