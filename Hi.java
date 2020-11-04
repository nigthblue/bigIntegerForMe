
public class Hi{

    private static final class ThreadExtension extends Thread {
	}
	public static void main(String arg[]){
        extracted();
        
    }

    private static void extracted() {
        long temp = System.currentTimeMillis();
        String x = "Hi";
        System.out.println(x);
        System.out.println(System.currentTimeMillis() - temp);
    }
    private static void ex(){
        
    }
}