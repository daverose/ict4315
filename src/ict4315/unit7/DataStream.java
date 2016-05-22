package ict4315.unit7;


import java.io.*;


public class DataStream {
    FileOutputStream outputStream;
    FileInputStream inputStream;
    String path = System.getProperty("user.home" + System.lineSeparator());

    DataStream() {
    }

    public DataInputStream getDataIn(String fileName) {
        DataInputStream dataIn = new DataInputStream(getFileInputStream(fileName));
        return dataIn;
    }

    public DataOutputStream getDataOut(String fileName) {
        DataOutputStream dataOut = new DataOutputStream(getFileOutputStream(fileName));
        return dataOut;
    }

    public FileOutputStream getFileOutputStream(String name) {
        File f;
        f = new File(path, name);
        if (f.exists()) {
            try {
                outputStream = new FileOutputStream(f);
                return outputStream;
            } catch (IOException io) {
                System.out.println("Couldn't create output file for writing");
            }
        }
        return outputStream;
    }

    public FileInputStream getFileInputStream(String name) {
        File f;
        f = new File(path, name);
        if (f.exists()) {
            try {
                inputStream = new FileInputStream(f);
                return inputStream;
            } catch (FileNotFoundException fnf) {
                System.out.println("The file wasn't located");
                fnf.printStackTrace();
            }
            return inputStream;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                System.out.println("Couldn't close file. " + e.getMessage());
            }
        }
        return inputStream;
    }
}