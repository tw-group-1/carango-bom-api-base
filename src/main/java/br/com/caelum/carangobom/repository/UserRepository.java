package br.com.caelum.carangobom.repository;

import br.com.caelum.carangobom.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    void changePassword(Long id, String password);

    void create(User user);

    void delete(Long id);
}
