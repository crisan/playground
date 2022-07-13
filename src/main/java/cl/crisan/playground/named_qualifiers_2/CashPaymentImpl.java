package cl.crisan.playground.named_qualifiers_2;

import java.math.BigDecimal;

@CashPayment
public class CashPaymentImpl implements Payment{
    @Override
    public void pay(BigDecimal amount) {

    }
}
