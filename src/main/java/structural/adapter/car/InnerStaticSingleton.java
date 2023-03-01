package structural.adapter.car;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//class AtmMachine {
//    private String machineId;
//    private String bankName;
//    private Boolean isActive;
//    private Map<String, TransactionTypeFactory> namedFactories = new HashMap<>();
//
//    private AtmMachine() {
//        Set<Class <? extends TransactionType>> types = new Reflections("").getSubTypesOf(TransactionType.class);
//        for(Class<? extends TransactionType> type : types) {
//            namedFactories.put(type.getSimpleName().replace("Factory", ""), type.getDeclaredConstructor().newInstance());
//        }        
//    }
//
//    private static class AtmMachineFactory {
//        private static final AtmMachine atmMachine = new AtmMachine();
//    }
//
//    public static AtmMachine getInstance() {
//        return AtmMachineFactory.atmMachine;
//    }
//
//    public TransactionType getTransactionType(String transactionType) {
//        return types.get(transactionType);
//    }
//}

interface TransactionTypeFactory {
    public TransactionType prepare(Transaction transaction, Account account);
}
interface TransactionType {
    public Boolean init();
}
class WithdrawMoneyFactory implements TransactionTypeFactory{
	@Override
	public TransactionType prepare(Transaction transaction, Account account) {
        return new WithdrawMoney(transaction, account);
    }

}

class DepositeMoneyFactory implements TransactionTypeFactory{
    public TransactionType prepare(Transaction transaction, Account account) {
    	
        return new DepositeMoney(transaction, account);
    }
}



class Account {
    private String accountNo;
    private Double currentBalance;
    private String firstName;
    private String lastName;
    private Boolean isActive;

    public Account(String accountNo, Double currentBalance, String firstName, String lastName, Boolean isActive) {
        this.accountNo = accountNo;
        this.currentBalance = currentBalance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
    }
}

class WithdrawMoney implements TransactionType {
    
    private Transaction transaction;
    private Account account;
    
    public WithdrawMoney(Transaction transaction, Account account) {
        this.transaction = transaction;
        this.account = account;
    }

    @Override
    public Boolean init() {
    	return false;
    }
}

class DepositeMoney implements TransactionType {
    
    private Transaction transaction;
    private Account account;

    public DepositeMoney(Transaction transaction, Account account) {
        this.transaction = transaction;
        this.account = account;
    }

    @Override
    public Boolean init() {
    	return false;
    }
}

class Transaction {
    private Double amount;
    private TransactionStatus transactionStatus;

    public Transaction() {
        transactionStatus = TransactionStatus.INIT;
    }

    public Transaction(Double amount) {
        this();
        this.amount = amount;
    }
}

enum TransactionStatus {
    INIT, IN_PROCESS, SUCCESS, FAIL;
}

