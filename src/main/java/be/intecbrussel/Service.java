package be.intecbrussel;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class Service {

    private Customer currentCustomer;

    private Map<Long, Customer> customerList;

    public boolean withdrawMoney(int amount) {

        if (this.currentCustomer == null) {
            return false;
        }
        if (!this.checkBalance(amount)) {
            return false;
        }

        this.removeBalance(amount);
        return true;
    }

    public void depositMoney(int amount) {
        if (this.currentCustomer != null) {
            this.addBalance(amount);
        }
    }

    public boolean selectInfoCustomer(long cardNumber) {
        boolean customerFound = false;

        if (this.customerList.containsKey(cardNumber)) {
            this.currentCustomer = this.customerList.get(cardNumber);
            customerFound = true;
        }

        return customerFound;
    }

    private boolean checkBalance(int amount) {
        if (this.currentCustomer == null) {
            return false;
        }
        return currentCustomer.getBalance() >= amount;
    }

    public boolean checkPinCode(int pinCode) {
        if (this.currentCustomer == null) {
            return false;
        }
        return currentCustomer.getPinCode() == pinCode;
    }


    private void addBalance(double amount) {
        currentCustomer.setBalance(currentCustomer.getBalance() + amount);
    }

    private void removeBalance(double amount) {
        currentCustomer.setBalance(currentCustomer.getBalance() - amount);
    }

    public Customer getCurrentCustomer() {
        return new Customer(this.currentCustomer.getName(), this.currentCustomer.getCardNumber(), this.currentCustomer.getBalance(), this.currentCustomer.getPinCode());
    }

    public Service() {
        Faker faker = new Faker();

        this.customerList = new HashMap<>();
        this.customerList.put(3244555557L, new Customer(faker.name().firstName(), 3244555557L, 20000, 2234));
        this.customerList.put(4566677857L, new Customer(faker.name().firstName(), 4566677857L, 10000, 2367));

    }
}
