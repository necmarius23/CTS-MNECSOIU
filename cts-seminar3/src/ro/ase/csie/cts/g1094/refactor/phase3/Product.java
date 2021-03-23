package ro.ase.csie.cts.g1094.refactor.phase3;


import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.services.MarketingServiceInterface;

public class Product {


    MarketingServiceInterface marketingServiceInterface;

    public Product(MarketingServiceInterface marketingService){
        if(marketingService == null){
            throw new NullPointerException();
        }
        this.marketingServiceInterface = marketingService;
    }

    //optional - based on design specs


    public void setMarketingServiceInterface(MarketingServiceInterface marketingServiceInterface) {
        if(marketingServiceInterface == null){
            throw new NullPointerException();
        }
        this.marketingServiceInterface = marketingServiceInterface;
    }

    public static float getDiscountValue(float price, float discount)
    {
        return discount * price;
    }

    private static float getPriceWithDiscountAndFidelity(
            float price, float discountValue, float fidelityDiscount)
    {
        return (price - discountValue) * (1 - fidelityDiscount);
    }


    
    private static float getFinalPrice(
            float price, float fidelityDiscount, ProductType type)
    {
        float discountValue = getDiscountValue(price, type.getDiscount());
        float finalPrice = getPriceWithDiscountAndFidelity(price, discountValue, fidelityDiscount);
        return finalPrice;
    }

    public float computePriceWithDiscount(ProductType productType, float price, int accountAge) throws InvalidPriceException, InvalidAgeException
    {

        if (price <=0)
        {
            throw new InvalidPriceException();
        }
        if (accountAge <0)
        {
            throw new InvalidAgeException();
        }

        float fidelityDiscount =
                (productType == ProductType.NEW)? 0 : marketingServiceInterface.getFidelityDiscount(accountAge);

        float finalPrice = getFinalPrice(price, fidelityDiscount, productType);


        return finalPrice;
    }
}