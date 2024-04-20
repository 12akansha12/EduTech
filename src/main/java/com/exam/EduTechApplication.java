package com.exam;

import com.exam.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EduTechApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EduTechApplication.class, args);
    }

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void run(String... args) throws Exception {
//
        System.out.println("Project Running");
//                User user=new User();
//        user.setfName("Akansh");
//        user.setLname("Singh");
//        user.setEmail("akanshasinghnit@gmail.com");
//        user.setPassword(this.bCryptPasswordEncoder.encode("1234"));
//        user.setUserName("akanshasingh");
//        user.setPhone("999");
//        user.setProfile("default.png");
//
//        Role role = new Role();
//        role.setRoleId(16L);
//        role.setRoleName("ADMIN");
//        Set<userRole> userRoleSet=new HashSet<>();
//        userRole userRole=new userRole();
//        userRole.setRole(role);
//        userRole.setUser(user);
//        userRoleSet.add(userRole);
//        User user1 = this.userService.createUser(user,userRoleSet);
//        System.out.println(user1);

    }
}
