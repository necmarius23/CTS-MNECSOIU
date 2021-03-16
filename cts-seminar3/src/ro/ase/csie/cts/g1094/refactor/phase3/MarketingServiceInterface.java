package ro.ase.csie.cts.g1094.refactor.phase3;

public interface MarketingServiceInterface {

    static final int MAX_AGE_ACCOUNT = 10;
    static final float MAX_FIDELITY_DISCOUNT = 0.15f;

    float getFidelityDiscount(int accountAge);
}
