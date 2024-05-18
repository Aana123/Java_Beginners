//Directly multiple inheritance allowed nhi hai but same ko interfaces ki madad se achieve kiya jata hai
class PHone{
    void call(){
        System.out.println("Calling last dialed number.....");
    }
}
interface camera {
     void click();
     void preview();
     default void recordIn4K(){
         System.out.println("Recording in 4K!");
     }
}
interface radio {
    void play();
    void pause();
    void playNext();
}
interface gps {
    void showLocation();
}
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class smartfone extends PHone implements camera,radio,gps,wifi{
    public void click(){
        System.out.println("Smile please and say cheese......Click!");
    }
    public void preview(){
        System.out.println("Here's you last clicked photo :)");
    }
    public void recordIn4K(){                                                                                           //Upar wala implement na ho kar yeh wala implement hoga
        System.out.println("Caught in 4K xD");
    }
    public void play() {
        System.out.println("Playing Yimmy Yimmy....");
    }
    public void pause() {
        System.out.println("Paused the song!");
    }
    public void playNext(){
        System.out.println("Playing Sadqay....");
    }
    public void showLocation(){
        System.out.println("Your current location is: Bhiwandi sukhi dandi!");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks:");
        String[] networkList = {"Agnel","Sygnl","crygnl","Prignl"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        smartfone sm = new smartfone();
        sm.call();
        sm.click();
        sm.preview();
        sm.play();
        sm.pause();
        sm.playNext();
        String[] arr = sm.getNetworks();
        for(String item:arr){
            System.out.println(item);
        }
        sm.connectToNetwork("Dinghy");
    }
}
