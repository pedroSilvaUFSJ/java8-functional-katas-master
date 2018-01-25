package katas;

import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class Kata9Test
{

    @Test
    public void testSize()
    {
        Assert.assertEquals(4, Kata9.execute().size());
    }

    @Test

    public void testExecute()
    {
        List<ImmutableMap> x = null;
        x.add(ImmutableMap.of("id", 70111470, "title", "Die Hard", "time", Optional.of("Wed Jan 24 16:50:52 BRST 2018"), "url", "http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"));
        x.add(ImmutableMap.of("id", 654356453, "title", "Bad Boys", "time", Optional.of("Wed Jan 24 16:50:52 BRST 2018"), "url", "http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg"));
        x.add(ImmutableMap.of("id", 65432445, "title", "The Chamber", "time", Optional.of("Wed Jan 24 16:50:52 BRST 2018"), "url", "http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg"));
        x.add(ImmutableMap.of("id", 675465, "title", "Fracture", "time", Optional.of("Wed Jan 24 16:50:52 BRST 2018"), "url", "http://cdn-0.nflximg.com/images/2891/Fracture200.jpg"));

        Assert.assertEquals(x, Kata9.execute());
    }
}
