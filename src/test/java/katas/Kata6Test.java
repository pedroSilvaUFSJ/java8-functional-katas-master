package katas;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

public class Kata6Test
{

    @Test
    public void testExecute()
    {
        Assert.assertThat(Kata6.execute(), equalTo("http://cdn-0.nflximg.com/images/2891/Fracture150.jpg"));
    }
}
