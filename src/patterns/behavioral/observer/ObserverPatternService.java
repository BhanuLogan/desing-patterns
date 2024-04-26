package patterns.behavioral.observer;

import commons.DesignPatternService;

public class ObserverPatternService implements DesignPatternService {

    private void testObserverPattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("OBSERVER DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");

        Product redmeNote15Pro = new Product("REDME NOTE 15 PRO");
        Product macBookM2Pro = new Product("MAC BOOK M2 PRO");

        ProductObservable redme = new ProductObservable(redmeNote15Pro);
        ProductObservable macBook = new ProductObservable(macBookM2Pro);

        Observer emailObserver = new EmailObserver(redmeNote15Pro);
        Observer smsMacBookObserver = new SmsObserver(macBookM2Pro);
        Observer smsRedmeObserver = new SmsObserver(redmeNote15Pro);

        redme.subscribe(emailObserver);
        redme.subscribe(smsRedmeObserver);
        
        macBook.subscribe(smsMacBookObserver);

        redme.addQuantity(2);
        redme.addQuantity(5);

        macBook.addQuantity(20);
        
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testObserverPattern();
    }
}
