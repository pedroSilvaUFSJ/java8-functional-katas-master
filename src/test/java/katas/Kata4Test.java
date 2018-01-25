package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Kata4Test
{

    @Test
    public void testExecute()
    {
        List<ImmutableMap> moviesList = ImmutableList.of(
                ImmutableMap.of("id", 70111470, "title", "Die Hard", "url", "http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"),
                ImmutableMap.of("id", 654356453, "title", "Bad Boys", "url", "http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg"),
                ImmutableMap.of("id", 65432445, "title", "The Chamber", "url", "http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg"),
                ImmutableMap.of("id", 675465, "title", "Fracture", "url", "http://cdn-0.nflximg.com/images/2891/Fracture150.jpg"));
        Assert.assertThat(Kata4.execute(), equalTo(moviesList));
    }

    @Test
    public void testSize()
    {
        Assert.assertThat(Kata4.execute().size(), equalTo(4));
    }
}
