/**
 * Created by HP-Laptop on 17-Aug-16.
 */
public class DemoApp {

    public static void main(String[] args) {


        User utilizator = new User();

        utilizator.userInput();

        Program joc = new Program();

        joc.extragereNumereUser(utilizator.getNumereUser());

        joc.extragereProgram();





    }

}
