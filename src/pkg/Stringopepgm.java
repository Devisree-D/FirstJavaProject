package pkg;

public class Stringopepgm {

	public static void main(String[] args) {
		String s="Apple";
		String a="Orange ";
		
		//Concatination
		
		System.out.println(s.concat(a));
		
		//contains
		
		System.out.println(s.contains("rs"));
		
		//Length of a string
		
		System.out.println(a.length());
		
		
		//Equals
		
		System.out.println(s.equals(a));
		
		//Upper and lower
		
		System.out.println(s.toUpperCase());
		System.out.println(a.toLowerCase());
		
		//Trim
		System.out.println(a.trim());
		
		//Startswith and endswith
		
		System.out.println(s.startsWith("Ap"));
		System.out.println(a.endsWith("ge"));
		
		
		//Substring
		
        System.out.println(a.substring(2,3));
        System.out.println(s.substring(1,1));
        System.out.println(s.substring(2,3));
        
        //charAt
        
        System.out.println(a.charAt(1));
		//Split
        
        String s4="Hello welcome to Luminar technolab";
        String[]stringarray=s4.split(" ");
        
      for(String str:stringarray)
      {
		System.out.println(str);
	}

}
}