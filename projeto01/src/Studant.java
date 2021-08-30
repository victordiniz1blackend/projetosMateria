public class Studant {
    //inicializando as variaveis
    private String nome;
    private double media;

    //os gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if (media > 0.0) {
            if (media <= 100.0) {
                this.media = media;
            }
        }
    }

    public Studant(String nome, double media) {
        this.nome = nome;
        if (media > 0.0) {
            if (media <= 100) {
                this.media = media;
            }

        }



        }
    public  String getLetterGrade(){
        String letterGrande="";
        if(media>=90){
          letterGrande="a";
        }else if(media>=80){
            letterGrande="b";
        }else if(media>=70){
            letterGrande="c";
        }else {
            letterGrande="d";
        }

        return letterGrande;
    }


}


