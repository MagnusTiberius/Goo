package org.begonza.goo.repo;

import java.util.List;

import org.begonza.goo.domain.User;

public interface UserDao
{
    public User findById(Integer id);

    public User findByEmail(String email);

    public List<User> findAllOrderedByName();

    public void register(User member);
}
