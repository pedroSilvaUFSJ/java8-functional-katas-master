package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableMap;

public class Kata8Test
{
    @Test
    public void testSize()
    {
        Assert.assertThat(Kata8.execute().size(), equalTo(3));
    }

    @Test
    public void testExecute()
    {
        List<ImmutableMap> esperado = null;

        ImmutableMap primeiro = ImmutableMap.of("videoId", 70111470, "bookmarkId", 470);
        esperado.add(primeiro);

        ImmutableMap segundo = ImmutableMap.of("videoId", 654356453, "bookmarkId", 453);
        esperado.add(segundo);

        ImmutableMap terceiro = ImmutableMap.of("videoId", 65432445, "bookmarkId", 445);
        esperado.add(terceiro);
        Assert.assertThat(Kata8.execute(), esperado);
    }

}
