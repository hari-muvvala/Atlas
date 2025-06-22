package day7;

public class Task017 {
    public static void main(String[] args) {
        Person myObj = new Person();
        //myObj = new day7.Person();
        myObj.setName("John"); //Initial Error: name has private access; Next changed to setName; set value using setter
        //System.out.println(myObj.name);
        System.out.println(myObj.getName()); //Error: name is not accessible; after change getName is accessible; Get value using Getter
    //After the error used setter and getter
    }
}
