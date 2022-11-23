package dev;

public class LV0_89_외계어_사전 {

	public static void main(String[] args) {
		String[] spell = {"s", "o", "m", "d"}, dic = {"moos", "dzx", "smm", "sunmmo", "som"};
		int answer = 2;
		for(int i = 0; i<dic.length;i++) {
			int count = 0;
			for(int j = 0; j<spell.length;j++) {
				if(dic[i].contains(spell[j])) {
					dic[i] = dic[i].replaceAll(spell[j], " ");
					System.out.println(dic[i]);
					count++;
				}
				
			}
			if(count>=spell.length)answer = 1;
		}
		System.out.println(answer);
		
		
	}

}
