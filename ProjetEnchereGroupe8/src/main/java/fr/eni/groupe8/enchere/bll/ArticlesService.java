package fr.eni.groupe8.enchere.bll;

import java.util.List;

import fr.eni.groupe8.enchere.bo.Article;
import fr.eni.groupe8.enchere.bo.Utilisateur;
import jakarta.validation.Valid;

public interface ArticlesService { // Interface de service pour la gestion des articles.

	List<Article> findAllArticles();

	void ajouterArticle(Article article);

	Article articleById(Integer noArticle);

	void encherir(Article noArticle, Utilisateur utilisateur);

	// Article encherir();

}
