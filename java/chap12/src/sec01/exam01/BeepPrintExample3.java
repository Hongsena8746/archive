package sec01.exam01;

import sec01.exam01.BeepThread;


public class BeepPrintExample3 {

   public static void main(String[] args) {
      //how1
      Thread thread = new BeepThread();
      
      thread.start();
      
      for(int i=0; i<5; i++) {
         System.out.println("��");
         try {Thread.sleep(500);}catch(Exception e) {}
      }
   }
}