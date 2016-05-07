package ict4315.unit7;


import java.io.*;


public class LineNumberInserter {
    private String fileName;

    public  DataInputStream getDataIn(){
        DataInputStream dataIn = new DataInputStream(getFileinputStream(fileName));
        return dataIn;
    }

    public DataOutputStream getDataOut(){
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

    public FileInputStream getFileinputStream(String name) {
        try {
            FileInputStream inputStream = new FileInputStream(name);
            return inputStream;
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
