
public class SubjectBiology extends SubjectScience {

	protected boolean microscopeInUse;
	
	public SubjectBiology() {
		super();
		microscopeInUse = false;
	}
	
	public void dissect() {
		System.out.println("Students dissect animal.");
		microscopeInUse = true;
	}
	
	public void putMicroscopeAway() {
		microscopeInUse = false;
		System.out.println("Students put microscopes away.");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		
		return obj instanceof SubjectBiology && ((SubjectBiology) obj).microscopeInUse == this.microscopeInUse;
	}	
	
}
