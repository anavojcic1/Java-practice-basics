package Encapsulation;

public class RegistrationClassTester {
    public static void main(String[] args) {
        RegistrationClass a = new RegistrationClass();
        a.setEmail("ana.banana@yahoo.com");
        a.setUserName("rocks");
        a.setPassword("paper");
        a.printInfo();

        System.out.println();

        RegistrationClass b = new RegistrationClass();
        b.setEmail("lana.banana@yahoo.com");
        b.setUserName("cosmos1");
        b.setPassword("nasa123");
        b.printInfo();

    }
}
