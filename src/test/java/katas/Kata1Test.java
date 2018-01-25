package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Kata1Test
{
    @Test
    public void testExecute()
    {
        List<ImmutableMap> moviesList = ImmutableList.of(
                ImmutableMap.of("id", 70111470, "title", "Die Hard"),
                ImmutableMap.of("id", 654356453, "title", "Bad Boys"),
                ImmutableMap.of("id", 65432445, "title", "The Chamber"),
                ImmutableMap.of("id", 675465, "title", "Fracture"));
        Assert.assertThat(Kata1.execute(), equalTo(moviesList));
    }

    @Test
    public void testeSize()
    {
        Assert.assertThat(Kata1.execute().size(), equalTo(4));
    }
}
