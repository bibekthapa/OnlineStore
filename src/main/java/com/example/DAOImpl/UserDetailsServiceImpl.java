/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.DAOImpl;

import com.example.data.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;
    
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        
        User user = userRepository.findByUserName(userName);
        
        if(user == null)
        {
            throw new UsernameNotFoundException(userName);
        
        }
        
        return new MyUserPrincipal(user);


        }
    
}
