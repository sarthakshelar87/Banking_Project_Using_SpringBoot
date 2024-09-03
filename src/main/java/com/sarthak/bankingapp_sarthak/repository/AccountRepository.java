package com.sarthak.bankingapp_sarthak.repository;

import com.sarthak.bankingapp_sarthak.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
