package in.ineuron.test;

import java.util.Date;

import com.ineuron.comp.WishMessageGenerator;

public class MainApp {
	public static void main(String[] args) {
		WishMessageGenerator generator = new WishMessageGenerator();
		System.out.println("Target object before setter injection is :: " + generator);
		
		Date date = new Date();
		generator.setDate(date);
		
		System.out.println("Target object after setter injection is " + generator);
		String result = generator.generateMessage("sachin");
		System.out.println(result);
	}
}
