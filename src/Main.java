
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControlFactory controlFactory = new ControlFactory();
		
		IControl exercise = controlFactory.getControl("EXERCISE");
		IControl multiplier = controlFactory.getControl("MULTIPLIER");
		IControl rank = controlFactory.getControl("RANK");
		
		exercise.createControl();
		multiplier.createControl();
		rank.createControl();

	}

}
