package homeworks.homework1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (Integer i : source) {
            if (i > treshold) {
                result.add(i);
                count++;
                logger.log("Элемент " + i + " проходит");
            }
            else logger.log("Элемент " + i + " не проходит");
        }
        logger.log("Прошло фильтр " + count + " элемента из " + source.size());
        return result;
    }
}
