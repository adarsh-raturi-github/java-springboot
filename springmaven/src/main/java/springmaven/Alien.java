package springmaven;

public class Alien {
   private int age;
	//private Laptop lap = new Laptop();
	private DesktopInterface comp;
	
	public Alien() {
		System.out.println("Object Created");
	}

    // public Alien(int age,DesktopInterface l)
    // {
    //     this.age=age;
    //     this.cm=l;

    // }
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {    // Setter Injection
		//System.out.println("Setter called");
		this.age = age;
	}

	public DesktopInterface getComp() {
		return comp;
	}
	
	public void setComp(DesktopInterface com) {
		this.comp = com;
	}
	
	public void code() {
		System.out.println("Coding");
		comp.compile();
	}
}
