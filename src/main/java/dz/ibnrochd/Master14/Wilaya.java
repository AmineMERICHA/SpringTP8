package dz.ibnrochd.Master14;
import java.sql.Date;

	public class Wilaya {
		private int id;
		private boolean actif;
		private int compte_creation;
		private int compte_maj;
		private Date date_creation;
		private Date date_maj;
		private String nom_arabe;
		private String nom_latin;
		private String nom_tamazight;
		
		public Wilaya(int id, boolean actif, int compte_creation, int compte_maj, Date date_creation, Date date_maj,
				String nom_arabe, String nom_latin, String nom_tamazight) {
			super();
			this.id = id;
			this.actif = actif;
			this.compte_creation = compte_creation;
			this.compte_maj = compte_maj;
			this.date_creation = date_creation;
			this.date_maj = date_maj;
			this.nom_arabe = nom_arabe;
			this.nom_latin = nom_latin;
			this.nom_tamazight = nom_tamazight;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public boolean isActif() {
			return actif;
		}
		public void setActif(boolean actif) {
			this.actif = actif;
		}
		public int getCompte_creation() {
			return compte_creation;
		}
		public void setCompte_creation(int compte_creation) {
			this.compte_creation = compte_creation;
		}
		public int getCompte_maj() {
			return compte_maj;
		}
		public void setCompte_maj(int compte_maj) {
			this.compte_maj = compte_maj;
		}
		public Date getDate_creation() {
			return date_creation;
		}
		public void setDate_creation(Date date_creation) {
			this.date_creation = date_creation;
		}
		public Date getDate_maj() {
			return date_maj;
		}
		public void setDate_maj(Date date_maj) {
			this.date_maj = date_maj;
		}
		public String getNom_arabe() {
			return nom_arabe;
		}
		public void setNom_arabe(String nom_arabe) {
			this.nom_arabe = nom_arabe;
		}
		public String getNom_latin() {
			return nom_latin;
		}
		public void setNom_latin(String nom_latin) {
			this.nom_latin = nom_latin;
		}
		public String getNom_tamazight() {
			return nom_tamazight;
		}
		public void setNom_tamazight(String nom_tamazight) {
			this.nom_tamazight = nom_tamazight;
		}
		
	}
		
		
		
		
		