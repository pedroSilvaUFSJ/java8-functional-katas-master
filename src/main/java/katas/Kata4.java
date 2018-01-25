package katas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableMap;

import util.DataUtil;

/*
    Goal: Retrieve id, title, and a 150x200 box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
*/
public class Kata4
{
    public static List<Map> execute()
    {
        return DataUtil.getMovieLists()
                .stream()
                .flatMap(movie -> movie.getVideos().stream())
                .map(movie -> ImmutableMap.of(
                        "id", movie.getId(),
                        "title", movie.getTitle(),
                        "url", movie.getBoxarts().stream().filter(item -> (item.getHeight().equals(200) && item.getWidth().equals(150)))
                                .findAny().get().getUrl()))
                .collect(Collectors.toList());
    }
}
