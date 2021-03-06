package helper;


import model.Terrain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {

    private static Pattern pattern = Pattern.compile("(-?\\d+)+");
    private List<Integer> integerList = new ArrayList<>();

    /**
     * Метод формирует список натуральных числе из строки.
     * Разделителем являются любые символы, кроме чисел и знака минус.
     * Точки и запятые тоже являются разделителями, десятичные числа
     * возвращиются как два натуральных числа.
     *
     * @param string
     * @throws  NumberFormatException
     */
    public void setArray(String string) throws NumberFormatException {

        Matcher matcher = this.pattern.matcher(string);

        while (matcher.find() && this.integerList.size() < Terrain.getN() + 1) {
            String s = matcher.group();

            int i = Integer.parseInt(s);
            this.integerList.add(i);

            if (i > Terrain.getN() || i < 0 || this.integerList.size() > Terrain.getN()) {
                throw new NumberFormatException("Invalid input data!");
            }
        }
    }

    public int[] getArray() {
        return this.integerList.stream().mapToInt(x -> x).toArray();
    }
}

