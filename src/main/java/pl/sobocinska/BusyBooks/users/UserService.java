package pl.sobocinska.BusyBooks.users;

import java.util.List;

public interface UserService {

    List<User> findUsers();
    User findUserById(Long id);
    void createUser(User user);
    void editUser(User user);
    void deleteUser(Long id);
}
