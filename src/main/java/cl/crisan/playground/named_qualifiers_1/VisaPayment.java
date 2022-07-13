package cl.crisan.playground.named_qualifiers_1;

import javax.inject.Named;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

@Named("visa")
public class VisaPayment implements Payment {

    private final static Logger LOGGER = Logger.getLogger(VisaPayment.class.toString());

    @Override
    public void pay(BigDecimal amount) {
        LOGGER.log(Level.INFO, "payed {0} with visa", amount.toString());
    }
}
