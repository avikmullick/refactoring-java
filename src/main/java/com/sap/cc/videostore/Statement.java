package com.sap.cc.videostore;

import java.util.ArrayList;
import java.util.List;

class Statement {
  private String _name;

  private List<Rental> _rentals = new ArrayList<>();

  private double totalAmount;

  private int frequentRenterPoints;

  public Statement(String name) {
    _name = name;
  }

  public void addRental(Rental arg) {
    _rentals.add(arg);
  }

  public String getName() {
    return _name;
  }

  /**
   * Initialize variable
   */
  private void clearTotals() {
    totalAmount = 0;
    frequentRenterPoints = 0;
  }

  /**
   * Header Section of statement text for a customer
   */
  private String header() {
    clearTotals();
    String statementTextHeader = "Rental Record for " + getName() + "\n";
    return statementTextHeader;
  }

  /**
   *
   */
  private String footer() {
    String statementTextFooter = "";
    //add footer lines
    statementTextFooter += "Amount owed is " + String.valueOf(totalAmount) + "\n";
    statementTextFooter += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
    return statementTextFooter;
  }

  /**
   * Core Logic of statement text for a customer
   */
  private String rentalLines() {
    String statementTextRentalLines = "";
    for (Rental rental : _rentals) {
      statementTextRentalLines += rentalLine(rental);
    }
    return statementTextRentalLines;
  }

  /**
   * For loop Core Logic
   *
   * @param rental
   * @return
   */
  private String rentalLine(Rental rental) {
    double rentalAmount = rental.determineAmount();
    frequentRenterPoints += rental.determineFrequentRentalPoints();
    totalAmount += rentalAmount;
    return formatRentalLine(rental, rentalAmount);
  }

  private String formatRentalLine(Rental rental, double rentalAmount) {
    //show figures for this rental
    String statementTextRentalLine = "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rentalAmount) + "\n";
    return statementTextRentalLine;
  }

  public String generate() {
    String statementText;
    statementText = header();
    statementText = statementText + rentalLines();
    statementText += footer();
    return statementText;
  }
}
