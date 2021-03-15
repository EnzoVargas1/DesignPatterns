
public class Test {
	
	public static void main(String [] args) {
		OldCoffeeMachine ocm = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter ctsa = new CoffeeTouchscreenAdapter(ocm);
		
		System.out.println("ocm");
		System.out.println();
		ocm.selectA();
		ocm.selectB();
		System.out.println();
		System.out.println("ctsa");
		System.out.println();
		ctsa.chooseFirstSelection();
		ctsa.chooseSecondSelection();
		
	}
}
