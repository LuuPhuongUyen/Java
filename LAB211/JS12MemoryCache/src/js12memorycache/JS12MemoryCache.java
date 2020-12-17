/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js12memorycache;

import java.io.*;

/**
 *
 * @author PC
 */
public class JS12MemoryCache {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        FuMemoryCached memoryCache = new FuMemoryCached();
        File file = new File("group3.txt");
        FileReader f = new FileReader(file);
        BufferedReader buffer = new BufferedReader(f);
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] li = line.split(" ");
            memoryCache.putObject(li[0], new Student(li[1], li[2]), 10);
        }
        buffer.close();
        f.close();
        Student st;
        // memoryCache.clean("de95");
        try {
            st = (Student) memoryCache.getObject("de95");
            System.out.println("ID de95: " + st.toString());
        } catch (NullPointerException e) {
            System.err.println("Not found in list!");
        }
        if (memoryCache.cleanAll()) {
            System.out.println("Clean all successfully!");
        }
    }
}
