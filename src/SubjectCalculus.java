
public class SubjectCalculus extends SubjectMath {
	
	private int integrateCount;
	
	public void integrate() {
		System.out.println("Doing integrate problems...");
		++ integrateCount;
	}
	
	public String getCurrentDerivative() {
		return "";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		
		return obj instanceof SubjectCalculus && ((SubjectCalculus) obj).integrateCount == this.integrateCount;
	}

}
