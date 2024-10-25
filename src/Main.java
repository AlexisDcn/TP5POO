
class Main {
  public static void main(String[] args) {
    System.out.println("Route et vehicules");
    // Vehicule v1 = new Vehicule(Marque.Renault, "123AB81");
    // Vehicule v2 = new Vehicule(Marque.Citroen, "1642BZ1", 140);

    // System.out.println(v1);
    // System.out.println(v2);
    
    // v1.accelerer(20);
    // v2.accelerer(100);

    // System.out.println(v1);
    // System.out.println(v2);

    // v1.freiner(30); 
    // v2.freiner(50);

    // System.out.println(v1);
    // System.out.println(v2);

    Voiture vt1 = new Voiture(Marque.Renault, "123AB81", 190, Modele.BERLINE, "Verte", 5);
    System.out.println(vt1);

    Voiture vt2 = new Voiture(Marque.Citroen, "1642BZ18", 140, Modele.BREAK);
    vt2.accelerer(100);
    System.out.println(vt2);
  }
}