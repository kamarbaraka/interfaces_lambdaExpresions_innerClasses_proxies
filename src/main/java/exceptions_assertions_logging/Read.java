/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package exceptions_assertions_logging;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * a program to demonstrate exception handling with try/catch
 * @author kamar baraka
 * @since 16/06/2023
 * */

public class Read {

    private String filename;

    public Read(String filename){
        this.filename = filename;
    }

    public String getFilename(){
        return this.filename;
    }

    public void read(){

        try{
            var fileContents = new FileInputStream(this.filename);
            int b = 0;
            while (b < 4){
                System.out.println(fileContents.read());
                b++;
            }

        }catch (IOException exception){

            exception.printStackTrace();
        }

    }
     public static void main(String... args){
        var file = new Read("test.txt");
        file.read();
    }
}

class ReadTest {

    public static void main(String... args){
        var file = new Read("test.txt");
        file.read();
    }
}
