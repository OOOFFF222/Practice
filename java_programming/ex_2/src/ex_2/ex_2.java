package ex_2;

import java.util.ArrayList;

public class ex_2 {
	public static void main(String[] args) {
		/*
		 * if (true) { System.out.println(); }
		 * 
		 * if (false) { System.out.println("false�Դϴ�."); }
		 */
		
		/*
		 * if(true) { System.out.println("ifelse true�Դϴ�."); } else if (false) {
		 * System.out.println("ifelse false�Դϴ�."); }
		 */
		
		/*
		 * int paramA = 1; if (paramA == 2) { System.out.println("ù ��° else�Դϴ�."); }
		 * else if (paramA == 1) { System.out.println("�� ��° else�Դϴ�."); }
		 */
		
		/*
		 * int paramA = 1;
		 * 
		 * if (paramA == 1) { System.out.println("ù ��° ���Դϴ�."); } else if (paramA == 1)
		 * { System.out.println("�� ��° ���Դϴ�."); }
		 */
		
		/*
		 * int paramA = 1;
		 * 
		 * if (paramA == 2) { System.out.println("paramA�� 2"); } else if (paramA == 3) {
		 * System.out.println("paramA �� 3"); } else { System.out.println("paramA�� 1"); }
		 */
		
		/*
		 * int paramA = 1; if (paramA == 2) { System.out.println("paramA�� 2�Դϴ�."); }
		 * else { System.out.println("paramA�� else�Դϴ�."); }
		 * 
		 * int productionRadio = 30;
		 * 
		 * if (productionRadio > 70) { System.out.println("���귮�� ��ȣ�մϴ�."); } else {
		 * System.out.println("���귮�� �����մϴ�."); }
		 */
		
		/*
		 * int paramA = 1;
		 * 
		 * if (paramA == 2) { System.out.println("�ƹ� �͵�.... paramA�� 2�Դϴ�."); } else if
		 * (paramA == 3) { System.out.println("�ƹ� �͵�.... paramA�� 3�Դϴ�."); }
		 */
		
		/*
		 * int paramA = 1;
		 * 
		 * switch (paramA) { case 0 : System.out.println("0�Դϴ�."); break; case 1 :
		 * System.out.println("1�Դϴ�."); break; case 2 : System.out.println("2�Դϴ�.");
		 * break; case 3 : System.out.println("3�Դϴ�."); break; case 4 :
		 * System.out.println("4�Դϴ�."); break; }
		 */
		/*
		 * int paramA = 0;
		 * 
		 * switch (paramA) { case 0 : case 1 : System.out.println("0�� 1�Դϴ�."); break;
		 * case 2 : case 3 : System.out.println("0�� 1�Դϴ�."); break; default :
		 * System.out.println("default�Դϴ�."); break; }
		 */
		/*
		 * int intCnt = 2;
		 * 
		 * if (intCnt % 2 == 0) { if (intCnt == 2) { System.out.println("int�ڷᰡ 2�Դϴ�.");
		 * } else { System.out.println("int �ڷᰡ 2�� �ƴմϴ�."); } }
		 */
		
		/*
		 * int intParamA = 9;
		 * 
		 * switch (intParamA) { case 0: System.out.println("intParamA�� 0�Դϴ�."); break;
		 * case 1: System.out.println("intParamA�� 1�Դϴ�."); break; case 2:
		 * System.out.println("intParamA�� 2�Դϴ�."); break; case 3:
		 * System.out.println("intParamA�� 3�Դϴ�."); break; case 5:
		 * System.out.println("intParamA�� 4�Դϴ�."); break; default:
		 * System.out.println("default�Դϴ�."); break; }
		 */
		
		/*
		 * for(int i=0;i<5;i++) { System.out.println("i�� "+i+"�Դϴ�"); }
		 */
		
		/*
		 * int whileCnt = 0; while (whileCnt < 5) { System.out.println("�ݺ���++ : " +
		 * whileCnt++ + " �Դϴ�."); } whileCnt = 0; while (whileCnt < 5) {
		 * System.out.println("++�ݺ��� : " + ++whileCnt + " �Դϴ�."); }
		 */
		
		/*
		 * for (int i = 1;i<=5;i++) { System.out.println("1����... " + i + " �Դϴ�."); }
		 */
		
		/*
		 * for (int i = 10;i>0;i-=2) { System.out.println("i�� -=2 ::: " + i); }
		 */
		
		/*
		 * for (int x = 2; x < 10; x++) { for (int y = 1; y < 10; y++) {
		 * System.out.println(x + "�� : " + x + " X " + y + " = " + (x*y)); } }
		 */
		
		/*
		 * int whileCnt = 0; while ( whileCnt < 10) { whileCnt++;
		 * System.out.println("whileCnt ::: " + whileCnt); }
		 */
		
		/*
		 * int whileCnt = 0; boolean isTrue = true;
		 * 
		 * while (isTrue) { whileCnt++; System.out.println("if whileCnt��" + whileCnt);
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
		 * if (getMathRandom % 2 == 0) { System.out.println("�������� ¦���Դϴ�."); if
		 * (getMathRandom % 4 == 0) { System.out.println("4�� ����� �������ϴ�."); } else {
		 * System.out.println("4�� ����� �������� �ʽ��ϴ�."); } } else {
		 * System.out.println("�������� Ȧ���Դϴ�."); if (getMathRandom % 3 == 0) {
		 * System.out.println("3���� ������ �������ϴ�."); } else {
		 * System.out.println("3���� ������ �������� �ʽ��ϴ�."); } } }
		 */
		
		/*
		 * for(int i = 0;i<10;i++) { if (i%2 == 0) { System.out.println(i +
		 * " ::: ���� �ݺ����� ¦���Դϴ�."); } else { System.out.println(t +
		 * " ::: ���� �ݺ����� Ȧ���Դϴ�."); } }
		 */
		
		/*
		 * for(int i=0;i<10;i++) { if (i%3 == 2) { System.out.println(i +
		 * " ::: �������� 2�Դϴ�."); } else if(i%3 == 1) { System.out.println(i +
		 * " ::: �������� 1�Դϴ�."); } else if(i % 3 == 0) { System.out.println(i +
		 * " ::: �������� 0�Դϴ�."); } }
		 */
		
		
	}
}
