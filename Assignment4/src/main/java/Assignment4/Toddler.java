package Assignment4;

public class Toddler implements Interface{

    public void Toddler(){

    }

    public boolean walk(int a){

        if( a < 5)
            return true;
        else
            return false;

    }
    private int age = 6;


    //FRAGILITY
    public boolean operation(){
        if (valA == 500)
            return true;
        else
            return false;


    }
    //Needless complexity
    public int trackRunner( boolean y){
        if( y == true) {
            System.out.println("Track runner");
            return 1;
        }
            else{
                System.out.println("Normal runner");
            return 2;}
    }
}
