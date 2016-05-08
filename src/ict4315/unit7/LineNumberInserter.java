package ict4315.unit7;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class LineNumberInserter {
    public void insertLineNumbers() {
        Lines lines = new Lines();
        LineNumberInserter insterter = new LineNumberInserter();
        lines.setLines();
        String fileIn = lines.fivelines;
        String writeTo = lines.sevenLines;
        DataStream stream = new DataStream();
        DataInputStream dataIn = stream.getDataIn(fileIn);
        DataOutputStream dataOut = stream.getDataOut(writeTo);
        try {
            dataOut.flush();
        } catch (IOException e) {
            System.out.println("No flush() !");
        }
        try {
            StringBuffer in = new StringBuffer();
            String tmp;
            try {
                while ((dataIn.readLine()) != null)
                    in.append(tmp);
                System.out.println(tmp);
            } catch (IOException ioe) {
                System.out.println(ioe);
            } catch (NullPointerException n) {
                System.out.print("Null pointer");

            }
        }
    }
}
