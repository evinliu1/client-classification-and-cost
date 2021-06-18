package practice;

public class Boy extends Man {

public int grade;
public int age;

public Boy(String a, int b, int grade, int age) {
	super(a,b);
	this.grade = grade;
	this.age = age;
}

public int getGrade() {
	return grade;
}

public int getAge() {
	return age;
}
@Override
public double getPrice() {
	if (age <=7 && age >4) {
		return 15.00;
	} else {
		return 30.00;
	}
}

@Override
public void toDisplay() {
	System.out.println(getName() + " is " + getHeight() + " inches tall and needs to pay " + getPrice() + " He is in " + getGrade() + "th grade and his age is " + getGrade());
}
}
