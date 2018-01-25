package katas;

import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;

import model.BoxArt;
import model.Movie;
import util.DataUtil;

/*
    Goal: Retrieve the id, title, and smallest box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
*/
public class Kata7
{
    public static List<ImmutableList<? extends Object>> execute()
    {
        List<Movie> movieList = DataUtil
                .getMovieLists()
                .stream()
                .flatMap(listMovie -> listMovie.getVideos().stream())
                .collect(Collectors.toList());

        return movieList.stream()
                .map(movies -> ImmutableList.of("id", movies.getId(), "title", movies.getTitle(), "boxart", movies.getBoxarts().stream()
                        .reduce((BoxArt b1, BoxArt b2) -> b1.getHeight() * b1.getWidth() < b1.getHeight() * b1.getWidth() ? b1 : b2).get().getUrl()))
                .collect(Collectors.toList());
    }
}
