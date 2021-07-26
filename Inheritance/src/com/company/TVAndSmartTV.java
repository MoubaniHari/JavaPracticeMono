package com.company;
class TV{
    public void switchON(){
        System.out.println("TV is Switched ON.");
    }
    public void changeChannel(){
        System.out.println("Channel is Changed.");
    }
}
class SmartTV extends TV{
    public void switchON(){ System.out.println("Smart TV is Switched ON"); }
    public void changeChannel() { System.out.println("SmartTV Channel is Changed "); }
    public void browse(){ System.out.println("Smart Tv Browsing");}
}
public class TVAndSmartTV {
    public static void main(String[] args) {
        TV t = new TV();
        t.switchON();
        t.changeChannel();

        SmartTV s = new SmartTV();
        s.switchON();
        s.changeChannel();
        s.browse();
    }
}
