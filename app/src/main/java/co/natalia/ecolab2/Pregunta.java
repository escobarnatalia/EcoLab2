package co.natalia.ecolab2;

public class Pregunta {

    private int pregunta1;
    private int pregunta2;
    private int resultado;



    public Pregunta (){

        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
       this.resultado = resultado;
    }

    public void preguntas() {
        pregunta1 = (int) (Math.random()*20);
        pregunta2 = (int) (Math.random()*20);
        resultado = pregunta1 + pregunta2;
    }

    public int getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(int pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public int getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(int pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }


}

