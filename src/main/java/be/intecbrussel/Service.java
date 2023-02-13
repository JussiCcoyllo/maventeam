package be.intecbrussel;

import java.util.List;

public class Service {

    private Customer currentCustomer;
    private List<Customer> customerList;

    public void withdrawMoney(int amount, int pinCode){

    }
    public void depositMoney(int amount, int pinCode){

    }

    public void selectInfoCustomer(int cardNumber){

    }

    private boolean checkBalance(int amount){
        return currentCustomer.getBalance() >= amount;
    }

    private boolean checkPinCode(int pinCode){
        return currentCustomer.getPinCode()==pinCode;
    }

    private void updateBalance(double newBalance){
        currentCustomer.setBalance(newBalance);
    }

}
