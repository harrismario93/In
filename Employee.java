import java.time.chrono.MinguoDate;

public class Employee<MyDate> extends Person {
	protected double salary;
	protected String office;
	protected MyDate dateHired;

    public Employee(String name) {
        this(name, 0, "none", new Object());
    }

    public <MyDate> Employee(String name, double salary, String office, MyDate dateHired) {
        super(office);
        this.salary = salary;
        this.office = office;
        
    }
    public double getSalary() {
    	return salary;
    }
    public void setSalary(double Salary) {
    	this.salary = salary;
    }
    public String getOffice() {
    	return office;
    }
    public void setOffice(String office) {
    	this.office = office;
    }
    public MyDate getDateHired() {
    	return dateHired;
    }
    public void setDateHired(MyDate dateHired) {
    	this.dateHired = dateHired;
    }
    public String toString() {
    	return "Name: " + getName() + " Class: " + this.getClass().getName();
    }

	
	}


