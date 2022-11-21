package dev;

public class LV0_33_치킨_쿠폰 {

	public static void main(String[] args) {
		int chicken = 1999; 
		//쿠폰으로 계산
		//1999마리 -> 쿠폰 1999개.
		//쿠폰 1999개 -> 199마리에 쿠폰 9개
		//199마리 -> 쿠폰 199개. 결국 누적 먹은 서비스는 199마리 누적됐고  쿠폰 208개 
		//쿠폰 208개 -> 20마리에 쿠폰 8개 남음. 20마리는 쿠폰20개니까 누적은 219마리 먹었고 쿠폰은 28개 남음.
		//쿠폰 28개 -> 2마리에 쿠폰 8개 남음. 2마리는 쿠폰 2개. 누적은 221마리 먹었고 쿠폰은 10개 남음.
		//쿠폰 10개 -> 1마리에 쿠폰 0개 남음. 1마리는 쿠폰 1개. 결과적으로 222마리 먹고 쿠폰 1개 남음.
		int service_chicken = 0;
		int coupon = chicken;
		
		while(coupon >=10) {
			service_chicken+= coupon/10;
			coupon = coupon/10 + coupon%10;
			
			System.out.println("현재까지 먹은 서비스 치킨 수 : " +service_chicken+ " 지금 존재하는 쿠폰 수 : " + coupon);
		}

		
		
		
	}

}
