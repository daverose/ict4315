package ict4315.unit7;


import java.io.DataInputStream;
import java.io.DataOutputStream;

public class LineNumberInserter {
    Lines lines = new Lines();
    DataStream stream = new DataStream();
    DataInputStream dataIn = stream.getDataIn(lines.fivelines());
    DataOutputStream dataOut = stream.getDataOut(lines.emptyString);


    public void insertLineNumbers(DataInputStream dataIn, DataOutputStream dataOut){

    }


}
