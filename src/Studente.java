import java.util.ArrayList;
import java.util.List;

public class Studente {
    String nome;
    List<Integer> voti = new ArrayList<>();

    public Studente(String nome) {
        this.nome = nome;
        this.voti = new ArrayList<>();
    }

    public void addGrade(int grade) {
        voti.add(grade);
    }

    public double getAverageGrade() {
        if (voti.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : voti) {
            sum += grade;
        }
        return (double) sum / voti.size();
    }
}
