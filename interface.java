class Phone{
void voicecall(){ 
System.out.println("Make Voicecalls");
}
void sms(){
System.out.println("We can send sms");
}
}
interface Camera{ 
void click(); 
void record();
}
interface Player{ 
void play(); 
void pause(); 
void stop();
}
class Smartphone extends Phone implements Camera,Player
{
public void click(){
System.out.println("You Can make multiple click");
}
public void record(){
System.out.println("You can record Videos");
}
public void play(){ 
System.out.println("Play the songs");
}
public void pause(){
	System.out.println("Pause the songs");
}
public void stop(){
System.out.println("you have options to stop the song");
}
}
class interfaceDemo2 {
public static void main(String [] args){ 
Smartphone o = new Smartphone(); 
o.voicecall();
o.sms();
o.click();
o.record();
o.play();
o.pause();
o.stop();
}
}