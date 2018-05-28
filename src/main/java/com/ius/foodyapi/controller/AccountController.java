package com.ius.foodyapi.controller;

import com.ius.foodyapi.model.Account;
import com.ius.foodyapi.repository.AccountRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Account is in our case User
 * We use postgresql where user is a reserved keyword
 * so we chose the naming to be Account instead of User
 * The only functionality contained in the Account controller is
 * the registration process, all other operations on account
 * are automatically mapped to the CRUD of the Account Repository
 */
@RestController
public class AccountController {

    private AccountRepository accountRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public AccountController(AccountRepository accountRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.accountRepository = accountRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/register")
    public void register(@RequestBody Account user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        accountRepository.save(user);
    }
}
