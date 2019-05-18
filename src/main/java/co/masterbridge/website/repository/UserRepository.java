package co.masterbridge.website.repository;

import co.masterbridge.website.model.User;

import java.util.Collection;

public interface UserRepository {

    Collection<User> getAll();

    User getById(String id);

    void create(User user);

    void update(String id, User user);

    boolean login(User user);
}
