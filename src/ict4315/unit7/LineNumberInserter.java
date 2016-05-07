package ict4315.unit7;


import java.io.*;


public class LineNumberInserter {
    private String fileName;

    public String setFileName(String name) {
        fileName = name;
        return fileName;
    }

    public  DataInputStream getDataIn(){
        DataInputStream dataIn = new DataInputStream(getFileinputStream(fileName));
        return dataIn;
    }

    public DataOutputStream getDataOut(){
        DataOutputStream dataOut = new DataOutputStream(getFileOutputStream(fileName));
        return dataOut;
    }

    public FileOutputStream getFileOutputStream(String name) {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(name);
            return outputStream;
        } catch (FileNotFoundException e) {
            System.out.println("The file $ for writing contents to was not found." + name);
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println("Error getting fileoutputstream() " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public FileInputStream getFileinputStream(String name) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(name);
            return inputStream;
        } catch (FileNotFoundException e) {
            System.out.println("The file $ for reading was not found." + name);
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e){
                    System.out.println("Couldn't close file. " + e.getMessage());
                    e.printStackTrace();;
                }
            }

        }
        return null;
    }
}
