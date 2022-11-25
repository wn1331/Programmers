package dev;

public class LV0_97_분수의_덧셈 {
    public static void main(String[] args) {
        //분자가 denum, 분모가 num
        int denum1 = 9, num1 = 62, denum2 = 1,num2 = 31;

        int answer_denum, answer_num, gongbaesoo ,gongyaksoo=0;
        int[] answer = new int[2];
        //분모의 최대공약수 구하기.
        for(int i = 1; i<=num1;i++) if(num1%i==0) for (int j = 1; j <= num2; j++) if(num2%j==0) if(i==j) gongyaksoo=i;
        System.out.println(gongyaksoo);
        //분모의 최소공배수 구하기. 최소공배수 = (a*b)/최대공약수
        gongbaesoo = (num1*num2)/gongyaksoo;
        //분자*=((분모 2개의 최소공배수)/분모) 1,2에 적용
        denum1 *=gongbaesoo/num1;
        denum2 *=gongbaesoo/num2;
        //분자끼리 더하고 분모는 (분모 2개의 최소공배수)
        answer_denum = denum1+denum2;
        answer_num = gongbaesoo;
        //더한 값을 기약분수로 변환. 분자와 분모를 최대공약수로 나눈다.
        gongyaksoo = 0;
        for(int i = 1; i<=answer_denum;i++) if(answer_denum%i==0) for (int j = 1; j <= answer_num; j++) if(answer_num%j==0) if(i==j) gongyaksoo=i;
        answer[0] = answer_denum/gongyaksoo;
        answer[1] = answer_num/gongyaksoo;

        System.out.println(answer[0]+ " , "+answer[1]);
    }
}
