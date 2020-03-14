package facade.example2;

import facade.example2.bank.AtmMachineFacade;

public class MainBank {
    public static void main(String[] args) {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();

    }
}
