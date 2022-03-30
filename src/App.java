public class App {
    public static void main(String[] args) throws Exception {
        Smartphone smartA = new Smartphone();
        smartA.Name = "Iphone 12";
        smartA.ScreenSize = 6.1f;
        smartA.StorageSpace = 128;
        smartA.OperationalSystem = "IOS";
        
        System.out.format("Celular %s com tela de %.1f, com %dGB e SO %s", smartA.Name, smartA.ScreenSize, smartA.StorageSpace, smartA.OperationalSystem);
        
        Smartphone smartB = new Smartphone();
        smartB.Name = "Samsung Galaxy 22's";
        smartB.ScreenSize = 7.4f;
        smartB.StorageSpace = 228;
        smartB.OperationalSystem = "ANDROID 11";
        
        System.out.format("Celular %s com tela de %.1f, com %dGB e SO %s", smartB.Name, smartB.ScreenSize, smartB.StorageSpace, smartB.OperationalSystem);
    }
}
