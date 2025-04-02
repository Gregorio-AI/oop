package other;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import domain.Address;

public class AddressDA {
       private ArrayList<Address> addressList;

    public AddressDA(String studentNumber) throws FileNotFoundException {

        Scanner addressInfo = new Scanner(
            new FileReader("C:\\Users\\LENOVO IDEAPAD\\OneDrive\\Documents\\OOP\\Project2\\OOP\\AddressInfo.csv"));

    addressList = new ArrayList<Address>();
    

    while (addressInfo.hasNext()) {
        String rowAddress = new String();
        rowAddress = addressInfo.nextLine();

        String[] rowAddressSpicific = new String[3];
        rowAddressSpicific = rowAddress.split(",");

        if (studentNumber.equals(rowAddressSpicific[0])){

            Address address = new Address();
            address.setStudentNumber(rowAddressSpicific[0].trim());
            address.setCityAddress(rowAddressSpicific[1].trim());
            address.setCityCode(rowAddressSpicific[2].trim());

            addressList.add(address);
        }
        
    }
    addressInfo.close();
    }
    public ArrayList<Address> getAddressList() {
        return addressList;
    }
}
