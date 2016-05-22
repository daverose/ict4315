package ict4315.unit7;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader inputFile;
        LineNumbers lineNumbers = new LineNumbers();
        inputFile = lineNumbers.getInputFile(args[0]);
        lineNumbers.insertLineNumbers(inputFile, args[1]);
    }
}

