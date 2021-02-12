package mod1;

public class defAccessSpecifier
{ 
  public void display() 
     { 
         System.out.println("You are using default access specifier"); 
     } 
} 

public class accessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
	    System.out.println(obj);
	}
}
//2. using private access specifiers
class priAccessSpecifier 
{ 
private void display() 
{ 
    System.out.println("You are using private access specifier"); 
} 
} 

public class accessSpecifiers2 {
	
	

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		 priAccessSpecifier  obj= new priAccessSpecifier (); 
    //trying to access private method of another class 
		

	}
}

