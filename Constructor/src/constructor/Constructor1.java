package constructor;

public class Constructor1 
{
   int b,e,m;
 Constructor1()
   {
	 b=45;
   }
   Constructor1(char m,int d )
   {
   m='e';
   
  e=47;
   }
public static void main(String[]arg) {
	new Constructor1();
	Constructor1 t= new Constructor1();
  System.out.println(t.b);
   new Constructor1('c',23);
    Constructor1 t2=new Constructor1('j',67);
    System.out.println(t2.m);
	

}

}
