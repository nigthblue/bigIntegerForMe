package myBag;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int s=9;
        Integer p=0;
        for(int i=1;p<=5000;i++){
            String n=Integer.toString(i);
            BigInteger a= new BigInteger(n);
            Integer bstr=Integer.parseInt(n)*Integer.parseInt(n);
            BigInteger b= new BigInteger(Integer.toString(bstr));
            if(b.toString().substring(b.toString().length()-a.toString().length()).equals(a.toString())){
            	System.out.println(a.toString().length()+"<array A /// B array> "+b.toString().length());
                p++;
                System.out.println(p+":"+a+"-- green--"+b);
                if(p==s){
                	System.out.println(p+":"+a+"-- green--"+b);
                	break;
                }
            }

        }
	}

}
