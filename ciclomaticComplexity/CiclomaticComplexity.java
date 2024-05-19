class CiclomaticComplexity {
	public static void main (String[] args) {
		Programmer e = new Programmer();
		e.position = "senior";
		e.salary = 1000;
		System.out.println(e.getSalaryBonus());
	}
}

class Programmer {
	public String position;
	public double salary;

	public double getSalaryBonus () {
		if (this.type == "junior") {
			return salary * 0.1;
		} else if (this.type == "senior") {
			return salary * 0.2;
		} else {
			return salary 0.15;
		}
	}
}
