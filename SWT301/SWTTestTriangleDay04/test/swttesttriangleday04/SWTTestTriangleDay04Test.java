/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swttesttriangleday04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class SWTTestTriangleDay04Test {
    
   private SWTTestTriangleDay04 triangle = new SWTTestTriangleDay04();

    private List<String[]> readEO() {
        List<String[]> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("DataSet.csv"))) {
            String line;

            br.readLine();
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(values);
            }

            return records;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Test
    public void testTriangle() {
        List<String[]> testCases = readEO();

        for(String[] item : testCases){
            System.out.println("a=" + item[1] + "; b=" + item[2] + "; c=" + item[3] + "; EO: " + item[4] + "; RO:" + triangle.CheckTriangle(Double.parseDouble(item[1]), Double.parseDouble(item[2]), Double.parseDouble(item[3])));
            assertEquals(item[4], triangle.CheckTriangle(Double.parseDouble(item[1]), Double.parseDouble(item[2]), Double.parseDouble(item[3])));
        }
    }
}
