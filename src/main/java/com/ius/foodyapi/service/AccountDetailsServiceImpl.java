package com.ius.foodyapi.service;

import com.ius.foodyapi.model.Account;
import com.ius.foodyapi.repository.AccountRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import static java.util.Collections.emptyList;

/**
 * This is the only service that we currently have
 * and it is a Service implementation called Account Details
 * which has to be provided to the authentication and authorization.
 */
@Service
public class AccountDetailsServiceImpl implements UserDetailsService {
    private AccountRepository accountRepository;

    public AccountDetailsServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUsername(username);
        if (account == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(account.getUsername(), account.getPassword(), emptyList());
    }
}
