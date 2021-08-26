
public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Employee e1 = new Employee("Robert",1994,50000,"64 C-wall street");
				Employee e2 = new Employee("Sam",2000,60000,"64 D-wall street");
				Employee e3 = new Employee("John",1999,65000,"268-wall street");
				System.out.println("Name\tyear\tsalary\taddress");
				System.out.println(e1.getName()+"\t"+e1.getYear()+"\t"+e1.getSalary()+"\t"+e1.getAddress());
				System.out.println(e2.getName()+"\t"+e2.getYear()+"\t"+e2.getSalary()+"\t"+e2.getAddress());
				System.out.println(e3.getName()+"\t"+e3.getYear()+"\t"+e3.getSalary()+"\t"+e3.getAddress());
			}


	}


