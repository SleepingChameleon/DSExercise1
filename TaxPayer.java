public class TaxPayer {
    private int SocialNumber;
    private double GrossIncome;

    public TaxPayer(int SocialNumber, double GrossIncome){
        this.SocialNumber = SocialNumber;
        this.GrossIncome = GrossIncome;
    }
    public int getSocialNumber(){
        return SocialNumber;
    }
    public double getGrossIncome(){
        return GrossIncome;
    }
}

