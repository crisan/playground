package cl.crisan.playground.named_qualifiers_1;

import javax.inject.Named;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named("cash")
public class CashPayment implements Payment {

    private static final Logger LOGGER = Logger.getLogger(CashPayment.class.toString());

    @Override
    public void pay(BigDecimal amount) {
        LOGGER.log(Level.INFO, "payed {0} cash", amount.toString());
    }
}
