package com.hrytsyshyn.eventhandler.service.common;

import com.hrytsyshyn.eventhandler.model.entity.Account;
import com.hrytsyshyn.eventhandler.model.repository.AccountRepository;
import com.hrytsyshyn.eventhandler.model.repository.BalanceRepository;
import com.hrytsyshyn.eventhandler.model.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService extends BaseService<Account> {

    private final AccountRepository accountRepository;
    private final BalanceRepository balanceRepository;
    private final PersonRepository personRepository;
}
