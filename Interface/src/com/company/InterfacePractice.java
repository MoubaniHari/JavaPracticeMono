package com.company;
import java.util.Scanner;
class Phone{
    public void call(){
        System.out.println("Phone calls");
    }
    public void sms(){
        System.out.println("Phone sending sms");
    }
}
interface ICamera{
    void click();
    void recordVideo();
}
interface IMusicPlayer{
    void play();
    void pause();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer{
    public void videoCall(){
        System.out.println("Video call is available");
    }
    public void click() {
        System.out.println("Smart Phone Clicking Photo");
    }
    public void recordVideo() {
        System.out.println("Smart Phone recording video");
    }
    public void play() {
        System.out.println("Smart Phone playing music");
    }
    public void pause() {
        System.out.println("Smart Phone stopped playing music");
    }
}
public class InterfacePractice {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        Phone p = sp;
        ICamera ic = sp;
        IMusicPlayer ip = sp;

    }
}
