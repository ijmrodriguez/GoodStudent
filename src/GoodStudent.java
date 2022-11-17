public class GoodStudent
{
    // 1) class or instance variables
    private double GPA;
    private String firstName;
    private String lastName;
    private int ID;
    private boolean CSstudent;

    // 2) Constructors
    public GoodStudent(double GPA, String firstName, String lastName, int ID, boolean CSstudent)
    {
        this.GPA = GPA;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.CSstudent = CSstudent;
    }//end full constructor

    // 3) Getters
    public double getGPA()
    {
        return GPA;
    } // end gpa getter

    public String getfirstName()
    {
        return firstName;
    } //end first name getter

    public String getlastName()
    {
        return lastName;
    } //end last name getter

    public int getID()
    {
        return ID;
    }

    public boolean getCSstudent()
    {
        return CSstudent;
    }

    // 5) Setter to change value
    public void setID(int setID)
    {
        ID = setID;
    }// end ID setter

    public void setGPA(double setGPA)
    {
        GPA = setGPA;
    }// end ID setter

    // 6) Brain Methods

    public String CreateID()
    {
        String nums = String.valueOf(ID);
        String firstInitial = firstName.substring(0, 1);
        return firstInitial + lastName + nums.substring(nums.length()-3);
    } // end create id

    public double CSGPA()
    {
        return GPA * 1.15;
    } // end create id


    //To String
    public String toString()
    {
        String output = "First name: " + firstName +
                "\nLast name: " + lastName +
                "\nGPA: " + GPA +
                "\nID: " + CreateID() +
                "\nCS student: " + CSstudent;

        return output;
    }
}

