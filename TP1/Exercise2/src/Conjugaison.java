public class Conjugaison {
    public String verbe;
    public String[] pronons = {"Je", "Tu", "Il/Elle", "Nous", "Vous", "Ils/Elles"};
    public String[] terminaisons = {"e", "es", "e", "ons", "ez", "ent"};
    public Conjugaison(String verbe) {
        this.verbe = verbe;
    }
    public void conjuger(){
        if(verbe.endsWith("aller")) {
            System.out.println("Le verbe Aller n'est pas du premier groupe!!!");
        }
        else if(verbe.endsWith("er")) {
            String radical = verbe.substring(0, verbe.length() - 2);
            if(verbe.endsWith("ger")){
                for (int i=0; i< pronons.length; i++){
                    if(i == 3) { //cas de Nous
                        System.out.println(pronons[i]+" "+radical+"eons");
                    }else{
                        System.out.println(pronons[i]+" "+radical+terminaisons[i]);
                    }
                }
            } else if (verbe.endsWith("cer")) {
                for (int i=0; i< pronons.length; i++){
                    if(i == 3) { //cas de Nous
                        String radical1 = verbe.substring(0, verbe.length() - 3);
                        System.out.println(pronons[i]+" "+radical1+"çons");
                    }else{
                        System.out.println(pronons[i]+" "+radical+terminaisons[i]);
                    }
                }
            } else if (verbe.endsWith("yer")) {
                String radicalUpdate = verbe.substring(0, verbe.length() - 3)+"i";
                for (int i=0; i< pronons.length; i++){
                    if(i == 3 || i == 4) { //cas de Nous
                        System.out.println(pronons[i]+" "+radical+terminaisons[i]);
                    }else{
                        System.out.println(pronons[i]+" "+radicalUpdate+terminaisons[i]);
                    }
                }
            } else if (verbe.endsWith("eler")) {
                String radicalUpdate = verbe.substring(0, verbe.length() - 2)+"l";
                for (int i=0; i< pronons.length; i++){
                    if(i == 3 || i == 4) { //cas de Nous
                        System.out.println(pronons[i]+" "+radical+terminaisons[i]);
                    }else{
                        System.out.println(pronons[i]+" "+radicalUpdate+terminaisons[i]);
                    }
                }
            } else if (verbe.endsWith("eter")) {
                String radicalUpdate = verbe.substring(0, verbe.length() - 2)+"t";
                for (int i=0; i< pronons.length; i++){
                    if(i == 3 || i == 4) { //cas de Nous
                        System.out.println(pronons[i]+" "+radical+terminaisons[i]);
                    }else{
                        System.out.println(pronons[i]+" "+radicalUpdate+terminaisons[i]);
                    }
                }
            }else {
                for (int i = 0; i < pronons.length; i++) {
                    System.out.println(pronons[i] + " " + radical + terminaisons[i]);
                }
            }
        }else{
            System.out.println("Ce verbe n'est pas du premier groupe!!!");
        }
    }
}
