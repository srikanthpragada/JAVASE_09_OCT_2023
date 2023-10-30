package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		 Object obj = "Abc";
		 
		 obj = 10;  // 10 -> Integer (AutoBoxing)
		 System.out.println(obj.getClass());
		 
		 int n = (Integer) obj;
		 
		 obj = true; 
		 System.out.println(obj.getClass());
		 
		 Integer iobj = 100;  // autoboxing
		 
		 int v = iobj;  // autounboxing 
		  
	}

}
