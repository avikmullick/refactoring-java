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
   * determineFrequentRenterPoints
   *
   * @param daysRented
   * @return
   */
  public abstract int determineFrequentRenterPoints(int daysRented);
}
