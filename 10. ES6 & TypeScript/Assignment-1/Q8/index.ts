export{}
class Account{
    id: any;
    name: any;
    balance: any;
    constructor(id, name, balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    totalBalance(){
        return this.balance;
    }
} 

class SavingAccount extends Account{
    constructor(id, name, balance, interest){
        super(id, name, balance = balance + (balance*interest)/100);
    }
}

class CurrentAccount extends Account{
    constructor(id, name, balance, cash_credit){
        super(id, name, balance = balance+cash_credit);
    }
}

let savingAccount = new SavingAccount(11717121, "Ayush Agrawal", 10000, 10);
let currentAccount = new CurrentAccount(11717122, "Ritik Dixit", 14000, 20);

console.log(savingAccount.totalBalance());
console.log(currentAccount.totalBalance());