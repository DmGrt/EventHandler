package com.hrytsyshyn.eventhandler.service.common;

import com.hrytsyshyn.eventhandler.model.entity.Balance;
import com.hrytsyshyn.eventhandler.model.repository.BalanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BalanceService extends BaseService<Balance> {
  private final BalanceRepository balanceRepository;
}
