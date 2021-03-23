package supporting;

import models.Article;

import java.util.Comparator;

public class ProductComparatorIncrease implements Comparator<Article> {

    @Override
    public int compare(Article o1, Article o2) {
        return o1.getPrice() - o2.getPrice();
    }

}
