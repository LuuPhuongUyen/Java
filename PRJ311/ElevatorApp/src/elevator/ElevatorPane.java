package elevator;

import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ElevatorPane extends JPanel implements ActionListener {

    private JButton[] bLevel;
    private int level;
    private ElevatorCommand elc;

    public ElevatorPane(Elevator e, int level, ElevatorCommand ec) {
        this.level = level;
        elc = ec;
        int n = e.getFloors();
        bLevel = new JButton[n];
        setLayout(new GridLayout(0, 2, 2, 2));
        for (int i = 1; i <= n; i++) {
            bLevel[i - 1] = new JButton("" + i);
            bLevel[i - 1].setActionCommand("" + i);
            add(bLevel[i - 1]);
            bLevel[i - 1].addActionListener(this);
        }
        this.setBounds(new Rectangle(getX(), getY(), 50, e.getHeights()));
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setContentPane(new ElevatorPane(new Elevator(6), 1, null));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String I = e.getActionCommand();
        int n = Integer.parseInt(I);
        elc.addCommand(level, (n - 1));
    }
}
