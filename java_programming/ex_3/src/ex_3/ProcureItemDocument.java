package ex_3;

public class ProcureItemDocument {
	
	 public int id; 
	 public String procureItemName; 
	 public String procureItemUnitName; 
	 public int procureItemQty; 
	 public int procureItemPrice;
	 
	 public int addProcureItemQtyPrice() { 
		 int result = 0; 
		 result = procureItemQty * procureItemPrice; 
		 return result; 
	 }
	 
	 public void showEachVariableValue() { 
		 System.out.println("id ::: " + id);
		 System.out.println("procureItemName ::: " + procureItemName);
		 System.out.println("procureItemUnitName ::: " + procureItemUnitName);
		 System.out.println("procureItemQty ::: " + procureItemQty);
		 System.out.println("procureItemPrice ::: " + procureItemPrice); 
	 }
	 
	 public String concatStringValues() { 
		 String returnValue = ""; 
		 returnValue = "�ȳ��ϼ���." + " ���Ź���ǰ�� Ŭ�����Դϴ�."; 
		 return returnValue; 
	 }
	 
}
