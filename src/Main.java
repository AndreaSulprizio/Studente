public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Andrea");
            studente1.addGrade(90);
            studente1.addGrade(85);
            studente1.addGrade(95);

        Studente studente2 = new Studente("Mario");
            studente2.addGrade(80);
            studente2.addGrade(75);
            studente2.addGrade(88);
        double averageGrade1 = studente1.getAverageGrade();
        double averageGrade2 = studente2.getAverageGrade();

        System.out.println(studente1.nome + "\t voto medio: " + averageGrade1);
        System.out.println(studente2.nome + "\t voto medio: " + averageGrade2);

        if (averageGrade1 > averageGrade2) {
            System.out.println(studente1.nome + " ha un voto medio più alto.");
        } else if (averageGrade1 < averageGrade2) {
            System.out.println(studente2.nome + " ha un voto medio più alto.");
        } else {
            System.out.println("Entrambi gli studenti hanno lo stesso voto medio");
        }
    }
}





