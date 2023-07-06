package com.sap.cc.videostore;

public class RegularMovie extends Movie{

  public RegularMovie(String title) {
    super(title);
  }

  @Override
  public double determineAmount(int daysRented) {
    double rentalAmount = 0;
    rentalAmount += 2;
    if (daysRented > 2)
      rentalAmount += (daysRented - 2) * 1.5;
    return rentalAmount;
  }

  @Override
  public int determineFrequentRentalPoints(int daysRented) {
    // add frequent renter points
    int frequentRenterPoints = 1;
    return frequentRenterPoints;
  }
}
