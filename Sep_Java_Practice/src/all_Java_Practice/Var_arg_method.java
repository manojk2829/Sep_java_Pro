package all_Java_Practice;

public class Var_arg_method {

	public static void main(String[] args) {
		sum(2,65,4,767);
		sum(2,65,4);
		sum(2,65);
		sum(2);
		sum();
		
		
	}
	
	
	
	public static void sum(int... a){
		System.out.println("Call ver arg method....");

	}

}
