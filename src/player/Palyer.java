package player;
public class Palyer {
	private String name;
	private int age;
	
	
public void setName(String name) {
		this.name = name;
	}

public void setAge(int age) {
		this.age = age;
	}

private void run() {
	// TODO Auto-generated method stub
	System.out.println("runnnnn!");

}
private void shoot() {
	// TODO Auto-generated method stub
	System.out.println("shooot");

}	

public static void main(String[] args) {
	Palyer first = new Palyer();
	first.setName("amir");
	first.setAge(34);
	first.run();
	first.shoot();
	
	Palyer second = new Palyer();

	second.setName("ali");
    second.setAge(44);
	second.run();
	second.shoot();
	
	
}
}
