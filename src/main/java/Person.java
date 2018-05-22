public abstract class Person {
    private int age;
    public int wallet;
    public double height;

    public Person(int age, int wallet, double height){
        this.age = age;
        this.wallet = wallet;
        this.height = height;
    }

    public int getAge(){
        return this.age;
    }

    public int getWallet(){
        return this.wallet;
    }

    public double getHeight(){
        return this.height;
    }
}
