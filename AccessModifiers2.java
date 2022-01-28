package AssistedProjects;
//2. using private access specifiers
class priaccessspecifier 
{ 
   private void display()         
   //only visible inside the class
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class AccessModifiers2 {
	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
        
		//Below will give error: trying to access private method of another class 
        //obj.display();

	}
	
}


 
