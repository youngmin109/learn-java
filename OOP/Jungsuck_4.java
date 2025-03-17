package OOP;

class User {
    String id;
    String department;
    String university = "영진전문대학교";

    User() {
        university = "영진전문대학교";
    }
    User(String argDepartment) {
        department = argDepartment;
    }

    User(String argDepartment, String argId){
        department = argDepartment;
        id = argId;
    }

}


public class Jungsuck_4 {
    public static void main(String[] args) {
        User us = new User();

        System.out.println("university" );
    }
}
