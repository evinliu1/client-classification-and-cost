package practice;

public class Man {
	
public String name;
public int height;

public Man(String name, int height) {
	this.name = name;
	this.height = height;
}

public String getName() {
	return name;
}

public int getHeight() {
	return height;
}

public double getPrice() {
	return 30.00;
}

public void toDisplay() {
	System.out.println(getName() + " is " + getHeight() + " inches tall and needs to pay " + getPrice() + ".");
}

}
