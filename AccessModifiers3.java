package AssistedProjects;
//3. using protected access specifiers

class proaccessspecifiers {

	protected void display() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}

public class AccessModifiers3 {

	public static void main(String[] args) {
		//private
				System.out.println("Protected Access Specifier");
				proaccessspecifiers  obj = new proaccessspecifiers(); 
		        
				//Below will give error: trying to access private method of another class 
		        //obj.display();

	}

}
