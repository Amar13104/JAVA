package firstproject;

public class DemoAnimal {

	public static void main(String[] args) {
		
	//declaration
		
	Animal an,an1;
	
	an = new Animal();
	an1 = new Animal();
	
	an.setName("cat");
	an.setType_ani("wild");
	an.setFood_habit("all");
	
	System.out.println("name :"+ an.getName() + "food :"+an.getFood_habit() + "type :"+an.getType_ani());
	
	System.out.println(an.toString());
	}

}
