/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js75.handlefileprogram;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class HandleFile {

    Validation v = new Validation();

    public void checkPath() {
        System.out.println("Enter path : ");
        String path = v.checkInputString();
        java.io.File file = new java.io.File(path);
        if (file.exists() && file.isFile()) {
            System.out.println("Path to file");
        } else if (file.exists() && file.isDirectory()) {
            System.out.println("Path to directory");
        } else {
            System.out.println("Path doesn't exist");
        }
    }

    public void getAllFileNameJavaInDirectory() {
        System.out.println("Enter path : ");
        String path = v.checkInputString();
        java.io.File file = new java.io.File(path);
        ArrayList<String> listFileName = new ArrayList<>();
        if (file.exists() && file.isDirectory()) {
            java.io.File[] listFile = file.listFiles();
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isFile() && listFile[i].getName().endsWith(".java")) {
                    listFileName.add(listFile[i].getName());
                }
            }
        } else {
            System.out.println("Path doesn't exist");
            return;
        }
        System.out.println("Result : " + listFileName.size() + " file");
        for (int i = 0; i < listFileName.size(); i++) {
            System.out.println(listFileName.get(i));
        }
    }

    public void getFileWithSizeGreaterThanInput() {
        System.out.println("Enter path : ");
        String path = v.checkInputString();
        System.out.println("Enter size : ");
        int size = v.checkInputInt();
        java.io.File file = new java.io.File(path);
        if (file.exists() && file.isDirectory()) {
            java.io.File[] listFile = file.listFiles();
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isFile() && listFile[i].length() > size) {
                    System.out.println(listFile[i].getName());
                }
            }
        } else {
            System.out.println("Path doesn't exist");
            return;
        }
    }

    public void appendContentToFile() throws IOException {
        System.out.println("Enter path: ");
        String path = v.checkInputString();
        System.out.println("Enter content: ");
        String content = v.checkInputString();
        java.io.File file = new java.io.File(path);
        if (file.exists() && file.isFile()) {
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWrite);
            writer.append(content);
            writer.close();
            System.out.println("Write Successful");
        } else {
            System.out.println("Path doesn't exist");
        }
    }

    public void countCharacter() throws FileNotFoundException, IOException {
        System.out.println("Enter path : ");
        String path = v.checkInputString();
        java.io.File file = new java.io.File(path);
        if (file.exists() && file.isFile()) {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            int count = 0;
            while (line != null) {
                String[] parts = line.split(" ");
                for (String s : parts) {
                    count++;
                }
                line = reader.readLine();
            }
            System.out.println("Total : " + count);
        } else {
            System.out.println("Path doesn't exist");
        }
    }

    public void menu() {
        System.out.println("=========== File Processing ===========");
        System.out.println("1. Check Path");
        System.out.println("2. Get file name with type java");
        System.out.println("3. Get file with size greater than input");
        System.out.println("4. Write more content to file");
        System.out.println("5. Read file and count characters");
        System.out.println("6. Exit");
    }
}
