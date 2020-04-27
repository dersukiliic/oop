package örnekkod;

import java.nio.*; 
import java.util.*; 
  
public class GFG { 
    public static void main(String[] args) 
    { 
  
        // Declaring the capacity of the ShortBuffer 
        int capacity = 10; 
  
        // Creating the ShortBuffer 
        try { 
  
            // creating object of Shortbuffer 
            // and allocating size capacity 
            ShortBuffer sb = ShortBuffer.allocate(capacity); 
  
            // putting the value in Shortbuffer 
            sb.put((short)856); 
            sb.put(2, (short)9); 
            sb.rewind(); 
  
            // getting array from fb ShortBuffer using array() method 
            short[] sbb = sb.array(); 
  
            // printing the ShortBuffer fb 
            System.out.println("ShortBuffer: "
                               + Arrays.toString(sbb)); 
        } 
  
        catch (IllegalArgumentException e) { 
  
            System.out.println("IllegalArgumentException catched"); 
        } 
  
        catch (ReadOnlyBufferException e) { 
  