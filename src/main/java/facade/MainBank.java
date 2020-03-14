package facade;

import facade.bank.AtmMachineFacade;

public class MainBank {
    public static void main(String[] args) {

        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();

    }
}
