package Assignment4;

public class Baby implements Interface {



    private String name;
    public String concreteString = "Concrete String";

    private String id;

    Baby(Builder builder){
        this.name = builder.name;
        this.id = builder.id;
    }

    public Baby() {

    }

    public boolean walk(int a){
        if(a < 5)
            return true;
        else
            return false;

    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }

    public class Builder{
        private String name;
        private String id;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Baby build(){return new Baby(this);}

    }


}

