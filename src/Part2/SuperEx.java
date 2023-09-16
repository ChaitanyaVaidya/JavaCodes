package Part2;

public class SuperEx {
	
	  void method(int a)  
	    {  
	        System.out.println("Base class method called with integer a = "+a);  
	    }  
	       
	    void method(double d)  
	    {  
	        System.out.println("Base class method called with double d ="+d);  
	    }  
	    
	    void sum(int a,double b){System.out.println("a method invoked");}    
	    void sum(long a,int b){System.out.println("b method invoked");}    
	    
	    public static void main(String[] args) {
			SuperEx se=new SuperEx();
			se.sum(10, 1.1);
			se.method(5.5);
		}

}
