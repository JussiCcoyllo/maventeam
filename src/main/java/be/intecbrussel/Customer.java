package be.intecbrussel;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@With
@Builder

public class Customer {
    private String name;
    private long cardNumber;
    private double balance;
    private int pinCode;

}
