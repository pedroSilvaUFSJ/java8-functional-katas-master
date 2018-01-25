package katas;

import java.util.List;
import java.util.stream.Collectors;

import util.DataUtil;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5
{
    public static Double execute()
    {
        List<Double> lista = DataUtil.getMovies().stream().map(movie -> movie.getRating()).collect(Collectors.toList());
        return lista.stream().reduce(Double.MIN_VALUE, (a, b) -> Double.max(a, b));
    }
}
