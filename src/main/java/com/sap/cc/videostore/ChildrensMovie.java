package com.sap.cc.videostore;

public class ChildrensMovie extends Movie{

  public ChildrensMovie(String title) {
    super(title);
  }

  @Override
  public double determineAmount(int daysRented) {
    double rentalAmount = 0;
    rentalAmount += 1.5;
    if (daysRented > 3)
      rentalAmount += (daysRented - 3) * 1.5;
    return rentalAmount;
  }

  @Override
  public int determineFrequentRenterPoints(int daysRented) {
    // add frequent renter points
    int frequentRenterPoints = 1;
    return frequentRenterPoints;
  }
}
