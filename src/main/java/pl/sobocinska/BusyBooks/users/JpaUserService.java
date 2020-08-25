package pl.sobocinska.BusyBooks.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Primary
@Transactional
public class JpaUserService implements userService{
    private final userRepository userRepository;

    @Autowired
    public JpaUserService(pl.sobocinska.BusyBooks.users.userRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void editUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(userRepository.getOne(id));
    }
}
