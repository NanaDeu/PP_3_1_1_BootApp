package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    User getUserById(long id);

    User updateUser(long id, User user);

    User save(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

}
