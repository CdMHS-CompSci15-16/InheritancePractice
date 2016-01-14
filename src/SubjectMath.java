
public abstract class SubjectMath extends Subject {
	
	protected int solvedEquations;
	
	public SubjectMath() {
		super();
		this.solvedEquations = 0;
	}
	
	public void solveEquation() {
		solvedEquations ++;
	}

	public String currentProblem() {
		return "none";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		
		return (obj instanceof SubjectMath) && this.solvedEquations == ((SubjectMath) obj).solvedEquations;
	}
}
