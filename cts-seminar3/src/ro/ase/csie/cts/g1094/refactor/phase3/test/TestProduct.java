package ro.ase.csie.cts.g1094.refactor.phase3.test;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.services.Marketing2021Strategy;
import ro.ase.csie.cts.g1094.refactor.phase3.Product;
import ro.ase.csie.cts.g1094.refactor.phase3.ProductType;

public class TestProduct {
    public static void main(String[] args){
        Product product = new Product(new Marketing2021Strategy());
        try {
            product.computePriceWithDiscount(ProductType.DISCOUNTED,100,5);
        } catch (InvalidPriceException e) {
            e.printStackTrace();
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }

    }

}
