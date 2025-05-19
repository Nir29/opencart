package singletonDesignPattern;

public class SingletonLazyInitialization {
	private static SingletonLazyInitialization INSTANCE;
	
	private SingletonLazyInitialization() {
		
	}
	
	public static SingletonLazyInitialization getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new SingletonLazyInitialization();
		}
		return INSTANCE;
	}

}
