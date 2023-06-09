package accounts;

import java.math.BigDecimal;

public enum AccountType {
    SAVING("saving_account" ,BigDecimal.valueOf(0.05)),
    CURRENT("current_account" ,BigDecimal.valueOf(0.02)),
    FIXED("fixed_deposit_account" ,BigDecimal.valueOf(0.1));

    private BigDecimal rate;
    private String accountType;

    AccountType(String accountType, BigDecimal rate){
        this.accountType = accountType;
        this.rate = rate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public String getAccountType() {
        return accountType;
    }

}
