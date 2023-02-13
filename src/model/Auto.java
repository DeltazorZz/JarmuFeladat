package model;

public class Auto extends Jarmu {

    private boolean defekt;

    public void kereketCserel() {
        if (defekt==true) {
            leallit();
        }
    }

    @Override
    public boolean halad() {
        if (defekt == false) {
            super.halad();
        }
        kereketCserel();
        return defekt;
    }

}
