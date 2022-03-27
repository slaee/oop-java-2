import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

public class MyBankAccountFile {
    private int accountNumber;
    private double beginningBalance;
    private double totalCharges;
    private double totalCredits;
    private double creditLimit;
    private double balance;

    public MyBankAccountFile() {
    }

    public MyBankAccountFile(int accountNumber, double beginningBalance, double totalCharges, double totalCredits,
            double creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBeginningBalance(double beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    public double getBeginningBalance() {
        return beginningBalance;
    }

    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }

    public double getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCredits(double totalCredits) {
        this.totalCredits = totalCredits;
    }

    public double getTotalCredits() {
        return totalCredits;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getBalance(){
        return balance;
    }

    public void calculateBalance() {
        balance = beginningBalance + totalCharges - totalCredits;
    }
    
    public JsonNode toJSONNode() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode accountNode = mapper.createObjectNode();

        accountNode.put("accountNumber", accountNumber);
        accountNode.put("beginningBalance", beginningBalance);
        accountNode.put("totalCharges", totalCharges);
        accountNode.put("totalCredits", totalCredits);
        accountNode.put("creditLimit", creditLimit);
        accountNode.put("balance", balance);

        return accountNode;
    }

    public JsonNode toJSONFINALNode(){
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode accountNode = mapper.createObjectNode();

        accountNode.put("accountNumber", accountNumber);
        accountNode.put("beginningBalance", beginningBalance);
        accountNode.put("totalCharges", totalCharges);
        accountNode.put("totalCredits", totalCredits);
        accountNode.put("creditLimit", creditLimit);
        accountNode.put("balance", balance);

        return accountNode;
    }
    
    public String toString(){
        return "\nAccount Number: " + accountNumber + "\n" +
                "Credit Limit: " + creditLimit + "\n" +
                "Balance: " + balance + "\n"+
                "Credit Limit Exceeded!";
    }
}