class BankAccount{
    private final long amount;

    BankAccount(long amount){
        this.amount = amount;
    }
    public long withDraw(long withdrawalAmount) throws InsufficientFundsExpcetion{
        if(amount-withdrawalAmount<=20000){
            throw new InsufficientFundsExpcetion();
        }
        return amount-withdrawalAmount;
    }
}
