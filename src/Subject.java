import java.lang.reflect.Field;

public abstract class Subject {
	
	protected double grade;
	protected String teacher;
	protected int period;
	
	public double getGrade() {
		return this.grade;
	}
	
	public String getTeacher() {
		return this.teacher;
	}
	
	public int getPeriod() {
		return this.period;
	}
	
	public void teach() {
		System.out.println("Teaching a subject...");
	}
	
	public void learn() {
		System.out.println("Learning a subject...");
	}
	
	public String getStringLetter() {
		char c1;
		if (grade > 100.0D) {
			c1 = 'E';
		} else {
			if (grade >= 90.0D) {
				c1 = 'A';
			} else {
				if (grade >= 80.0D) {
					c1 = 'B';
				} else {
					if (grade >= 70.0D) {
						c1 = 'C';
					} else {
						if (grade >= 60.0D) {
							c1 = 'D';
						} else {
							c1 = 'F';
						}
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder(c1);
		
		if (c1 == 'a' || c1 == 'b' || c1 == 'c' || c1 == 'd') {
			int g1 = ((int) this.grade) % 10;
			
			if (g1 < 3) {
				sb.append('-');
			}
			
			if (g1 >= 7) {
				sb.append('+');
			}
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getClass().getName()).append('{');
		for (Field f : getClass().getFields()) {
			try {
				sb.append(f.getName()).append(" = ").append(f.get(this)).append(";");
			} catch (IllegalArgumentException | IllegalAccessException e) {
				System.err.println("err in " + getClass().getName() + "#toString()");
				e.printStackTrace();
			}
		}
		return sb.append('}').toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		
		Subject that = (Subject) obj;
		return this.teacher.equals(that.teacher) && this.period == that.period;
	}
	
}
