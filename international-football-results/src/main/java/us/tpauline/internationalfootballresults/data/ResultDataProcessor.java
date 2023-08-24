package us.tpauline.internationalfootballresults.data;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import us.tpauline.internationalfootballresults.model.Result;

public class ResultDataProcessor  implements ItemProcessor<ResultInput, Result> {

  private static final Logger log = LoggerFactory.getLogger(ResultDataProcessor.class);

  @Override
  public Result process(final ResultInput resultInput) throws Exception {
    Result result = new Result();

    result.setDate(LocalDate.parse(resultInput.getDate()));
    result.setHomeTeam(resultInput.getHome_team());
    result.setAwayTeam(resultInput.getAway_team());
    result.setHomeScore(Integer.parseInt(resultInput.getHome_score()));
    result.setAwayScore(Integer.parseInt(resultInput.getAway_score()));
    result.setTournament(resultInput.getTournament());
    result.setCity(resultInput.getCity());
    result.setCountry(resultInput.getCountry());
    result.setNeutral(Boolean.parseBoolean(resultInput.getNeutral()));

    // date,home_team,away_team,home_score,away_score,tournament,city,country,neutral

    return result;
  }

}