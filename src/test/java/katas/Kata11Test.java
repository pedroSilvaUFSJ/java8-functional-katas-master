package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Kata11Test
{

    @Test
    public void testSize()
    {
        Assert.assertThat(Kata11.execute().size(), equalTo(2));
    }

    @Test
    public void testExecute()
    {
        ImmutableList x = ImmutableList.of(
                ImmutableMap.of("name", "New Releases", "videos",
                        ImmutableList.of(
                                ImmutableMap.of("id", 65432445, "title", "The Chamber", "time", ImmutableList.of(32432, 3534543, 645243, 984934), "boxarts", ImmutableList.of()),
                                ImmutableMap.of("id", 675465, "title", "Fracture", "time", ImmutableList.of(32432, 3534543, 645243, 984934), "boxarts", ImmutableList.of()))),
                ImmutableMap.of("name", "Thrillers", "videos",
                        ImmutableList.of(
                                ImmutableMap.of("id", 70111470, "title", "Die Hard", "time", ImmutableList.of(32432, 3534543, 645243, 984934), "boxarts", ImmutableList.of()),
                                ImmutableMap.of("id", 654356453, "title", "Bad Boys", "time", ImmutableList.of(32432, 3534543, 645243, 984934), "boxarts", ImmutableList.of()))));
        Assert.assertEquals(x, Kata11.execute());
    }
}
