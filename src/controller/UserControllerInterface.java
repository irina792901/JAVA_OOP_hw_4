package controller;

import dto.User;

public interface UserControllerInterface<E extends User, I> extends ControllerInterface<E, I> {
    E findByFio(String lastName, String firstName);
}
