package us.tpauline.internationalfootballresults;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternationalFootballResultsApplication {
	// date,home_team,away_team,home_score,away_score,tournament,city,country,neutral

	public static void main(String[] args) {
		SpringApplication.run(InternationalFootballResultsApplication.class, args);
	}

}
