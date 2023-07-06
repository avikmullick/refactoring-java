package com.sap.cc.videostore;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

  /**
   * determineAmount
   * @return
   */
  public double determineAmount(){
    return movie.determineAmount(daysRented);
  }

  /**
   * determineFrequentRentalPoints
   * @return
   */
  public int determineFrequentRentalPoints(){
    return movie.determineFrequentRentalPoints(daysRented);
  }
}