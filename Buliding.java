public class Buliding {
    protected int hp, pd, attackdistance, width, height;
    protected String imgName;

    public Buliding() {

    }

    public void sethp(int newhp) {
        this.hp = newhp;
    }

    public int gethp() {
        return this.hp;
    }

    public void setpd(int newpd) {
        this.pd = newpd;
    }

    public int getpd() {
        return this.pd;
    }

    public void setattackdistance(int newdistance) {
        this.attackdistance = newdistance;
    }

    public int getattackdistance() {
        return this.attackdistance;
    }

    public void setwidth(int newwidth) {
        this.width = newwidth;
    }

    public int width() {
        return this.width;
    }

    public void setheight(int newheight) {
        this.height = newheight;
    }

    public int height() {
        return this.height;
    }
}