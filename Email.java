import java.util.Scanner;


public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int DefaultPassword=10;
    private int mailboxCapacity;
    private String alternateEmail;


    public Email(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        //System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);

        //call a method asking a department - return name department
        this.department = setDepartment();
        //System.out.print("Department\n" + this.department);

        //call a method that returns a random password
        this.password = randomPassword(DefaultPassword);
        System.out.println("Your password is:" + this.password);
    }
    private String setDepartment()
    {
        System.out.print("Enter the department\n1 for sales\n 2 for Development\n 3 for Accountant\n 0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice==1) {return "Sales";}
        else if(depChoice == 2) {return "Development";}
        else if(depChoice == 3) {return "Accountant";}
        else {return "";}

    }
    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXYZ0123456789!@#%&";
        char[] password = new char[length];
        for( int i=0; i<length; i++)
        {
            int rand = (int) (Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //set the mailbox capacity
    public void SetCapacity(int capacity) //enkapsulacja
    {
        this.mailboxCapacity = capacity;
    }
    //change the password
    public void ChangePassword(String password)
    {
        this.password = password;
    }
    public int GetCapacity()
    {
        return mailboxCapacity;
    }
    public String GetPassword(){
        return password;
    }
    public String ShowInfo()
    {
        return "Display name:" + firstname + " " + lastname +
                "Capacity" + mailboxCapacity + "mb";
    }



}


