public class Fracao {
    private int num;
    private int denom;

    public Fracao(int num, int denom) {
        this.num = num;
        if(denom != 0) {
            this.denom = denom;
        } else {
            this.denom = 1;
        }
    }   
}