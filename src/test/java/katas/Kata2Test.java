package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Kata2Test
{

    @Test
    public void testExecute()
    {
        List<Integer> moviesList = Arrays.asList();
        Assert.assertThat(Kata1.execute(), equalTo(moviesList));
    }

    @Test
    public void testSize()
    {
        List<Integer> moviesList = Arrays.asList();
        Assert.assertThat(Kata2.execute().size(), equalTo(2));
    }
}
