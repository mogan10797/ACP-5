public class Hero {
    protected String Name, imgName;
    protected int hp;

    public Hero() {

    }
    public void setName(String newName){
        this.Name=newName;
    }
    public String getName(){
        return this.Name;
    }
    public void setimgName(String newimgName){
        this.imgName=newimgName;
    }
    public String getimgName(){
        return this.imgName;
    }
}