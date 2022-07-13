package cl.crisan.playground.named_qualifiers_2;

import javax.inject.Inject;
import java.math.BigDecimal;

public class Main {

    @Inject
    private @VisaPayment Payment payment;

    public Main() {}

    public void execute(BigDecimal monto) {
        payment.pay(monto);
    }
}
