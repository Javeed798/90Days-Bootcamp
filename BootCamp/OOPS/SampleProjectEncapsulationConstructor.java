package BootCamp.OOPS;

class User {
    private Integer id;
    private String userName;
    private String password;

    public User(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
    public Integer getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

}

class UserBO {
    private User[] getUsers() {
        // creating a predefined Array of user Objects//
       User[] users = new User[5];
       users[0] = new User(1,"Javeed","123456");
       users[1] = new User(2,"svdb","ksdbv");
       users[2] = new User(3,"bvks","646df");
       users[3] = new User(4,"skdbnks","jasbf5");
       users[4] = new User(5,"skldfnwni","javeed");
       return users;
    }

    // password encrypted // making password as making every character to be updated to next ascii value

    private String encryptPassword(String password) {
        String res = "";
        for (int i = 0; i < password.length(); i++ ) {
            res = res + (char)(password.charAt(i) + 1);
        }
        return res;
    }

    public boolean validate(String userName, String password) {
        User[] users = getUsers();
        for (int i = 0; i < users.length; i++) {
            String un = users[i].getUserName();
            String pwd = users[i].getPassword();
            if (un.equals(userName) && pwd.equals(encryptPassword(password))) {
                return true;
            }
        }
        return false;
    }
}
public class SampleProjectEncapsulationConstructor {
    public static void main(String[] args) {
        UserBO u = new UserBO();
        System.out.println(u.validate("Javeed", "123456"));
    }

}
