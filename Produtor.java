package principal;

public class Produtor implements Runnable {

    private Compartilhado x;
    private int tempo;

    public Produtor(Compartilhado x) {
        this.x = x;
        
    }
    public void setX(Compartilhado x) {
        this.x = x;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public Compartilhado getX() {
        return x;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //Gera um atraso aleatório com base no tempo
                Thread.sleep((int) (Math.random() * getTempo()));
            } catch (InterruptedException e) {
            }
            x.produzir();
        }
    }
}
          
