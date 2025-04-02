package domain;

public class Address {
    private String studentNumber;
    private String cityAddress;
    private String cityCode;

    public String getStudentNumber(){
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }
    public String getCityAddress(){
        return cityAddress;
    }
    public void setCityAddress(String cityAddress){
        this.cityAddress = cityAddress;
    }
    public String getCityCode(){
        return cityCode;
    }
    public void setCityCode(String cityCode){
        this.cityCode = cityCode;
    }

    public String toString(){
        String addressOut = new String();
        addressOut += studentNumber + "\n" + cityAddress + "\n" + cityCode;

        return addressOut;
    }
}
