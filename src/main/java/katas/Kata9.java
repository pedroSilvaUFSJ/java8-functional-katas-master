package katas;

import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableMap;

import model.BoxArt;
import model.Movie;
import util.DataUtil;

/*
    Goal: Retrieve each video's id, title, middle interesting moment time, and smallest box art url
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl")
*/
public class Kata9
{
    public static List<ImmutableMap> execute()
    {
        List<Movie> movieLists = DataUtil.getMovies();
        return movieLists
                .stream()
                .map(m -> ImmutableMap.of(
                        "id", m.getId(),
                        "title", m.getTitle(),
                        "time", m.getInterestingMoments()
                                .stream()
                                .filter(date -> "Middle".equals(date.getType()))
                                .map(p -> p.getTime()).findFirst(),
                        "url", m.getBoxarts()
                                .stream()
                                .reduce((box1, box2) -> box1.getWidth() * box1.getHeight() < box2.getWidth() * box2.getHeight() ? box1 : box2)
                                .map(BoxArt::getUrl)))
                .collect(Collectors.toList());
    }
}
