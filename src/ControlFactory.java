
public class ControlFactory {
	
	public IControl getControl(String controlType) {
		if (controlType == null) {
			return null;
		}
		
		switch (controlType) {
		case "EXERCISE":
			return new ExerciseControl();
		case "MULTIPLIER":
			return new MultiplierControl();
		case "RANK":
			return new RankControl();
		default:
			break;
		}
		return null;
	}

}
