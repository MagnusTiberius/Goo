package org.begonza.goo.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.begonza.goo.domain.User;
import org.begonza.goo.domain.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserProfileDaoImpl implements UserProfileDao
{
    @Autowired
    private EntityManager em;

	@Override
	public UserProfile findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfile findByUserId(Integer UserId) {
		// TODO Auto-generated method stub
		return null;
	}

}
