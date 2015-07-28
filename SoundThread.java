import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class SoundThread extends Thread
{
    private int pixel;
    
    public SoundThread(int p)
    {
        pixel = p;
        run();
    }
    
    @Override
    public void run()
    {
        try
        {
            File soundFile; AudioInputStream audioIn; Clip clip;
            switch(pixel) {
                case 0:
                    // Point soundFile to corresponding .wav file         
                    soundFile = new File("piano_notes/c1.wav");
                    break;
                case 1:         
                    soundFile = new File("piano_notes/d1.wav");
                    break;
                case 2:
                    soundFile = new File("piano_notes/e1.wav");
                    break;
                case 3:
                    soundFile = new File("piano_notes/f1.wav");
                    break;
                case 4: 
                    soundFile = new File("piano_notes/g1.wav");
                    break;
                case 5:
                    soundFile = new File("piano_notes/a1.wav");
                    break;
                case 6:
                    soundFile = new File("piano_notes/b1.wav");
                    break;  
                default: 
                    soundFile = null;
                    System.out.println("Invalid pixel.");
                    break;
                }
            // Open an audio input stream.  
            audioIn = AudioSystem.getAudioInputStream(soundFile);              
            // Get a sound clip resource.
            clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);
            clip.start();          
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}