package repository;

import dto.User;

public interface UserRepository <E extends User, I> extends Repository<E, I>{
    E findByFio(String lastName, String firstName);
}
