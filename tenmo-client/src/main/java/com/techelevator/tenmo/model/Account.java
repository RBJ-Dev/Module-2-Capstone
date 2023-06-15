package com.techelevator.tenmo.model;
import java.math.BigDecimal;

public class Account {

        //instance variable declarations
        private long accountId;
        private long userId;
        private BigDecimal balance;

        //getters and setters
        public long getAccountId() {
            return accountId;
        }

        public void setAccountId(long accountId) {
            this.accountId = accountId;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public void setBalance(BigDecimal balance) {
            this.balance = balance;
        }
}
