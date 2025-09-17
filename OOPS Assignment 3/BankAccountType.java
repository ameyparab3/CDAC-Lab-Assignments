class Account{
    int accountNo; double balance;
}

class SavingAccount extends Account{
    int interestRate;
    SavingAccount(int accountNo, double balance, int interestRate){
        this.accountNo=accountNo;
        this.balance=balance;
        this.interestRate=interestRate;
    }
}

class CurrentAccount extends Account{
    int overDraft;
    CurrentAccount(int accountNo, double balance, int overDraft){
        this.accountNo=accountNo;
        this.balance=balance;
        this.overDraft=overDraft;
    }
}

class BankAccountType {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(101, 5000, 5);
        CurrentAccount c1 = new CurrentAccount(102, 10000, 2000);
        System.out.println("Saving -> accountNo="+s1.accountNo+", Balance="+s1.balance+", Interest="+s1.interestRate+"%");
        System.out.println("Current -> accountNo="+c1.accountNo+", Balance="+c1.balance+", Overdraft="+c1.overDraft);
    }
}
