package com.entertainment.client;

import com.entertainment.Television;

class TelevisionMuteTest {

    public static void main(String[] args) {
        Television tv = new Television("Samsung", 35);

        System.out.println(tv);                 // toString() called

        tv.mute();                              // put it in the muted state
        System.out.println(tv);

        tv.mute();                              // unmutes it, should be back to 35
        System.out.println(tv);

        tv.mute();                              // puts it back into muted state
        System.out.println(tv);

        tv.setVolume(50);                       // unmutes it and sets volume to 50
        System.out.println(tv);
    }
}