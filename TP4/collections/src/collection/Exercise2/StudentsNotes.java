package collection.Exercise2;

import java.util.HashMap;

public class StudentsNotes {
    public static void main(String[] args) {
//        Insérer des notes des étudiants.
        HashMap<String, Double> studentsNotes = new HashMap<>();
        for (int i=0;i<20;i++){
            studentsNotes.put("studentN"+(i+1), Math.random()*20);
        }
        studentsNotes.forEach((k,v)->{
            System.out.println("Key= "+k+" Value= "+v);
        });
//        Augmenter la note d’un étudiant.Par exemple etudiant 9
        Double student9Note = studentsNotes.get("studentN9");
        if(student9Note-1<=19){
            studentsNotes.put("studentN9",student9Note+1);
        }else{
            System.out.println("Il est difficile d'augmenter la note de cet etudient!!!");
        }


        System.out.println("Apres augmenter la note etudiant 9");
        //On veur maintenant de supprimer la note d'etudiant 15
        studentsNotes.remove("studentN15");
        System.out.println("La taille de map est: "+studentsNotes.size());
        studentsNotes.forEach((k,v)->{
            System.out.println("Key= "+k+" Value= "+v);
        });
       //Calcule de note moyenne, max et min
        Double totalNote = 0.00;
        for (Double note: studentsNotes.values()){
            totalNote += note;
        }
        System.out.println("La note moyenne est: "+totalNote/studentsNotes.size());
        Double max_note = 0.00, min_note=20.00;
        for (Double note : studentsNotes.values()) {
            if (note>max_note){
                max_note = note;
            }
            if(note<min_note){
                min_note = note;
            }
        }
        System.out.println("La note maximum est: "+max_note);
        System.out.println("La note minimum est: "+min_note);
//        Vérifier s’il y a une note égale à 20.
        studentsNotes.forEach((k,v)->{
            if(v == 20.00){
                System.out.println("On a l'etudiant "+k+"ayant la note 20");
            }
        });
        //List des etudiant
        studentsNotes.forEach((k,v)->{
            System.out.println("Key= "+k+" Value= "+v);
        });

    }
}
