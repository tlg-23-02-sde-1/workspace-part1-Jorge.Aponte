/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package gov.irs;

/**
 * An argument can be made that the tax rate constants are better defined
 * on the classes that use them, and not all lumped in here.
 * <p>
 * We've decided that, since these are federally mandated tax rates, they
 * are better left here.  This bends cohesion a bit, but strengthens open-closed:
 * If the IRS were to change tax rates, we would only need to change that here.
 */
public interface TaxPayer {
    // all of these fields are automatically "public static final" due to this being an interface class
    double HOURLY_TAX_RATE = 0.25;
    double SALARIED_TAX_RATE = 0.30;
    double DEFAULT_STANDARD_DEDUCTION = 7500.00;

    public void payTaxes();

    default public double getStandardDeduction() {
        return DEFAULT_STANDARD_DEDUCTION;
    }

    default public void fileReturn() {
        System.out.println("Return file by US Mail");
    }
}