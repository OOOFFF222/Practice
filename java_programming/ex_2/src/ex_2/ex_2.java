package ex_2;

import java.util.ArrayList;

public class ex_2 {
	public static void main(String[] args) {
		/*
		 * if (true) { System.out.println(); }
		 * 
		 * if (false) { System.out.println("false입니다."); }
		 */
		
		/*
		 * if(true) { System.out.println("ifelse true입니다."); } else if (false) {
		 * System.out.println("ifelse false입니다."); }
		 */
		
		/*
		 * int paramA = 1; if (paramA == 2) { System.out.println("첫 번째 else입니다."); }
		 * else if (paramA == 1) { System.out.println("두 번째 else입니다."); }
		 */
		
		/*
		 * int paramA = 1;
		 * 
		 * if (paramA == 1) { System.out.println("첫 번째 참입니다."); } else if (paramA == 1)
		 * { System.out.println("두 번째 참입니다."); }
		 */
		
		/*
		 * int paramA = 1;
		 * 
		 * if (paramA == 2) { System.out.println("paramA는 2"); } else if (paramA == 3) {
		 * System.out.println("paramA 는 3"); } else { System.out.println("paramA는 1"); }
		 */
		
		/*
		 * int paramA = 1; if (paramA == 2) { System.out.println("paramA는 2입니다."); }
		 * else { System.out.println("paramA는 else입니다."); }
		 * 
		 * int productionRadio = 30;
		 * 
		 * if (productionRadio > 70) { System.out.println("생산량이 양호합니다."); } else {
		 * System.out.println("생산량이 저조합니다."); }
		 */
		
		/*
		 * int paramA = 1;
		 * 
		 * if (paramA == 2) { System.out.println("아무 것도.... paramA는 2입니다."); } else if
		 * (paramA == 3) { System.out.println("아무 것도.... paramA는 3입니다."); }
		 */
		
		/*
		 * int paramA = 1;
		 * 
		 * switch (paramA) { case 0 : System.out.println("0입니다."); break; case 1 :
		 * System.out.println("1입니다."); break; case 2 : System.out.println("2입니다.");
		 * break; case 3 : System.out.println("3입니다."); break; case 4 :
		 * System.out.println("4입니다."); break; }
		 */
		/*
		 * int paramA = 0;
		 * 
		 * switch (paramA) { case 0 : case 1 : System.out.println("0과 1입니다."); break;
		 * case 2 : case 3 : System.out.println("0과 1입니다."); break; default :
		 * System.out.println("default입니다."); break; }
		 */
		/*
		 * int intCnt = 2;
		 * 
		 * if (intCnt % 2 == 0) { if (intCnt == 2) { System.out.println("int자료가 2입니다.");
		 * } else { System.out.println("int 자료가 2가 아닙니다."); } }
		 */
		
		/*
		 * int intParamA = 9;
		 * 
		 * switch (intParamA) { case 0: System.out.println("intParamA는 0입니다."); break;
		 * case 1: System.out.println("intParamA는 1입니다."); break; case 2:
		 * System.out.println("intParamA는 2입니다."); break; case 3:
		 * System.out.println("intParamA는 3입니다."); break; case 5:
		 * System.out.println("intParamA는 4입니다."); break; default:
		 * System.out.println("default입니다."); break; }
		 */
		
		/*
		 * for(int i=0;i<5;i++) { System.out.println("i는 "+i+"입니다"); }
		 */
		
		/*
		 * int whileCnt = 0; while (whileCnt < 5) { System.out.println("반복문++ : " +
		 * whileCnt++ + " 입니다."); } whileCnt = 0; while (whileCnt < 5) {
		 * System.out.println("++반복문 : " + ++whileCnt + " 입니다."); }
		 */
		
		/*
		 * for (int i = 1;i<=5;i++) { System.out.println("1부터... " + i + " 입니다."); }
		 */
		
		/*
		 * for (int i = 10;i>0;i-=2) { System.out.println("i는 -=2 ::: " + i); }
		 */
		
		/*
		 * for (int x = 2; x < 10; x++) { for (int y = 1; y < 10; y++) {
		 * System.out.println(x + "단 : " + x + " X " + y + " = " + (x*y)); } }
		 */
		
		/*
		 * int whileCnt = 0; while ( whileCnt < 10) { whileCnt++;
		 * System.out.println("whileCnt ::: " + whileCnt); }
		 */
		
		/*
		 * int whileCnt = 0; boolean isTrue = true;
		 * 
		 * while (isTrue) { whileCnt++; System.out.println("if whileCnt는" + whileCnt);
		 * if (whileCnt == 10) { break; } }
		 */
		
		/*
		 * int whileCnt = 0; for(int i = 0 ;i < 10; i++) { if (i % 3 == 0) { continue; }
		 * System.out.println(i); }
		 */
		
		/*
		 * int whileCnt = 0; do { System.out.println("do, first.");
		 * System.out.println("whileCNt ::: " + whileCnt); whileCnt++; } while(whileCnt
		 * < 3);
		 */
		
		/*
		 * do { System.out.println("Do, first."); } while(false);
		 */
		
		/*
		 * for(int x = 2;x < 10;x++) { System.out.println("x : " + x); for(int y = 1; y
		 * < 10;y++) { System.out.println(x + " * " + y + " = " + (x * y)); } }
		 */
		
		/*
		 * for (int i = 0;i<10;i++) { int random = (int) (Math.random() * 10);
		 * System.out.println(i + " ::: random ::: " + random); }
		 */
		
		/*
		 * for (int i = 0; i < 10; i++) { int getMathRandom = (int) (Math.random() *
		 * 10); System.out.println("getMathRandom ::: " + getMathRandom);
		 * 
		 * if (getMathRandom % 2 == 0) { System.out.println("랜덤값은 짝수입니다."); if
		 * (getMathRandom % 4 == 0) { System.out.println("4로 나누어서 떨어집니다."); } else {
		 * System.out.println("4로 나누어서 떨어지지 않습니다."); } } else {
		 * System.out.println("랜덤값은 홀수입니다."); if (getMathRandom % 3 == 0) {
		 * System.out.println("3으로 나누어 떨어집니다."); } else {
		 * System.out.println("3으로 나누어 떨어지지 않습니다."); } } }
		 */
		
		/*
		 * for(int i = 0;i<10;i++) { if (i%2 == 0) { System.out.println(i +
		 * " ::: 현재 반복문은 짝수입니다."); } else { System.out.println(t +
		 * " ::: 현재 반복문은 홀수입니다."); } }
		 */
		
		/*
		 * for(int i=0;i<10;i++) { if (i%3 == 2) { System.out.println(i +
		 * " ::: 나머지는 2입니다."); } else if(i%3 == 1) { System.out.println(i +
		 * " ::: 나머지는 1입니다."); } else if(i % 3 == 0) { System.out.println(i +
		 * " ::: 나머지는 0입니다."); } }
		 */
		
		
	}
}
