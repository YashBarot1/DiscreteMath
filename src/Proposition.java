//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Proposition {
    protected boolean flag = false;

    public Proposition(){

    }
    void setFlag(boolean input){
        flag = input;
    }
    public boolean and(Proposition compare){
        return flag == compare.flag;
    }
    public boolean or(Proposition compare){
        return compare.flag || flag ;
    }

     public Proposition not(){
        Proposition proposition = this;
        proposition.flag = !flag;
        return proposition;
    }



    public static void main(String[] args) {

        Proposition aprop = new Proposition();
        aprop.setFlag(true);
        Proposition bprop = new Proposition();
        bprop.setFlag(false);

        System.out.println(aprop.and(bprop));
        System.out.println(aprop.or(bprop));
        System.out.println(aprop.and(bprop.not()));
        System.out.println(aprop.or(bprop.not()));

    }
}