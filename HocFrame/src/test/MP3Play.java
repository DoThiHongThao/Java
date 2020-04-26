package test;

import javax.media.*;

import java.net.*;
import java.io.*;
import java.util.*;
class MP3Play
{
 public static void main(String args[]) throws Exception
 {
//File Path
 File f=new File(args[0]);
 // Create a Player object that realizes the audio
 final Player p=Manager.createRealizedPlayer(f.toURI().toURL());
  p.start();
  Scanner s=new Scanner(System.in);
  String st=s.nextLine();
   // If user types 'stop', stop the audio
   if(st.equals("stop"))
   {
	   p.stop();
   }
 }
}