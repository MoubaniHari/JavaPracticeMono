package com.company;
class Phone{
    public void playMusic(){
        System.out.println("We can listen music.");
    }
    public void phoneCall(){
        System.out.println("We have to make phone calls by using touchpad");
    }
}
class SmartPhone extends Phone{
    public void phoneCall(){
        System.out.println("We have to make phone calls by touching the screen itself.");
    }
    public void internetConnection(){
        System.out.println("It has Wi-Fi facility.");
    }
}
public class PhoneAndSmartPhone {
    public static void main(String[] args) {
        Phone p = new SmartPhone();
        p.playMusic();
        p.phoneCall();
//        p.internetConnection();
    }
}
