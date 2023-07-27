package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account a;

    @BeforeEach
    void setUp() {
        Account a = new Account(new String[]{"debit", "credit"}, "s1", "a001", "qwerty");
    }

    @Test
    void compareTo() {
    }
}