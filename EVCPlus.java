package assignment_4;
import java.util.Scanner;
public class EVCPlus {
     int pin = 1234;
    Scanner JF=new Scanner(System.in);
    public EVCPlus(){
        System.out.println(" Fadlan Gali Numberka Sirta ");
        int b=JF.nextInt();
        
        if (b!=pin){
            System.out.println("Numbeka Sirta Waa Qalad ");
        } else {
            System.out.println("EVCPlus");
            System.out.println("1. Itus Haraagaaga \n2.Kaarka Hadalka\n3.Bixi biilka \n4. "
                    + "Uwareeji EVCPlus \n 5. Maareynta \n 6.Salaam Bank \n 7. Warbixin\n "
                    + "8. Beyment Billka  ");
            int ch=JF.nextInt();
            switch(ch){
                case 1:
                    System.out.println("<EVCPlus->  Haraagaagu waa 100");
                    break;
                case 2:
                    System.out.println("Kaarka hadalka \n 1. Ku shubo Airline \n 2.Ugu Airline\n MIF Packages\n "
                            + "4. Ku shubo internet \n 5. Ugu shub qof kale  ");
                    int ch2=JF.nextInt();
                    switch(ch2){
                        case 1: 
                            System.out.println("fadlan gili lacagta");
                            int a=JF.nextInt();
                            System.out.println("mahubtaa inaad ku shubaneysid");
                            System.out.println("1.HAA\n 2.MYE");
                           int ch21=JF.nextInt();
                           switch (ch21){
                               case 1:
                                   System.out.println(" waaku shubatay");
                                   break;
                               case 2:
                                   System.out.println("ok");
                                   
                           }
                         break;
                        case 2:
                            System.out.println("fadlan gili lambarka");
                            break;
                        case 3:
                            System.out.println("1.kushubo data MEFI");
                            break;
                        case 4:
                            
                    }
                    break;
                case 3 :
                    System.out.println("Bixi Billka \n 1. Post paid \n 2. Ku Iibso");
                    break;
                case 4:
                    System.out.println("uwareeji EVCplus\n gili lambarkaaga");
                    break;
                case 5:
                    System.out.println("maareynta\n 1.badal lambarka sirta\n 2 karka uhuhu");
                    break;
                case 6:
                    System.out.println("salaam bank\n 1.kawareji evcplus\n 2.uwareeji saalaam bank");
                    break;
                case 7:
                    System.out.println("warbixin kooban\n 1.last action\n 2.last 3 action\n ");
                    break;
                case 8:
                    System.out.println("bayment biilka\n 1.wada bixi biilka\n 2.half kabixi biilka");
                    break;
               
                }
            
      }
       
    
}
}
