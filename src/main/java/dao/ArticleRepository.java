package dao;

import model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Valsorya94 on 18.07.2017.
 */
@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {
}
