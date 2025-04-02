package domain;

import java.util.ArrayList;

public class Parent {
    private String StudentNumber;
    private String parentCode;
    private String parentName;
    private ArrayList<Address> addressList;



    public String getStudentNumber(){
        return StudentNumber;
    }
    public void setStudentNumber(String StudentNumber){
        this.StudentNumber = StudentNumber;
    }
    public String getparentCode(){
        return parentCode;
    }
    public void setparentCode(String parentCode){
        this.parentCode = parentCode;
    }
    public String getparentName(){
        return parentName;
    }
    public void setparentName(String parentName){
        this.parentName = parentName;
    }
    public ArrayList<Address> getaddressInfo() {
        return addressList;
    }
    public void setaddressInfo(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public String toString(){
        String parentOut = new String();
        parentOut += "Parent Child Number: " + StudentNumber + "\n"
        + "Parent Code: " + parentCode + "\n"
        + "Parent Name: " + parentName + "\n";
        parentOut += "\nProvincial Code: " +
                    "City Address";

        
            for (Address address: addressList) {
                parentOut += address;
            }
        
        parentOut += "\n";
        return parentOut;
    }
}
