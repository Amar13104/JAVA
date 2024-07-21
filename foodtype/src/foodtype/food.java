package foodtype;
import java.util.Scanner;

public class food {
	
	private int code;
	private String FoodName , Sticker , FoodType;
	
	// member function
	
	public void GetType() {
		
		String stc = Sticker.toLowerCase();
		
		if(stc.equals("green")) {
			this.FoodType = "Vegetarian";
		}
		else if (stc.equals("yellow")) {
			this.FoodType = "Contains Egg";
		}
		else if (stc.equals("red")) {
			this.FoodType = "Non Vegetarian";
		}
		else {
			this.FoodType = "Invalid";
		}
	}
	
	public void FoodIn() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the code : ");
		code = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the FoodName : ");
		FoodName = sc.nextLine();
		
		System.out.println("Enter the Sticker : ");
		Sticker = sc.nextLine();
		
		sc.close();
		GetType();
		
	}
	
	public void FoodOut() {
		System.out.println("Code : " +code);
		System.out.println("Food Name : " + FoodName);
        System.out.println("Sticker : " + Sticker);
        System.out.println("Food Type : " + FoodType);
	}
	
	
}
