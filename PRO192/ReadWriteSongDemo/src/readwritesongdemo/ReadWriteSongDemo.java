/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritesongdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author PC
 */
public class ReadWriteSongDemo {

    private static void writeUsingFileWriter(String[] data) {
        File file = new File("Song.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            for (int i = 0; i < data.length; i++) {
                fr.write(data[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

    private static void readUsingFileReader(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        System.out.println("Reading text file");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String[] data = {"aaaaaaaaaa\n", "bbbbbbbbbbbbbb\n", "ccccccccc"};
        writeUsingFileWriter(data);
        String fileName = "Song.txt";
        readUsingFileReader(fileName);
    }
}
