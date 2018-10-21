package defaultPackage;


class Salary {
    enum Type{dollar, euro, pound, ruble, yen, yuan, roupy, gold, silver, bronze, mmm}
    private Type Currency;
    private double amount;

    Salary(){
        Currency = Type.ruble;
        amount = 0;
    }
    Salary(Type cur, double am){
        Currency = cur;
    }

    Type getCurrency(){
        return Currency;
    }

    double getAmount(){
        return amount;
    }
}
