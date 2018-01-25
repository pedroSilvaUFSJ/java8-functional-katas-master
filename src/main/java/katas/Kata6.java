package katas;

import java.util.List;
import java.util.stream.Collectors;

import model.Movie;
import util.DataUtil;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6
{
    public static String execute()
    {
        List<Movie> movieList = DataUtil
                .getMovieLists()
                .stream()
                .flatMap(listMovie -> listMovie.getVideos().stream())
                .collect(Collectors.toList());

        return movieList.stream()
                .flatMap(t -> t.getBoxarts().stream())
                .reduce((x, y) -> x.getWidth() * x.getHeight() < y.getWidth() * y.getHeight() ? x : y).get().getUrl();
    }
}
