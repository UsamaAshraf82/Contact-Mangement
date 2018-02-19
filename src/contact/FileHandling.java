
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author usama
 */
public class FileHandling {
        String dataFolder = System.getenv("APPDATA")+"\\Contact";
        String dataFile = System.getenv("APPDATA")+"\\Contact\\Contact.lol";
     /**
     *
     * @param C
     * @param Sel
     */
    public void writefile(ArrayList<Contact> C, int Sel)
    {

        try {
            
            int i = 0;
            File file = new File(dataFile);
            File filedir = new File(dataFolder);
            if (Sel == 1)
            {
                if (file.exists())
                {
                    C.addAll(readFile());
                }
            } 
            if(filedir.exists())
            {
            }
            else
            {
                filedir.mkdir();
            }
            FileOutputStream out = new FileOutputStream(dataFile);
            ObjectOutputStream oout = new ObjectOutputStream(out);
            Contact A = new Contact();
            for (i = 0; i < C.size(); i++)
            {
                A = C.get(i);
                oout.writeObject(A);
            } 
            oout.close();
            out.close();
     
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Contact> readFile()
    {
     
        try {
            Contact e = new Contact();
            ContactMemory CM = new ContactMemory();
            FileInputStream fileIn = new FileInputStream(dataFile);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            while (fileIn.available() > 0) {
                e = (Contact) in.readObject();
                CM.addContact(e);
            }
            
            in.close();
            fileIn.close();
            return CM.getList();
        
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException : readFile : FileHandling");
        } catch (IOException ex) {
            System.out.println("IOException : readFile : FileHandling");
        }
        return null;
    }

}
