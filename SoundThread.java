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
    }
    
    @Override
    public void run()
    {
        try
        {
            switch(pixel) {
                case 0:
                    // Open an audio input stream.           
                    File soundFile = new File("C:/Users/niklas/workspace/assets/Sound/sound.wav");
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
                    // Get a sound clip resource.
                    Clip clip = AudioSystem.getClip();
                    // Open audio clip and load samples from the audio input stream.
                    clip.open(audioIn);
                    clip.start();
                    break;
                case 1:
                    break;
                case 2: 
                    break;
                case 3:
                    break;
                case 4: 
                    break;
                case 5:
                    break;
                case 6:
                    break;  
                default: 
                    System.out.println("Invalid pixel.");
                    break;      
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}