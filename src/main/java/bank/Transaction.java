package bank;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

public class Transaction {
    private final UUID transactionId;
    private final int accountId;
    private final Timestamp time;
    private TransactionType transactionType;
    private BigDecimal amount;
    private int sourceAccountId;
    private int DestinationAccountId;
    private String status;
    private String description;

    public Transaction(UUID transactionId, int accountId, Timestamp time, TransactionType transactionType, BigDecimal amount, int sourceAccountId, int destinationAccountId, String status, String description) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.time = time;
        this.transactionType = transactionType;
        this.amount = amount;
        this.sourceAccountId = sourceAccountId;
        DestinationAccountId = destinationAccountId;
        this.status = status;
        this.description = description;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public Timestamp getTime() {
        return time;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getSourceAccountId() {
        return sourceAccountId;
    }

    public int getDestinationAccountId() {
        return DestinationAccountId;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setSourceAccountId(int sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public void setDestinationAccountId(int destinationAccountId) {
        DestinationAccountId = destinationAccountId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
