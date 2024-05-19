class CiclomaticComplexity {
	public static void main (String[] args) {
		Programmer senior = new Senior();
		senior.salary = 1000;
		System.out.println(senior.getSalaryBonus());
	}
}

class Programmer {
	public double salary;

        public double getSalaryBonus() {
		return salary * 0.15;
	}
}

class Junior extends Programmer {
	public double getSalaryBonus() {
		return salary * 0.1;	
	}
}

class Senior extends Programmer {
	public double getSalaryBonus() {
		return salary * 0.2;
	}
}
