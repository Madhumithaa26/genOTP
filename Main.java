
    // OTP Generator

import java.util.*;

class Main 
{
   public static void main(String[] args) 
   {
      System.out.println(OTPgen(8));
   }

      private static char[] OTPgen(int length) {
      String num = "0123456789";
      String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String smalls = "abcdefghijklmnopqrstuvwxyz";
      String sym = "@#_";
      String result = num+caps+smalls+sym;
      
      Random m = new Random();
      char[] otp = new char[length];

      for(int i = 0; i< l ; i++)
      {
         otp[i] = result.charAt(m.nextInt(result.l()));
      }
      return otp;
   }
}