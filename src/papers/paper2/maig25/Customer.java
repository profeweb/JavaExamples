package papers.paper2.maig25;

public class Customer {

    private String customerName;
    private String customerAddress;
    private int maximumBudget;

    public Customer (String customerName, String customerAddress, int maximumBudget){
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.maximumBudget= maximumBudget;
    }

    public int getMaximumBudget(){
        return maximumBudget;
    }

    // Altres getters i setters

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setMaximumBudget(int maximumBudget) {
        this.maximumBudget = maximumBudget;
    }

    public String toString(){
        return "Name:" + customerName + ", Address: " + customerAddress + ", Maximum Budget: "+ maximumBudget;
    }


}
