package project.maven;

import java.io.FileReader;
import java.io.*;
public class Vowel {
	public static void main(String[] args) {
		try {
			FileInputStream fr= new FileInputStream("F:\\java\\java workspace\\maven\\src\\main\\java\\project\\maven\\Example.txt"); 
		int n = fr.read();
		//System.out.println(n);
		//System.out.println((char)n);
		while(n!=-1) {
			char ch = (char)n;
			System.out.print(ch);
			n=fr.read();
			
		}
		}catch(Exception e) {
			System.out.println(e);
		}

		}

}