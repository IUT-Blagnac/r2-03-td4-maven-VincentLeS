/**
 * Ceci est une classe de test qui ne fait pas grand chose
 * @author JMB
 * @author LC
 */
class HelloJava {
    public static void main(String[] args) {
		System.out.println("Hello Blagnac");
	}

	public static void afficherCancan(){

	}

	
    /**
     * @param diametre
     *      Le diametre du disque (nombre positif).
     * @return la surface du disque
     */
    public static double surfaceDisque(double diametre) {
        double pi, rayon, surface;
        // Endroit pour transcrire l'algorithme en Java
        pi = 3.14;
        rayon = diametre / 2;
        surface = (rayon * rayon) * pi ;
        return surface;
    }

        /**
     * @param longueur
     *      La longueur du rectangle (nombre positif).
     * @param largeur
     *      La largeur du rectangle (nombre positif, inférieur ou égal à la longueur).
     * @return la surface du rectangle
     */
    public static double surfaceRectangle(double longueur, double largeur) {
        double surface;
        // Endroit pour transcrire l'algorithme en Java
        surface = longueur * largeur;
        return surface;
    }
    
        /**
     * @param cote
     *      La longueur d'un cote du carré (nombre positif).
     * @return la surface du carré
     */
    public static double surfaceCarre(double cote) {
        double surface;
        surface = surfaceRectangle(cote, cote);
        return surface;
    }
    
        /**
     * Surface du gazon, en m2. Toutes les données sont en m.
     * Terrain, maison, appenti et piscine s'organisent comme vu en TD.
     */
    public static double surfaceGazon(double longueurTerrain, double largeurTerrain,
    double diametrePiscine, double longueurMaison, double largeurMaison, double longueurAppenti) {
        double surfaceHerbe, surfaceTerrain, surfaceMaison, surfacePiscine, surfaceAppenti;

        /* déclaration des variables de travail */
        // à vous !
        surfaceTerrain = surfaceRectangle(longueurTerrain, largeurTerrain);
        surfaceMaison = surfaceRectangle(longueurMaison, largeurMaison);
        surfaceAppenti = surfaceRectangle(largeurMaison, longueurAppenti) / 2;
        surfacePiscine = surfaceDisque(diametrePiscine);
        
        /* calcul de la surface à tondre */
        // à vous !

        surfaceHerbe = surfaceTerrain - surfaceMaison - surfaceAppenti - surfacePiscine;
        
        return surfaceHerbe;
    }
    
        /**
     * Affiche les informations sur la tonte du gazon. Toutes les données sont en m.
     */
    public static void informationTonte(double longueurTerrain, double largeurTerrain,
    double diametrePiscine, double longueurMaison, double largeurMaison, double longueurAppenti) {
        /* déclaration des variables de travail */
        // à vous !
        double surface, vitesse, duree;
        /* Calcul */
        // à vous !
        vitesse = 100;
        surface = surfaceGazon(longueurTerrain, largeurTerrain,
        diametrePiscine, longueurMaison, largeurMaison, longueurAppenti);
        duree = surface / vitesse;
        /* Affichage */
        // à vous !
        System.out.println("Il y a "+surface+" m2 à tondre.");
        System.out.println("Cela va prendre "+duree+" heures.");
        
    }
    
}
