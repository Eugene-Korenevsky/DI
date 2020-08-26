package lesson4;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileEventLogger implements EventLogger {
    private String fileName;
    private File file;


    public void setFile(File file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public File getFile() {
        return file;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void init() throws IOException {
        this.file = new File(fileName);
    }

    public void logEvent(Event event) throws IOException {
        FileUtils.writeStringToFile(file, event.toString() + "\n", true);
    }
}
