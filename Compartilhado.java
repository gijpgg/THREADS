package principal;

public class Compartilhado {

    private int buffer;
    private int tamanhoBuffer;

    public Compartilhado() {
        this(5, 5);
        
    }

    public Compartilhado(int buffer, int tamanhoBuffer) {
        setBuffer(buffer);
        setTamanhoBuffer(tamanhoBuffer);
    }

    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public int getTamanhoBuffer() {
        return tamanhoBuffer;
    }

    public void setTamanhoBuffer(int tamanhobuffer) {
        this.tamanhoBuffer = tamanhobuffer;
    }
    //Gets e sets    

    public synchronized void consumir() {
        setBuffer(getBuffer() - 1);
    }

    public synchronized void produzir() {
        setBuffer(getBuffer() + 1);
    }
}
