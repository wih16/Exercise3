package billyjosh;
public class Exercise3{
    public static void main(String[] args){
	int arg = 0;
	if(args.length != 1){	  
	    System.out.println("Usage: java Excercise3 [integer >= 0]");
	    System.exit(1);
	}
	try{
	    arg = Integer.parseInt(args[0]);
	}
	catch(Exception e){
	    System.out.println("Usage: java Excercise3 [integer >= 0]");
	    System.exit(1);
	}
	if(arg < 0){
	    System.out.println("Usage: java Excercise3 [integer >= 0]");
	    System.exit(1);
	}
	System.out.println("Tri(" + arg + ") = " + tri(arg));
	System.out.println("Lazy(" + arg + ") = " + lazy(arg));
    }
    
    public static int tri(int n){
	if(n == 0)
	    return 0; 
	else
	    return (n * (n + 1))/2; 
    }

    public static int lazy(int n){
	if(n == 0)
	    return 1; 
	else 
	    return ((n*n) + n + 2)/2;
    }
}