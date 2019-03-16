package Assignment4;

public class Runner extends Baby{

    public Runner(){

    }
    //RIGIDITY
    private int val = 600;
    private int x;

    public boolean runner(int a){
        return super.walk(a);
    }

    public int getVal(){
        return val;
    }


    public boolean concreteString(){

        if(concreteString.equals("This")){
            return true;
        }
        else  {
            return false;
        }
    }

  public void setX(int x){
        this.x = x;
  }

}
