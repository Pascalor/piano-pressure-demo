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
            File soundFile; AudioInputStream audioIn; Clip clip;
            switch(pixel) {
                case 0:
                    // Open an audio input stream.           
                    soundFile = new File("piano_notes/c1.wav");
                    audioIn = AudioSystem.getAudioInputStream(soundFile);              
                    // Get a sound clip resource.
                    clip = AudioSystem.getClip();
                    // Open audio clip and load samples from the audio input stream.
                    clip.open(audioIn);
                    clip.start();
                    break;
                case 1:         
                    soundFile = new File("piano_notes/d1.wav");
                    audioIn = AudioSystem.getAudioInputStream(soundFile);              
                    clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                    break;
                case 2:
                    soundFile = new File("piano_notes/e1.wav");
                    audioIn = AudioSystem.getAudioInputStream(soundFile);              
                    clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                    break;
                case 3:
                    soundFile = new File("piano_notes/f1.wav");
                    audioIn = AudioSystem.getAudioInputStream(soundFile);              
                    clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                    break;
                case 4: 
                    soundFile = new File("piano_notes/g1.wav");
                    audioIn = AudioSystem.getAudioInputStream(soundFile);              
                    clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                    break;
                case 5:
                    soundFile = new File("piano_notes/a1.wav");
                    audioIn = AudioSystem.getAudioInputStream(soundFile);              
                    clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                    break;
                case 6:
                    soundFile = new File("piano_notes/b1.wav");
                    audioIn = AudioSystem.getAudioInputStream(soundFile);              
                    clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
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