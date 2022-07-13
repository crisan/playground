package cl.crisan.playground.named_qualifiers_2;

import javax.inject.Named;
import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface VisaPayment {}
