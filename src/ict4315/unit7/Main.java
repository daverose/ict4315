package ict4315.unit7;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Main {


    public static void main(String[] args) {
    Lines lines = new Lines();
    LineNumbers lineNumbers = new LineNumbers();
        lines.setLines();
        String fileIn = lines.fivelines;
        String writeTo = lines.sevenLines;
//        DataStream stream = new DataStream();
//        DataInputStream dataIn = stream.getDataIn(fileIn);
//        DataOutputStream dataOut = stream.getDataOut(writeTo);
        lineNumbers.getInputFile(args[0]);
       // lineNumbers.getOutputFile(args[1]);
        lineNumbers.insertLineNumbers(lineNumbers.getInputFile(args[0]), args[1]);



    }
}

