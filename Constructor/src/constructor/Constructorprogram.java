package constructor;

public class Constructorprogram 
{
 int roll_no;
 String Name;
 int mark;
 
Constructorprogram(int b,String c,int d)
{
 roll_no=b;
 Name=c;
 mark=d;
}
Constructorprogram(String a,int h)
{
	Name=a;
	mark=h;
}

void show_series() {
 System.out.println("roll no of " + Name + " is:"+ roll_no);	
 System.out.println("mark of "+ Name +"is:"+ mark);
}

public static void main(String[]arg) {
	Constructorprogram t=new Constructorprogram(5,"ram",76 );
			t.show_series();
			
//Constructorprogram t1= new Constructorprogram("ram",75)	;
    //   t1.show_series();
Constructorprogram t2=new Constructorprogram(6," jitu",85);
      t2.show_series();
      // Constructorprogram t3=new Constructorprogram("jitu",85);
      // t3.show_series();

}

}
