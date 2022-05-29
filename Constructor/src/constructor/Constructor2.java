package constructor;

public class Constructor2 extends Constructor1
{
	int j,a,c,m;
	 static int b ,h;
 Constructor2()
 {
    a=34;
    b=56;
    int e;  
 }
 Constructor2(int n)
 {
	c=43;
	 j=21;
	}
 
 Constructor2(char m,int d){
	a=d;
	m='h';
   h=75;
 }
 public static void main(String[] arg) 
 {
	 Constructor2 t1 =new Constructor2();
	 System.out.println(t1.e);
	 
	 new Constructor2();
	  System.out.println(b);
	  
	  Constructor2 t2 =new Constructor2(10);
	  System.out.println(t2.c);
	 
	  Constructor2 t3=new Constructor2('s',45);
	  System.out.println(t3.c);
	  
 }
 
 }
