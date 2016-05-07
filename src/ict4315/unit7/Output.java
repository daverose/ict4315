package ict4315.unit7;

/**
 * Created by drose200 on 5/7/2016.
 */
public class Output {
    private int lineNumbers = 0;
    private boolean success = false;
    private int fileSize = 0;

    public int getLineNumbers() {
        return lineNumbers;
    }

    public void setLineNumbers(int lineNumbers) {
        this.lineNumbers = lineNumbers;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
}
