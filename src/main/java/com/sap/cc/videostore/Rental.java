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
   * determineFrequentRenterPoints
   * @return
   */
  public int determineFrequentRentalPoints(){
    return movie.determineFrequentRenterPoints(daysRented);
  }
}