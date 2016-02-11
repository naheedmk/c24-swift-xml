package biz.c24.io;

import biz.c24.io.api.C24;
import biz.c24.io.swift2015.*;
import java.io.*;

/**
 *
 * @author Divan Mostert
 */
public class Application {

    public static void main(String[] args) {
    	try {
			//Parse the valid file
			MT103Message parsedMessage = C24.parse(MT103Message.class).from(new FileReader("src/test/resources/data/valid/MT103i-valid_1.dat"));
			System.out.println("The original format:");
			System.out.println(parsedMessage);
			System.out.println("");
			
			//Write out the Swift message as XML
			System.out.println("The original message represented as XML:");
			C24.write(parsedMessage).as(C24.Format.XML).to(System.out);
			System.out.println("");
			
			//Write out the Swift message as JSON
			System.out.println("The original message represented as JSON:");
			C24.write(parsedMessage).as(C24.Format.JSON).to(System.out);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
    }

}






