
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
import  javax.swing.JOptionPane;

/**
 *
 * @author usama
 */
public class Contact implements java.io.Serializable
{
    private String FirstName=null;
    private String LastName=null;
    private String FullName=null;
    protected String Gender=null;
    public String Company=null;
    private ArrayList<String> Number = null;
    private ArrayList<String> NumberType = null;
    private ArrayList<String> E_Mail = null;
    private String Address=null;
    private String Birthday=null;
    
    
    
    /**
     *
     */
    public Contact()
    {
        this.Number = new ArrayList();
        this.NumberType=new ArrayList();
        this.E_Mail=new ArrayList();
    }
    
    /**
     *
     * @param FirstName
     * @param LastName
     * @param Number
     * @param NumberType
     */
    public Contact(String FirstName,String LastName,String Number,String NumberType)
    {
        this.Number = new ArrayList();
        this.NumberType=new ArrayList();
        this.E_Mail=new ArrayList();
        
        this.FirstName=FirstName;
        this.LastName=LastName;
        setFullName();
        this.Number.add(Number);
        this.NumberType.add(NumberType);
    }  
    
    /**
     *
     * @return
     */
    public String getFirstName() 
    {
        return FirstName;
    }

    /**
     *
     * @return
     */
    public String getLastName()
    {
        return LastName;
    }

    /**
     *
     * @return
     */
    public String getFullName() 
    {
        return FullName;
    }

    /**
     *
     * @return
     */
    public String getCompany() 
    {
        return Company;
    }

    /**
     *
     * @param i
     * @return
     */
    public String getNumber(int i) 
    {
       return Number.get(i);
    }

    /**
     *
     * @param i
     * @return
     */
    public String getNumberType(int i) 
    {
        return NumberType.get(i);
    }

    /**
     *
     * @param i
     * @return
     */
    public String getE_Mail(int i)
    {
        return E_Mail.get(i);
    }

    /**
     *
     * @return
     */
    public String getAddress() 
    {
        return Address;
    }

    /**
     *
     * @return
     */
    public String getBirthday() 
    {
        return Birthday;
    }

    /**
     *
     * @return
     */
    public String getGender()
    {
        return Gender;
    }
    
    /**
     *
     * @param FirstName
     */
    public void setFirstName(String FirstName) 
    {
        this.FirstName = FirstName;
        setFullName();
    }

    /**
     *
     * @param LastName
     */
    public void setLastName(String LastName) 
    {
        this.LastName = LastName;
        setFullName();
    }

    private void setFullName() 
    {
        if(FirstName!=null && LastName!= null)
        {
        FullName = FirstName + " " + LastName;
        }
        else if(FirstName!=null && LastName == null)
        {
            FullName = FirstName;
        }
        else if(FirstName==null && LastName != null)
        {
            FullName = LastName;
        }
           
    }

    /**
     *
     * @param Company
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     *
     * @param Number
     * @param NumberType
     */
    public void addNumber(String Number,String NumberType )
    {
        this.Number.add(Number);
        this.NumberType.add(NumberType);
    }

    /**
     *
     * @param E_mail
     */
    public void addE_Mail(String E_mail) 
    {
        this.E_Mail.add(E_mail);
    }

    /**
     *
     * @param Address
     */
    public void setAddress(String Address) 
    {
        this.Address = Address;
    }

    /**
     *
     * @param Birthday
     */
    public void setBirthday(String Birthday)
    {
        this.Birthday = Birthday;
    }
    
    /**
     *
     * @param Gender
     */
    public void setGender(String Gender) 
    {
        this.Gender = Gender;
    }
    
    /**
     *
     * @param i
     */
    public void DelNumberIndex(int i)
    {
        Number.remove(i);
        NumberType.remove(i);
    }
    
    /**
     *
     * @param i
     */
    public void DelNumberValue(String i)
    {
        int j = Number.indexOf(i);
        Number.remove(j);
        NumberType.remove(j);
    }

    /**
     *
     * @param i
     */
    public void DelE_MailIndex(int i)
    {
        E_Mail.remove(i);
    }
    
    /**
     *
     * @param i
     */
    public void DelE_MailValue(String i)
    {
        E_Mail.remove(i);
    }
        
    /**
     *
     */
    public void showContact()
    {
        int i;
        JOptionPane.showMessageDialog(null,"Name        : " +FullName
                                     +"\n"+"Number      : " +NumberType.get(0)
                                     +"\n"+"Number Type : " +Number.get(0)
                                     +"\n"+"Gender      : " +Gender
                                     +"\n"+"Company     : " +Company
                                     +"\n"+"E-Mail      : " +E_Mail.get(0)
                                     +"\n"+"Address     : " +Address
                                     +"\n"+"Birthday    : " +Birthday,
                                           "Contact Details",
                                           JOptionPane.INFORMATION_MESSAGE);

       
    }
    
    /**
     *
     * @return
     */
    public int sizeno()
    {
        return Number.size();
    }
}

