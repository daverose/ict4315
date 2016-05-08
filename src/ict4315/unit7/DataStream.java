package ict4315.unit7;

import com.sun.xml.internal.ws.message.stream.StreamAttachment;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;


public class DataStream {
    String path = System.getProperty("user.home" + System.lineSeparator());
    DataStream(){}

    public  DataInputStream getDataIn(String fileName){
        DataInputStream dataIn = new DataInputStream(getFileinputStream(fileName));
        return dataIn;
    }

    public DataOutputStream getDataOut(String fileName){
        DataOutputStream dataOut = new DataOutputStream(getFileOutputStream(fileName));
        return dataOut;
    }

    public FileOutputStream getFileOutputStream(String name) {
        File f;
        Boolean sucess;
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(name);
            return outputStream;
        } catch (FileNotFoundException e) {
            f = new File(path, name);
            try {
                sucess = f.createNewFile();
                if (sucess)
                     outputStream = new FileOutputStream(f);
                return outputStream;
            } catch (IOException ioOutput){
                System.out.print(String.format("The file %s already existed. Overwriting file", name));
            }
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
        File f;
        Boolean sucess = false;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(name);
            return inputStream;
        } catch (FileNotFoundException e) {
            f = new File(path , name);
            try {
                sucess = f.createNewFile();
                if (sucess)
                    inputStream = new FileInputStream(name);
            return inputStream;
        } catch (IOException ioInput) {
            System.out.print(String.format("The file %s already existed. Overwriting file", name));
            ioInput.printStackTrace();
        }
            System.out.println(String.format("The file %s for reading was not found.", name));
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
