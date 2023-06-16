/*
 * Copyright (c) 2023
 * This program is released under the gpl license
 */

package exceptions_assertions_logging;


import java.io.IOException;
import java.util.Scanner;

/**
 * a simple program to demonstrate exception creation in java
 * @author kamar baraka
 * @since 16/06/2023
 * */

public class FileFormatException
        extends IOException {

    /**
     * the default constructor
     * */
    public FileFormatException(){}

    /**
     * the detailed constructor
     * @param message the detailed error message.
     * */
    public FileFormatException(String message){

        super(message);
    }
}

class FileFormatExceptionTest{

    public static void main(String... args)
            throws FileFormatException{

        var input = new Scanner(System.in);

        do {
            System.out.println(switch (input.next()){
                case "exe", "svg", "dat" -> throw new FileFormatException("not supported");
                case "mp4", "mkv" -> "implementation soon";
                default -> "supported";
            });
        }while (true);

    }
}
