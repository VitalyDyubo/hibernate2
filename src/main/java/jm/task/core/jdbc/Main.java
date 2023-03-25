package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Petr", "Petrov", (byte) 45);
        userService.saveUser("Vasily", "Pupkin", (byte) 24);
        userService.saveUser("Ivan", "Ivanov", (byte) 33);
        userService.saveUser("Dmitry", "Butov", (byte) 25);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
