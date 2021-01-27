
public class GetterSetter {
	
	private String name;
	private String dept;
	private int age;
	
	
	public static void main(String[] args){
		GetterSetter obj = new GetterSetter();
		
		obj.setName("Naveen");
		obj.setDept("QA");
		obj.setAge(30);
		
		System.out.println(obj.getName());
		System.out.println(obj.getDept());
		System.out.println(obj.getAge());
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
