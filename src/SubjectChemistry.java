
public class SubjectChemistry extends SubjectScience {

	protected int elementUno;
	protected int elementDos;
	
	public SubjectChemistry() {
		super();
		elementUno = 1;
		elementDos = 2;
	}
	
	public void setElementUno(int num) {
		elementUno = num;
	}
	
	public void setElementDos(int num) {
		elementDos = num;
	}
	
	public void react() {
		System.out.println("Element #" + elementUno + " and element #" + elementDos + " react!");
	}
	
	public void react(int elementUno, int elementDos) {
		System.out.println("Element #" + elementUno + " and element #" + elementDos + " react!");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		
		return obj instanceof SubjectChemistry && ((SubjectChemistry) obj).elementUno == this.elementUno && ((SubjectChemistry) obj).elementDos == this.elementDos;
	}
	
}
