public class Task017 {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.name = "John"; //Error: name has private access
        System.out.println(myObj.name); //Error: name is not accessible
    }
}
