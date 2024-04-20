package com.exam.services.implement;


import com.exam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class userDetailServiceImpl implements UserDetailsService {

    @Autowired
    private com.exam.repo.userRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println(s);
        User user=this.userRepository.findByuserName(s);
         if(user==null)
         {
             System.out.println("User not found exception");
             throw new UsernameNotFoundException("No user found");
         }
         return user;
    }
}
