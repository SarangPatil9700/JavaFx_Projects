class Core2Web{
	int noOfCourses=8;
	private String favCourse="java";
	void display(){
		System.out.println(noOfCourses);
		System.out.println(favCourse);
	}
}

class Student{
	public static void main(String[] args){
		Core2Web obj=new Core2Web();
		obj.display();
		System.out.println(obj.noOfCourses);
		System.out.println(obj.favCourse);
	}
}
