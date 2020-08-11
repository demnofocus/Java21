/*
    Day 06
    Exercise
*/

public class ZipCode{
    private String code;
    
    public void setCode(String code){
        if(code.length()!=5){
            System.out.println("Invalid ZipCode!");
        }else{
            this.code = code;
        }
    }
    
    public String getCode(){
        return this.code;
    }
    
    public static void main(String[] args){
        ZipCode zipcode = new ZipCode();
        zipcode.setCode("10250");
        
        System.out.println("ZipCode is " + zipcode.getCode());
    }
}