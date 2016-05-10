package ict4315.unit7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.MatchResult;


public class LineNumbers {
    FileReader fileReader;
    FileWriter fileWriter;

    public FileReader getInputFile(String argsZero) {
        try {
            FileReader fileReader = new FileReader(argsZero);
            return fileReader;
        } catch (FileNotFoundException fnf) {
            System.out.println("The file you name you typed as the first argument does not exist as you" +
                    " typed it in. If the file has an extension, that extension must also be included such as .txt");
        }
        return fileReader;
    }

    public FileWriter getOutputFile(String argsOne) {
        Lines lines = new Lines();
        File f = new File(argsOne);
        if (f.exists() && !f.isDirectory()) {
            f.delete();
        } else if (f.isDirectory()) {
            System.out.println("The second argument to the command you entered is a directory name and" +
                    " must be changed to a name that is not a directory");
        }
        try {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(lines.fivelines());
            fileWriter.close();
            return fileWriter;
        } catch (IOException ioe) {
            System.out.println("The file could not be created. A check was already made to see if the file name" +
                    "you entered was a directory and if the file already existed. Perhaps you don't have permissions to write" +
                    " in the location you've chosen?");
            ioe.printStackTrace();
        }
        return fileWriter;
    }
    public void insertLineNumbers(FileReader inputFile, String argsOne){
        int i =0;
        StringBuilder newString = new StringBuilder();
        Scanner sc = new Scanner(inputFile).useDelimiter("\r\n");
        while ( sc.hasNext() ){
            ++i;
            newString.append(i + " " + sc.next() + System.lineSeparator());
        }
      //  Lines lines = new Lines();
        File f = new File(argsOne);
        if (f.exists() && !f.isDirectory()) {
            f.delete();
        } else if (f.isDirectory()) {
            System.out.println("The second argument to the command you entered is a directory name and" +
                    " must be changed to a name that is not a directory");
        }
        try {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(newString.toString());
            fileWriter.close();
        } catch (IOException ioe) {
            System.out.println("The file could not be created. A check was already made to see if the file name" +
                    "you entered was a directory and if the file already existed. Perhaps you don't have permissions to write" +
                    " in the location you've chosen?");
            ioe.printStackTrace();
        }



    }
}

//
//    public void insertLineNumbers(DataInputStream dataIn, DataOutputStream dataOut) {
//
//
//    }

