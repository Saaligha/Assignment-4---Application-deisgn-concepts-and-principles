package Assignment4;
//no inheritance
public class Kids {

    //Rigidity
private int val = 500;
private Baby b1 =  new Baby();
private Toddler t1 = new Toddler();



    public Kids() {
    }

    public boolean babyWalk(int a){
        if(a < 50)
            return true;
        else
            return false;
    }


    public boolean toddlerWalk(int a){
        if(a > 50)
            return true;
        else
            return false;
    }

}
