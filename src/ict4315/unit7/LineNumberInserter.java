package ict4315.unit7;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class LineNumberInserter {
    private String fileName;
    private DataInputStream dataIn;
    private DataInputStream in = new DataInputStream(dataIn);


    public DataOutputStream getDataOut(String name){
        DataOutputStream dataOut = new DataOutputStream(getFileOutputStream(fileName));
        return dataOut;
    }

    public FileOutputStream getFileOutputStream(String name) {
        try {
            FileOutputStream outputStream = new FileOutputStream(name);
            return outputStream;
        } catch (FileNotFoundException e) {
            System.out.println("The file $ was not found." + name);
            e.printStackTrace();
        }
        return null;
    }
    public String setFileName(String name) {
        fileName = name;
        return fileName;
    }


}
