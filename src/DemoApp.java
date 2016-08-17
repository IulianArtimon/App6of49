/**
 * Created by HP-Laptop on 17-Aug-16.
 */
public class DemoApp {
                                                  // Application start page
    public static void main(String[] args) {


        User utilizator = new User();             // create an object at runtime

        utilizator.userInput();                   // access method to call a scanner function for user input

        Program joc = new Program();              // create an object at runtime

        joc.extragereNumereUser(utilizator.getNumereUser());    // store data user input ass an arrayList

        joc.extragereProgram();                    // access method to call for Program to randomly generate 6 numbers





    }

}
