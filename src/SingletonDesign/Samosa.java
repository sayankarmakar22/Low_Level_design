package SingletonDesign;

public class Samosa {
//    eager way
//    private static Samosa samosa = new Samosa();
//    public static Samosa getSamosa(){
//        return samosa;
//    }

//    lazy way
    private static Samosa isObj;
    private Samosa(){

    }
    public static Samosa getSamosa(){
        if(isObj==null){
            isObj = new Samosa();
        }
        return isObj;
    }
}
