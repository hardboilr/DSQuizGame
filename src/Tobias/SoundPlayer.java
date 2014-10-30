/**
 * @author Tobias
 */
package Tobias;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.*;
import javax.sound.sampled.*;
//test
public class SoundPlayer {

    private Clip clip1;
    
    public void loadSound(String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                AudioInputStream sound = AudioSystem.getAudioInputStream(file);
                clip1 = AudioSystem.getClip();
                clip1.open(sound);
            } else {
                throw new RuntimeException("Sound: File not found: " + fileName);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("Sound: Malformed URL: " + e);
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException("Sound: Unsupported Audio File: " + e);
        } catch (IOException e) {
            throw new RuntimeException("Sound: Input/Output Error: " + e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException("Sound: Line Unavailable Exception Error: " + e);
        }

    }

    public void playSound() {
        clip1.setFramePosition(0);
        clip1.start();
        System.out.println("Playing sound!");
    }
    
    public void stopSound() {
        clip1.stop();
        System.out.println("Stopping sound!");
    }

}
