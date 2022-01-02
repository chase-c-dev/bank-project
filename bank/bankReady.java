package bank;

public class bankReady {

    private int cbalance; //variable for checking account balance
    private int sbalance; //variable for savings account balance
    private String CheckingaccName; //holds checking account name
    private String SavingaccName; //holds savings account name

    public bankReady(int cbalance, int sbalance, String CheckingaccName, String SavingaccName) {
        this.cbalance = cbalance; //initializes checking account balance variable
        this.sbalance = sbalance; //initializes savings account balance variable
        this.CheckingaccName = CheckingaccName; //initializes account name
        this.SavingaccName = SavingaccName;
    }

    public int getCbalance() { //getter for cbalance
        return cbalance;
    }
    public void setCbalance(int cbalance) { //setter for cbalance
        this.cbalance = cbalance;
    }

    public int getSbalance() { //getter for sbalance
        return sbalance;
    }
    public void setSbalance(int sbalance) { //setter for sbalance
        this.sbalance = sbalance;
    }

    public String getCheckaccName() { //getter for checking account name
        return CheckingaccName;
    }
    public void setCheckingaccName(String CheckingaccName) { //setter for checking account name
        this.CheckingaccName = CheckingaccName;
    }

    public String getSavingaccName() { //getter for savings account name
        return SavingaccName;
    }
    public void SavingaccName(String SavingaccName) { //setter for savings account name
        this.SavingaccName = SavingaccName;
    }



}
