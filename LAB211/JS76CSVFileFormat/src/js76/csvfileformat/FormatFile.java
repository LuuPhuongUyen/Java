/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js76.csvfileformat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class FormatFile {

    private final String COMMA_DELIMITER = ",";
    private final String NEW_LINE_SEPARATOR = "\n";
    Validation v = new Validation();

    public void menu() {
        System.out.println("======= Format CSV Program =======");
        System.out.println("1. Import CSV");
        System.out.println("2. Format Address");
        System.out.println("3. Format Name");
        System.out.println("4. Export CSV");
        System.out.println("5. Exit");
        System.out.print("Please choice one option:");
    }

    public void importFile(ArrayList<CSV> ls) {
        String line = "";
        BufferedReader fileReader = null;
        System.out.print("Enter Path: ");
        String fileName = v.checkInputString();
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            while ((line = fileReader.readLine()) != null) {
//                System.out.println(line);
                String[] splitCSV = line.split(COMMA_DELIMITER);
                ls.add(new CSV(Integer.parseInt(splitCSV[0]), splitCSV[1],
                        splitCSV[2], splitCSV[3], splitCSV[4]));

            }
            System.err.println("Import: Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void formatName(ArrayList<CSV> ls) {
        for (int i = 0; i < ls.size(); i++) {
            String name = ls.get(i).getName().trim();
            name = name.toLowerCase().replaceAll("\\s+", ",");
            String[] arr = name.split(",");
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < arr.length; j++) {
                sb.append(Character.toUpperCase(arr[j].charAt(0)))
                        .append(arr[j].substring(1)).append(" ");
            }
            ls.get(i).setName(sb.toString().trim());
        }
        System.err.println("Format: Done");
    }

    public void formatAddress(ArrayList<CSV> ls) {
        for (int i = 0; i < ls.size(); i++) {
            String address = ls.get(i).getAddress().trim();
            address = address.toLowerCase().replaceAll("\\s+", ",");
            String[] arr = address.split(",");
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < arr.length; j++) {
                sb.append(Character.toUpperCase(arr[j].charAt(0)))
                        .append(arr[j].substring(1)).append(" ");
            }
            ls.get(i).setAddress(sb.toString().trim());
        }
        System.err.println("Format: Done");
    }

    public void exportFile(ArrayList<CSV> ls) {
        FileWriter fileWriter = null;
        System.out.print("Enter Path: ");
        String fileName = v.checkInputString();
        try {
            fileWriter = new FileWriter(fileName);
            for (CSV listCSV : ls) {
                fileWriter.append(String.valueOf(listCSV.getID()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(listCSV.getName()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(listCSV.getEmail()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(listCSV.getPhone()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(listCSV.getAddress()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.err.println("Export: Done ");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void print(ArrayList<CSV> ls) {
        for (int i = 0; i < ls.size(); i++) {
            System.out.printf("%d,%s,%s,%s,%s\n", ls.get(i).getID(),
                    ls.get(i).getName(), ls.get(i).getEmail(), ls.get(i).getPhone(),
                    ls.get(i).getAddress());
        }
    }

}
