package oops;

public class Employee {
	public String name;
	public int salary;
	
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		
	}

	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}

	
	class Manager extends Employee{
		public int hours,ta;
		Manager(){
			super();
			hours = ta = 0;
		}
		Manager(String n, int sal, int h, int t){
			super(n,sal);
			hours = h;
			ta = t;
		}
		public int getSalary() {
			return (super.getSalary() + hours + ta);
		}
	}
	class Labour extends Employee{
		int time;
		Labour(){
			super();
			time = 4;
		}
		Labour(String n,int sal,int ti){
			time = ti;
		}
		public int getSalary() {
			return (super.getSalary() + time);
		}
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		Manager m1 = e.new Manager("Ravi",250000,500,1500);
		System.out.println("Salary of manager : " + m1.getSalary());
		Labour l = e.new Labour("kumar",45000,1000);
		System.out.println("Salary of Labour : " + l.getSalary());	
	}
	}

