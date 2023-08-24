package us.tpauline.internationalfootballresults.model;

import java.time.LocalDate;

public class Result {
    private LocalDate date;
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private String tournament;
    private String city;
    private String country;
    private boolean neutral;
    
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getHomeTeam() {
        return homeTeam;
    }
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }
    public String getAwayTeam() {
        return awayTeam;
    }
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
    public int getHomeScore() {
        return homeScore;
    }
    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }
    public int getAwayScore() {
        return awayScore;
    }
    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }
    public String getTournament() {
        return tournament;
    }
    public void setTournament(String tournament) {
        this.tournament = tournament;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public boolean isNeutral() {
        return neutral;
    }
    public void setNeutral(boolean neutral) {
        this.neutral = neutral;
    }

    
}
