public class Singleton {
    private static class Holder {
        private static Singleton singleton = new Singleton();
    }
    
    private Singleton(){}
        
    public static Singleton getSingleton(){
        return Holder.singleton;
    }
}