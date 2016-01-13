
public class SubjectAlgebra extends SubjectMath {

	private int graphedFunctionCount = 0;
	
	public void graphFunction() {
		System.out.println("Graphing functions");
		graphedFunctionCount ++;
	}
	
	public String getCurrentFunction() {
		return "y=x*5";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		
		return obj instanceof SubjectAlgebra && ((SubjectAlgebra) obj).graphedFunctionCount == this.graphedFunctionCount;
	}
	
}
