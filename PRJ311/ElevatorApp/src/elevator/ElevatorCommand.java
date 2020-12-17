/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

import java.util.*;

public class ElevatorCommand {

    private HashMap<Integer, Integer> cmds = new HashMap<Integer, Integer>();

    public ElevatorCommand() {
    }

    public void addCommand(int level, int toLevel) {
        cmds.put(level, toLevel);
        if (toLevel != 1) {
            cmds.put(toLevel, -1);
        }
    }

    public void removeCommand(int level) {
        cmds.remove(level);
    }

    public boolean isEmpty() {
        return cmds.isEmpty();
    }

    public int getNextCmd(Elevator el) {
        int minDist = Integer.MAX_VALUE;
        int levelToGo = -1;
        for (int level : cmds.keySet()) {
            int dist = Math.abs(el.getCurFloor() - level);
            if (dist < minDist) {
                minDist = dist;
                levelToGo = level;
            }
        }
        return levelToGo;
    }
}
