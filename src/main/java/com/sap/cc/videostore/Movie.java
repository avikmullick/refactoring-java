package com.sap.cc.videostore;

public abstract class Movie {
  private String title;

  public Movie(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  /**
   * Calculate rentalAmount
   *
   * @param daysRented
   * @return
   */
  public abstract double determineAmount(int daysRented);

  /**
   * determineFrequentRentalPoints
   *
   * @param daysRented
   * @return
   */
  public abstract int determineFrequentRentalPoints(int daysRented);
}
