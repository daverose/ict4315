package ict4315.unit7;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Main {

    public static void main(String[] args) {
        Lines lines = new Lines();
        lines.setLines();
        String fileIn = lines.fivelines;
        String writeTo = lines.emptyString;
        DataStream stream = new DataStream();
        DataInputStream dataIn = stream.getDataIn(fileIn);
        DataOutputStream dataOut = stream.getDataOut(writeTo);
        LineNumberInserter insterter = new LineNumberInserter();
        insterter.insertLineNumbers(dataIn, dataOut);

    }
}
