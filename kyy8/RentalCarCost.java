package org.Codewars.kyy8;

public class RentalCarCost {
    public static int rentalCarCost(int d) {
        return d >= 7 ? (d * 40) - 50 : d >= 3 ? (d * 40) - 20 : d * 40;
    }
}
