package other;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Parent;

public class ParentDA {
    private ArrayList<Parent> parentList;
    
    public ParentDA() throws FileNotFoundException {
        Scanner parentInfo = new Scanner(
            new FileReader("C:\\Users\\LENOVO IDEAPAD\\OneDrive\\Documents\\OOP\\Project2\\OOP\\ParentInfo.csv"));
        
        parentList = new ArrayList<Parent>();

        while (parentInfo.hasNext()) {
            String rowparentInfo = new String();
            rowparentInfo = parentInfo.nextLine();

            String[] rowparentInfoSpecific = new String[3];
            rowparentInfoSpecific = rowparentInfo.split(",");

            Parent parent = new Parent();

            parent.setStudentNumber(rowparentInfoSpecific[0].trim());
            parent.setparentName(rowparentInfoSpecific[1].trim());
            parent.setparentCode(rowparentInfoSpecific[2].trim());


            AddressDA AddressInfoDA = new AddressDA(parent.getStudentNumber());

            parent.setaddressInfoList(AddressInfoDA.getaddressList());

            parentList.add(parent);
            
        }
        parentInfo.close();
    }
    public ArrayList<Parent> getparentInfoList(){
        return parentList;
    }
}
