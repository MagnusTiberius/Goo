package org.begonza.goo.mvc;

import java.util.List;

import org.begonza.goo.domain.User;
import org.begonza.goo.repo.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/members")
public class MemberRestController
{
    @Autowired
    private UserDao memberDao;

    
    @RequestMapping(method=RequestMethod.GET, produces="application/json")
    public @ResponseBody List<User> listAllMembers()
    {
    	List<User> users = memberDao.findAllOrderedByName();
        return users;
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces="application/json")
    public @ResponseBody User lookupMemberById(@PathVariable("id") Integer id)
    {
        return memberDao.findById(id);
    }
}
