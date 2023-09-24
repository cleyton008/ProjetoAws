package br.com.cleyton.student;
// Crinado objetos a apartir da classe Student
public class School {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Daniela";
		student1.age = 18;
		student1.color = Color.FAIR;
		student1.sex = Sex.MALE;
		
		Student student2 = new Student();
		student2.name = "Tânia";
		student2.age = 29;
		student2.color = Color.FAIR;
		student2.sex = Sex.FEMALE;
		
		Student student3 = new Student();
		student3.name = "Roberta";
		student3.age = 35;
		student3.color = Color.DARK;
		student3.sex = Sex.FEMALE;
		
	}

}
