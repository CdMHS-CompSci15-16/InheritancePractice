
public class SubjectScience extends Subject {
	
	protected boolean classOnFire;
	
	public SubjectScience() {
		super();
		classOnFire = false;
	}
	
	public void labExperiment() {
		System.out.println("Class does an experiment.");
		if (Math.random() < .33) {
			classOnFire = true;
		}
		System.out.println("Class is ");
	}
	
	public boolean isClassOnFire() {
		return classOnFire;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		
		return obj instanceof SubjectScience && ((SubjectScience) obj).classOnFire == this.classOnFire;
	}
	
}
