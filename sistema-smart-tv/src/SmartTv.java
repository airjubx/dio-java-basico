public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada && novoCanal > 0) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal aumentado para: " + canal);
        }
    }

    public void diminuirCanal() {
        if (ligada && canal > 1) {
            canal--;
            System.out.println("Canal diminuído para: " + canal);
        }
    }
}