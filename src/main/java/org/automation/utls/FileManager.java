package org.automation.utls;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by shantonu on 4/14/16.
 */
public class FileManager {
    public static String ReadFile(String name) {
        String value=null;
        try {
            File f = new File(name);
            FileInputStream is = new FileInputStream(f);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            value= new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}