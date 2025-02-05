package fr.eni.groupe8.enchere.bo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Article {

	private Integer noArticle;
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private LocalTime heureDebutEnchere;
	private LocalTime heureFinEnchere;
	private BigDecimal prixInitial;
	private BigDecimal prixVente;
	private boolean etatVente;
	private Utilisateur vendeur;
	private Categorie categorie;
	private BigDecimal meilleurPrix;
	private Utilisateur meilleurEncherisseur;

	public Article() {

	}

	public Article(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, LocalTime heureDebutEnchere, LocalTime heureFinEnchere, BigDecimal prixInitial,
			BigDecimal prixVente, Boolean etatVente, Utilisateur vendeur, Categorie categorie) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.heureDebutEnchere = heureDebutEnchere;
		this.heureFinEnchere = heureFinEnchere;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.vendeur = vendeur;
		this.categorie = categorie;
	}

	public Integer getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}

	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}

	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}

	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}

	public BigDecimal getPrixInitial() {
		return prixInitial;
	}

	public void setPrixInitial(BigDecimal prixInitial) {
		this.prixInitial = prixInitial;
	}

	public BigDecimal getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(BigDecimal prixVente) {
		this.prixVente = prixVente;
	}

	public Boolean getEtatVente() {
		return etatVente;
	}

	public void setEtatVente(boolean etatVente) {
		this.etatVente = etatVente;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Utilisateur getVendeur() {
		return vendeur;
	}

	public void setVendeur(Utilisateur vendeur) {
		this.vendeur = vendeur;
	}

	public LocalTime getHeureDebutEnchere() {
		return heureDebutEnchere;
	}

	public void setHeureDebutEnchere(LocalTime heureDebutEnchere) {
		this.heureDebutEnchere = heureDebutEnchere;
	}

	public LocalTime getHeureFinEnchere() {
		return heureFinEnchere;
	}

	public void setHeureFinEnchere(LocalTime heureFinEnchere) {
		this.heureFinEnchere = heureFinEnchere;
	}

	@Override
	public String toString() {
		return "Article [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres
				+ ", heureDebutEnchere=" + heureDebutEnchere + ", heureFinEnchere=" + heureFinEnchere + ", prixInitial="
				+ prixInitial + ", prixVente=" + prixVente + ", etatVente=" + etatVente + ", vendeur=" + vendeur
				+ ", categorie=" + categorie + "]";
	}

	public Article(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, BigDecimal prixInitial, BigDecimal prixVente, Boolean etatVente,
			Utilisateur vendeur, Categorie categorie) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.vendeur = vendeur;
		this.categorie = categorie;
	}

	public void addAttribute(String string, List<Categorie> listCategorie) {
		// TODO Auto-generated method stub

	}

	public BigDecimal getMeilleurPrix() {
		return meilleurPrix;
	}

	public void setMeilleurPrix(BigDecimal meilleurPrix) {
		this.meilleurPrix = meilleurPrix;
	}

	public Utilisateur getMeilleurEncherisseur() {
		return meilleurEncherisseur;
	}

	public void setMeilleurEncherisseur(Utilisateur meilleurEncherisseur) {
		this.meilleurEncherisseur = meilleurEncherisseur;
	}

}
