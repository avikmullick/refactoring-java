package com.sap.cc.videostore;

public class NewReleaseMovie extends Movie{

  public NewReleaseMovie(String title) {
    super(title);
  }

  @Override
  public double determineAmount(int daysRented) {
    double rentalAmount = 0;
    rentalAmount += daysRented * 3;
    return rentalAmount;
  }

  @Override
  public int determineFrequentRentalPoints(int daysRented) {
    // add frequent renter points
    int frequentRenterPoints = 1;
    // add bonus for a two day new release rental
    if (daysRented > 1) {
      frequentRenterPoints++;
    }
    return frequentRenterPoints;
  }
}
