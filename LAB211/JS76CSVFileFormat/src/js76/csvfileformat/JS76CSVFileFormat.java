/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js76.csvfileformat;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class JS76CSVFileFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Validation v = new Validation();
        FormatFile f = new FormatFile();
        ArrayList<CSV> ls = new ArrayList<>();
        while (true) {
            f.menu();
            int n = v.checkInputIntLimit(1, 5);
            switch (n) {
                case 1:
                    System.out.println("-------- Import CSV --------");
                    f.importFile(ls);
                    f.print(ls);
                    break;
                case 2:
                    System.out.println("------- Format Address -------");
                    f.formatAddress(ls);
                    f.print(ls);
                    break;
                case 3:
                    System.out.println("------- Format Name -------");
                    f.formatName(ls);
                    f.print(ls);
                    break;
                case 4:
                    System.out.println("------- Export CSV -------");
                    f.exportFile(ls);
                    break;
                case 5:
                    return;
            }
        }
    }

}
