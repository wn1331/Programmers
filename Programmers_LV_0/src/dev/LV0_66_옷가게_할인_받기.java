package dev;

public class LV0_66_옷가게_할인_받기 {

	public static void main(String[] args) {
		// 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%
		int price = 150000;
        double answer = (double) price;
		if(price>500000)answer*=0.8;
		else if(price>300000)answer*=0.9;
		else if(price>100000)answer*=0.95;
		
		
		
		
	}

}
