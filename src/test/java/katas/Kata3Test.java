package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Kata3Test
{

    @Test
    public void testExecute()
    {
        List<Integer> moviesList = Arrays.asList(70111470, 654356453, 65432445, 675465);
        Assert.assertThat(Kata3.execute(), equalTo(moviesList));
    }

    @Test
    public void testSize()
    {
        Assert.assertThat(Kata3.execute().size(), equalTo(4));
    }
}
