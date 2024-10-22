import java.util.Arrays;

public class StudentsNotes {
    public float[] notes;

    public StudentsNotes(int maxStudent) {

        notes = new float[maxStudent];
    }

    public void trierAfficherNote() {
        Arrays.sort(notes);
        for (int i = 0; i < notes.length; i++) {
            System.out.println("La note " + (i + 1) + " est : " + notes[i]);
        }
    }

    public float noteMoyenne() {
        float sum = 0;
        for (int i = 0; i < notes.length; i++) {
            sum += notes[i];
        }
        return sum / notes.length;
    }
    public void minAndMaxRating() {
        float maxRating = notes[0];
        float minRating = notes[0];
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > maxRating) {
                maxRating = notes[i];
            }
        }
        System.out.println("La note maximal est : " + maxRating);

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < minRating) {
                minRating = notes[i];
            }
        }
        System.out.println("La note minimal est : " + minRating);
    }

    public int displayStudentCountByGrade(float note) {
        int count = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == note) {
                count++;
            }
        }
       return count;
    }

}
