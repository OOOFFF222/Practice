package ex_3;

public class ex_3 {
	/*
	 * public static void main(String[] args) { ProcureItemVO procureItemVO = new
	 * ProcureItemVO();
	 * 
	 * System.out.println("�ƹ� �͵� �������� ���� ��ü ::: " + procureItemVO.toString());
	 * 
	 * procureItemVO.setId(1); procureItemVO.setName("������");
	 * procureItemVO.setPrice(10000); procureItemVO.setQuantity(2);
	 * 
	 * System.out.println("������ VO : " + procureItemVO.toString());
	 * 
	 * 
	 * ProcureItemVO procureItemVoNull = null;
	 * System.out.println("procureItemVoNull ::: " + procureItemVoNull);
	 * 
	 * String sampleString = "������"; String sampleExt = "abc"; boolean boolEqual =
	 * sampleString.equals(sampleExt); }
	 */
	
	/*
	 * public static void main(String[] args) { ProcurementDocument
	 * procurementDocument = new ProcurementDocument();
	 * 
	 * procurementDocument.procureRequestDocumentQty = 10;
	 * procurementDocument.orderRequestDocumentQty = 5;
	 * procurementDocument.orderDocumentQty = 3;
	 * procurementDocument.contractDocumentQty = 20;
	 * procurementDocument.estimateDocumentQty = 25;
	 * 
	 * System.out.println(procurementDocument.procureRequestDocumentQty);
	 * System.out.println(procurementDocument.orderRequestDocumentQty);
	 * System.out.println(procurementDocument.orderDocumentQty);
	 * System.out.println(procurementDocument.contractDocumentQty);
	 * System.out.println(procurementDocument.estimateDocumentQty);
	 * 
	 * int getTotalDocuQty = procurementDocument.totalDocumentQtyDailyMake();
	 * System.out.println("getTotalDocuQty ::: " + getTotalDocuQty);
	 * 
	 * 
	 * int getStatictotalDocuQty =
	 * procurementDocument.staticValueCalculateDailyDocument();
	 * System.out.println("getStaticTotalDocuQty ::: " + getStatictotalDocuQty); }
	 */
	
	public static void main(String[] args) {
		ProcureItemDocument procureItemDocument = new ProcureItemDocument();
		
		procureItemDocument.id = 1;
		procureItemDocument.procureItemName = "����";
		procureItemDocument.procureItemUnitName = "��";
		procureItemDocument.procureItemPrice = 1000;
		procureItemDocument.procureItemQty = 3;
		
		int addItemQtyPrice = procureItemDocument.addProcureItemQtyPrice();
		System.out.println("addItemQtyPrice ::: " + addItemQtyPrice);
		String concatStrVal = procureItemDocument.concatStringValues();
		System.out.println("concatStrVal ::: " + concatStrVal);
		procureItemDocument.showEachVariableValue();
	}
}
