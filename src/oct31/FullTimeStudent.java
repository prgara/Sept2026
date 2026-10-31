package oct31;

public class FullTimeStudent extends Student{
    String name = "FullTimeStudent";

    void printDetails(){
        System.out.println("Full time student");
    }

    public static class Login {

      private  String userName;
      private  String password;

        public Login(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }


        public String getUserName() {
            return userName;
        }

        public void setPassword(String currentPassword, String newPassword) {
            if (this.password.equals(currentPassword)){
                password = newPassword;
            }
        }
    }
}
