public class RewardValue {
    
    double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return cashValue / 0.0035;
    }


}

