public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getFormattedHour() {
        return  horas+":"+minutos+":"+segundos;
    }

    public void subtractTwoDates(Tempo t1, Tempo t2) {
        if(t1.getHoras() > t2.getHoras()) {
            this.horas = t1.getHoras() - t2.getHoras();
        } else {
            this.horas = t2.getHoras() - t1.getHoras();
        }

        if(t1.getMinutos() > t2.getMinutos()) {
            this.minutos = t1.getMinutos() - t2.getMinutos();
        } else {
            this.minutos = t2.getMinutos() - t1.getMinutos();
        }

        if(t1.getSegundos() > t2.getSegundos()) {
            this.segundos = t1.getSegundos() - t2.getSegundos();
        } else {
            this.segundos = t2.getSegundos() - t1.getSegundos();
        }
    }

    public void addTwoDates(Tempo t1, Tempo t2) {
        this.horas = t1.getHoras() + t2.getHoras();
        if(t1.getMinutos() + t2.getMinutos() > 60) {
            int sobrou = t1.getMinutos() + t2.getMinutos() - 60;
            this.horas += 1;
            this.minutos =  sobrou;
        } else {
            this.minutos = t1.getMinutos() + t2.getMinutos();
        }
        if(t1.getSegundos() + t2.getSegundos() > 60) {
            int sobrou = t1.getSegundos() + t2.getSegundos() - 60;
            this.minutos += 1;
            this.segundos =  sobrou;
        } else {
            this.segundos = t1.getSegundos() + t2.getSegundos();
        }

    }

    public Tempo addTwoDates(Tempo t1) {
        Tempo novoTempo = new Tempo();
        novoTempo.setHoras(t1.getHoras() + this.horas);

        if (t1.getMinutos() + this.minutos > 60) {
            int sobrou = t1.getMinutos() + this.minutos - 60;
            novoTempo.setHoras(novoTempo.getHoras() + 1);
            novoTempo.setMinutos(sobrou);
        } else {
            novoTempo.setMinutos(t1.getMinutos() + this.minutos);
        }

        if (t1.getSegundos() + this.segundos > 60) {
            int sobrou = t1.getSegundos() + this.segundos - 60;
            novoTempo.setMinutos(novoTempo.getMinutos() + 1);
            novoTempo.setSegundos(sobrou);
        } else {
            novoTempo.setSegundos(t1.getSegundos() + this.segundos);
        }
        return novoTempo;
    }
}