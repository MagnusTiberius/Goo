package org.begonza.goo.repo;

import java.util.List;

import org.begonza.goo.domain.UserProfile;

public interface UserProfileDao
{
    public UserProfile findById(Integer id);

    public UserProfile findByUserId(Integer UserId);

}
