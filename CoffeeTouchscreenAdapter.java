
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	OldCoffeeMachine ocm;
	
	public CoffeeTouchscreenAdapter(OldCoffeeMachine ocm) {
		this.ocm = ocm;
	}
	
   public void chooseFirstSelection() {
		ocm.selectA();
	}
	
	public void chooseSecondSelection() {
		ocm.selectB();
	}
	
}
