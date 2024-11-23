//Multilevel Inheritance
class Parent{
	public void sum(int x,int y){
		System.out.println("Sum="+(x+y));
	}
} 
class Child1 extends Parent{
	public void sub(int x,int y){
		System.out.println("Sub="+(x-y));
	}
}
class Child2 extends Child1{
	public void Multi(int x,int y){
		System.out.println("Multi="+(x*y));
	}
}

class Prog2{
public static void main(String arg[]){
	Child2 c=new Child2();
	c.sum(10,2);
	c.sub(10,2);
	c.Multi(10,2);

}
} 