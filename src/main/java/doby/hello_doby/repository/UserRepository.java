package doby.hello_doby.repository;

import doby.hello_doby.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    long delete(Long idx);
    Optional<User> findByIdx(Long idx);
    List<User> findAll();
}
