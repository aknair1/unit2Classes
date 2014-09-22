


public class VendingMachine
{
   private int canNumber;
   private int tokenNumber;
    public VendingMachine(int cans)
    {
        this.canNumber = cans;
        this.tokenNumber = 0;
    }
    public void insertToken()
    {
        this.canNumber = this.canNumber - 1;
        this.tokenNumber = this.tokenNumber + 1;
    }
    public void addCans(int cans)
    {
        this.canNumber = this.canNumber + cans;
    }
    public void withdrawTokens(int tokens)
    {
        this.tokenNumber = this.tokenNumber - 1;
    }
    public int getTokens()
    {
       return this.tokenNumber;
    }
    public int getCans()
    {
       return this.canNumber;
    }

    

}
