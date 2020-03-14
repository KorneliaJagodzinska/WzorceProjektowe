package facade;

import facade.deliveryBox.DeliveryBoxFacade;

public class MainDeliveryBox {

    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();

    }
}
