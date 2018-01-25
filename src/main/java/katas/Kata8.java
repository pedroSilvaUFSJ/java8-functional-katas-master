
package katas;

import java.util.List;
import java.util.stream.Collectors;

import com.codepoetics.protonpack.StreamUtils;
import com.google.common.collect.ImmutableMap;

import util.DataUtil;

/*
    Goal: Combine videos and bookmarks by index (StreamUtils.zip) (https://github.com/poetix/protonpack)
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("videoId", "5", "bookmarkId", "3")
*/
public class Kata8
{
    @SuppressWarnings (
    { "unchecked", "rawtypes" })
    public static List<ImmutableMap> execute()
    {
        List<Integer> listMovies = DataUtil.getMovies().stream().map(m -> m.getId()).collect(Collectors.toList());
        List<Integer> listBookmarks = DataUtil.getBookMarks().stream().map(m -> m.getId()).collect(Collectors.toList());
        return StreamUtils
                .zip(listMovies.stream(), listBookmarks.stream(), (a, b) -> ImmutableMap.of("videoId", a, "bookmarkId", b)).collect(Collectors.toList());
    }
}
