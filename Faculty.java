
public class Faculty extends Employee{
	public static String LECTURER = "Lecturer";
	public static String ASSISTANT_PROFESSOR = "Assistant Professor";
	public static String ASSOCIATE_PROFESSOR = "Associate Professor";
	public static String PROFESSOR = "Professor";
	
	protected String Officehours;
	protected String rank;
	
	public Faculty(String name) {
		this(name, "9-5PM", "Employee");
	}
	 public Faculty(String name, String officeHours, String rank) {
	        super(name);
	        this.Officehours = officeHours;
	        this.rank = rank;
	    }
	 public String getOfficeHours() {
		 return Officehours;
	 }
	 public void setOfficeHours(String OfficeHours) {
		 this.Officehours = Officehours;
	 }
	 public String getRank() {
		 return rank;
	 }
	 public void setRank(String rank) {
		 this.rank = rank;
	 }
	 public String toString() {
		return "Name: " + getName() + " Class: " + this.getClass().getName();
	 }
	

}
