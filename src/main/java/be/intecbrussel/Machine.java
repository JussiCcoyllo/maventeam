package be.intecbrussel;

public class Machine {
    public static void main(String[] args) {

        Service service=new Service();

        service.selectInfoCustomer(3244555557L);
        System.out.println(service.getCurrentCustomer());

        if(service.checkPinCode(2234)){
            service.depositMoney(1000);

            if(service.withdrawMoney(500)){
                System.out.println(service.getCurrentCustomer());
            }
        }
    }
}
