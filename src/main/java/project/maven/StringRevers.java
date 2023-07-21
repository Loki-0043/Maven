package project.maven;

public class StringRevers {
	
		  public static void main(String[] args) {
		    String originalStr = "Hello world";
		    String reversedStr = "";
		    System.out.println("Original string: " + originalStr);
		        
		    for (int i = 0; i < originalStr.length(); i++) {
		      reversedStr = originalStr.charAt(i) + reversedStr;
		    }
		    
		    System.out.println("Reversed string: "+ reversedStr);
		  }
		}


