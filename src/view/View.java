package view;

import controller.UserController;
import model.User;

public class View {
    private static final UserController userController
             = new UserController();
    public static void UI(){
        System.out.println("This is view (Before add): ");
        userController.getAllUsers()
                .forEach(System.out::println);
        System.out.println();


        userController.addNewUser(new User(100,"Hana","hana@gmail.com"));
        System.out.println("Adding new user :");
        userController.getAllUsers().forEach(System.out::println);
        System.out.println();


        userController.deleteUser(1).forEach(System.out::println);
        System.out.println("After deleted :");
        userController.getAllUsers().forEach(System.out::println);
    }


}
