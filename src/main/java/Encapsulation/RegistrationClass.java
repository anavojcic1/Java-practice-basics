/*
 Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
Valid email consider to be only yahoo
Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName.
 */
package Encapsulation;

public class RegistrationClass{
    private String email;
    private String userName;
    private String password;
    public RegistrationClass(){
    }
    public void setEmail(String email){
        if(email.toLowerCase().contains("yahoo")){
            this.email = email;
        } else {
            System.out.println("Not a valid email");
        }
    }

    public void setUserName(String userName){
        if(userName.length()>6){
            this.userName = userName;
        }else{
            System.out.println("Not a valid username");
        }
    }

    public void setPassword(String password){
        if(password.length()>6 &&!password.contains(userName)){
            this.password = password;
        }else{
            System.out.println("Not a valid password");
        }
    }

    public void printInfo(){
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }
}
