package model;

public abstract class Jarmu {

    private boolean beinditva, uzemanyag, megerkezett;

    public void beindit() {
        beinditva = true;
    }

    public void leallit() {
        beinditva = false;
    }

    public boolean tankol() {
        leallit();
        uzemanyag = true;
        return uzemanyag;
    }

    public boolean halad() {
        if (uzemanyag) {
            beindit();
            megerkezett = true;
            uzemanyag = false;
            return megerkezett;
        }
        else{
            beindit();
        }
        return megerkezett;
    }
