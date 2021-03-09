package supporting;

import models.Article;

import java.util.Comparator;

public class ProductComparatorDecrease implements Comparator<Article> {

    @Override
    public int compare(Article o1, Article o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
