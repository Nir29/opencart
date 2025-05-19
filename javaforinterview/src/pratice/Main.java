package pratice;

public class Main  {

	public static void main(String[] args) {
		Animal dog=new Dog();
		dog.eat();
		dog.sound();
		EncapsulationDemo es=new EncapsulationDemo();
		es.setName("nirmal");
		String n=es.getName();
		System.out.println(n);

	}

}
