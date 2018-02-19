
/*
 *     THIS PROGRAM IS MADE BY A STUDENT
 * 
 *     NAME       MUHAMMAD USAMA ASHRAF
 *     REG #      FA15-BSE-101
 *     SECTION    FA15-BSE-B
 * 
 *     COMSATS INTITUTE OF INFORMATION TECNOLOGY
 */
package contact;

import java.util.Scanner;

/**
 *
 * @author usama
 */
public class MainMenu 
{
    FileHandling File = new FileHandling();
    private int i;
    private Scanner Scan = new Scanner(System.in);

    /**
     *
     */
    public void Welcome()
    {
        System.out.println("**************************************");
        System.out.println("******Welcome to Contact Manager******");
        System.out.println("**************************************");
        MainMenu();
    }
    
    /**
     *
     */
    public void MainMenu()
    {
        
        System.out.println("    (1) Add Contact");
        System.out.println("    (2) List Contact");
        System.out.println("    (3) Search Contact");
        System.out.println("    (4) Edit Contact");
        System.out.println("    (5) Delete Contact");
        System.out.println("    (6) Exit");
        
        System.out.println("    ***Enter Choice***");
        
        i = Scan.nextInt();
        
        switch(i)
        {
            case 1:
              //  AddContact();
                 MainMenu();
            case 2:
                ShowContact();
                 MainMenu();
            case 3:
                SearchContact();
                 MainMenu();
            case 4:
                EditContact();
                 MainMenu();
            case 5:
                DelContact();
                 MainMenu();
            case 6:
                Exit();
                 MainMenu();
                
        }   
    }
    
    /**
     *
     */
  /*  public void AddContact()
    {
        Add AA =new Add();
        
        AA.Start();
        ContactMemory TempM =new ContactMemory();
        Contact TempC =new Contact();
           
      //  TempC = ContactDetails();
        TempM.addContact(TempC);
        File.writefile(TempM.getList(), 1);
    }
    
  /*  public Contact ContactDetails()
    {
        String Temp1;
        String Temp;
        Contact TempC =new Contact();
        System.out.println("Enter First Name");
        Temp = Scan.next();
        TempC.setFirstName(Temp);
        System.out.println("Enter Last Name");
        Temp = Scan.next();
        TempC.setLastName(Temp);
        System.out.println("Enter Gender");
        Temp = Scan.next();
        TempC.setGender(Temp);
        System.out.println("Company");
        Temp = Scan.next();
        TempC.setCompany(Temp);
        do
        {
            System.out.println("Enter Number Type");
            System.out.println("and 0 to end");
            Temp = Scan.next();
            if(!Temp.equals("0"))
            {
                System.out.println("Enter Number");;
                Temp1 = Scan.next();
                TempC.addNumber(Temp1, Temp);
            }
        }while(!Temp.equals("0"));
        do
        {
            System.out.println("Enter E-Mail");
            System.out.println("and 0 to end");
            Temp = Scan.next();
            if(!Temp.equals("0"))
            {
                TempC.addE_Mail(Temp);
            }
        }while(!Temp.equals("0"));
        System.out.println("Address");
        Temp = Scan.next();
        TempC.setAddress(Temp);
        System.out.println("Birthday");
        Temp = Scan.next();
        TempC.setBirthday(Temp);
        
        return TempC;
    } */ 

    /**
     *
     */
 
    
    public void ShowContact()
    {
            ContactMemory CM = new ContactMemory();
            CM.setList(File.readFile());
            CM.showList();
         
    }
    
    /**
     *
     */
    public void SearchContact()
    {
 
            String Temp;
            System.out.println("Enter Name");
            Scan.nextLine();
            Temp = Scan.nextLine();
            ContactMemory CM = new ContactMemory();
            CM.setList(File.readFile());
            CM.SearchContactName(Temp);


    }
    
    /**
     *
     */
    public void EditContact()
    {

            String Temp;
            System.out.println("Enter Name");
            Scan.nextLine();
            Temp = Scan.nextLine();
            ContactMemory CM = new ContactMemory();
            CM.setList(File.readFile());
         //   i = CM.EditContact(Temp);
            if (i==-1)
            {
                System.out.println("Contact not Found");
            }
            else
            {
                CM.SearchContactName(Temp);
                CM.getList().remove(i);
            
                Contact C =new Contact();
         //       C = ContactDetails();
                CM.getList().add(i, C);
                File.writefile(CM.getList(), 0);
            }

    }
    
    /**
     *
     */
    public void DelContact()
    {
            String Temp;
            System.out.println("Enter Name");
            Scan.nextLine();
            Temp = Scan.nextLine();
            ContactMemory CM = new ContactMemory();
            CM.setList(File.readFile());
            CM.DelContactName(Temp);
            File.writefile(CM.getList(),0);
       
    }
    
    /**
     *
     */
    public void Exit()
    {
        System.out.println("Exit(Y,N)");
        String Temp;
        Temp = Scan.next();
        if(Temp != null)
        switch (Temp) {
            case "Y":
            case "y":
                System.exit(0);
            case "N":
            case "n":
               break;
            default:
                System.out.println("Invalid Selection");
                Exit();

        }
    }
}
