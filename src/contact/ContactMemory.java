

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

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usama
 * 
 */
public class ContactMemory 
{
     FileHandling F =new FileHandling();
     private ArrayList<Contact> list = new ArrayList<Contact>();
    
    /**
     *
     * @param C
     */
    public void addContact(Contact C)
    {
        list.add(C);
    }
    
    /**
     *
     */
    public void showList()
    {
        int i;
         Contact Temp2 =new Contact();
    
        for(i=0;i<list.size();i++)
        {
            Temp2 = list.get(i);
            Temp2.showContact();
        }  
    }

    /**
     *
     * @param Name
     * @return
     */
    public int DelContactName(String Name)
    {
        int i;
        Contact Temp1 =new Contact();
        Contact Temp2 =new Contact();
        Temp1.setFirstName(Name);
        for(i=0;i<list.size();i++)
        {
            Temp2 = list.get(i);
            if(Temp1.getFullName().equalsIgnoreCase(Temp2.getFullName()))
            {
                
          
                return i;
            }           
        }
        
        return -1;
        
    }
    
    /**
     *
     * @param Name
     * @return
     */
    public Contact EditContact(String Name)
    {
        int i;
        Contact Temp1 =new Contact();
        Contact Temp2 =new Contact();
        Temp1.setFirstName(Name);     
        for(i=0;i<list.size();i++)
        {
            Temp2 = list.get(i);
            if(Temp1.getFullName().equalsIgnoreCase(Temp2.getFullName()))
            {
                return  Temp2;
                

            }
            
        }
       return null;
    }
    
    /**
     *
     * @param Name
     */
    public void SearchContactName(String Name)
    {
        int i;
        Contact Temp1 =new Contact();
        Contact Temp2 =new Contact();
        Temp1.setFirstName(Name);
        for(i=0;i<list.size();i++)
        {
            Temp2 = list.get(i);
            if(Temp1.getFullName().equalsIgnoreCase(Temp2.getFullName()))
            {
                Temp2.showContact();
                break;
            }
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Contact> getList() {
        return list;
    }

    /**
     *
     * @param list
     */
    public void setList(ArrayList<Contact> list) {
        this.list = list;
    }
}
