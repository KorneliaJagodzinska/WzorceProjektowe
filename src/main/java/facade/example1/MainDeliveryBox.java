package facade.example1;

import facade.example1.deliveryBox.DeliveryBoxFacade;

public class MainDeliveryBox {

    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();

    }
}
