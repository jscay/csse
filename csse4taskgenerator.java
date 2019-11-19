import java.util.ArrayList;
import java.util.Collections;
 
public class CSSE4 {
    
       public static void main(String[] args) {
         System.out.println("As part of your learning, the GP has asked you to demonstrate your examination skills of the peripheral nervous system of the upper and lower limbs, as well as the musculoskeletal system of the lower limbs by performing specific tasks");
         System.out.println("Tasks:");
         System.out.println("Demonstrate the following physical examinations:");
//why is getting 2 different random numbers so complicated wtf my 1 brain cell can't handle this 
        ArrayList<Integer> ULPNSlist = new ArrayList<Integer>();
        for (int i=1; i<13; i++) {
            ULPNSlist.add(new Integer(i));
        }
        Collections.shuffle(ULPNSlist);
        System.out.println("1. Peripheral Nervous System Upper Limbs:");

        for (int i=0; i<2; i++) {
            switch (ULPNSlist.get(i)){
            case 1:System.out.println("General Inspection");
            break;
                   
            case 2: System.out.println("Tone") ;
            break;
            
            case 3: System.out.println("Power ") ;
            break;
            
            case 4: System.out.println("Reflex testing") ;
            break;
        
            case 5: System.out.println("Coordination testing") ;
            break;
            
            case 6: System.out.println("Pain") ;
            break;
            
            case 7: System.out.println("Temperature") ;
            break;
                
            case 8: System.out.println("Vibration") ;
            break;
            
            case 9: System.out.println("Proprioception");
            break;
            
            case 10: System.out.println("Light touch") ;
            break;
            
            case 11: System.out.println("Two point discrimination") ;
            break;
            
            case 12: System.out.println("Stereognosis") ;
            break;
    }
        }
            System.out.println("");

        ArrayList<Integer> LLPNSlist = new ArrayList<Integer>();
        for (int i=1; i<17; i++) {
            LLPNSlist.add(new Integer(i));
        }
        Collections.shuffle(LLPNSlist);
        System.out.println("2. Peripheral Nervous System Lower Limbs:");

        for (int i=0; i<2; i++) {
            switch (LLPNSlist.get(i)){
            case 1:System.out.println("General Inspection");
            break;
                   
            case 2: System.out.println("Gait") ;
            break;
            
            case 3: System.out.println("Trendelenburg test") ;
            break;
            
            case 4: System.out.println("Pull test") ;
            break;
        
            case 5: System.out.println("Romberg's test") ;
            break;
            
            case 6: System.out.println("Tone") ;
            break;
            
            case 7: System.out.println("Clonus") ;
            break;
                
            case 8: System.out.println("Power") ;
            break;
            
            case 9: System.out.println("Reflexes");
            break;
            
            case 10: System.out.println("Coordination") ;
            break;
            
            case 11: System.out.println("Light touch") ;
            break;
            
            case 12: System.out.println("Temperature") ;
            break;
            
            case 13: System.out.println("Vibration") ;
            break;
            
            case 14: System.out.println("Proprioception");
            break;
            
            case 15: System.out.println("Two point discrimination") ;
            break;
              
            case 16: System.out.println("Pain") ;
            break;
    }
        }
        System.out.println("") ;
 System.out.println("3. Musculoskeletal System Lower Limbs:");
 int min = 1;       
 int max = 3;
 int LLMSKrandom = (int)(Math.random()*((max-min)+1))+min;
 //chooses which area of the LL the MSK exam is to be performed on
 //1 Hips, 2 Knees, 3 Ankles or Feet
 if (LLMSKrandom == 1) {
    
     ArrayList<Integer> LLMSKHipslist = new ArrayList<Integer>();
        for (int i=1; i<8; i++) {
            LLMSKHipslist.add(new Integer(i));
        }
        Collections.shuffle(LLMSKHipslist);
        System.out.println("Hips:");
        for (int i=0; i<2; i++) {
            switch (LLMSKHipslist.get(i)){
            case 1:System.out.println("General Inspection");
            break;
                   
            case 2: System.out.println("Trendelenburg test") ;
            break;
            
            case 3: System.out.println("Palpation/Feel") ;
            break;
            
            case 4: System.out.println("Passive movements") ;
            break;
        
            case 5: System.out.println("Active movements") ;
            break;
            
            case 6: System.out.println("Measure") ;
            break;
            
            case 7: System.out.println("Thomas test") ;
            break;
 }
        
       
    }
                                           
 } else if (LLMSKrandom == 2){
     ArrayList<Integer> LLMSKKneeslist = new ArrayList<Integer>();
        for (int i=1; i<12; i++) {
            LLMSKKneeslist.add(new Integer(i));
        }
        Collections.shuffle(LLMSKKneeslist);
        System.out.println("Knees:");
        for (int i=0; i<2; i++) {
            switch (LLMSKKneeslist.get(i)){
            case 1:System.out.println("General Inspection");
            break;
                   
            case 2: System.out.println("Palpation/Feel") ;
            break;
            
            case 3: System.out.println("Patellar tap ") ;
            break;
            
            case 4: System.out.println("Patellar apprehension test") ;
            break;
        
            case 5: System.out.println("Passive movements") ;
            break;
            
            case 6: System.out.println("Active movements") ;
            break;
            
            case 7: System.out.println("Lateral collateral ligament stress test (varus)") ;
            break;
                
            case 8: System.out.println("Medial collateral ligament stress test (valgus )") ;
            break;
            
            case 9: System.out.println("Drawer test");
            break;
            
            case 10: System.out.println("Lachman test");
            break;
            
            case 11: System.out.println("McMurray's test") ;
            break;
          }
 
 
       }
       
} else if (LLMSKrandom == 3) {
     ArrayList<Integer> LLMSKAnkleslist = new ArrayList<Integer>();
        for (int i=1; i<7; i++) {
            LLMSKAnkleslist.add(new Integer(i));
        }
        Collections.shuffle(LLMSKAnkleslist);
        System.out.println("Ankles or Feet:");
        for (int i=0; i<2; i++) {
            switch (LLMSKAnkleslist.get(i)){
            case 1:System.out.println("General Inspection");
            break;
                   
            case 2: System.out.println("Palpation of the ankle joint") ;
            break;
            
            case 3: System.out.println("Passive movement") ;
            break;
            
            case 4: System.out.println("Active movement") ;
            break;
        
            case 5: System.out.println("Achilles tendon integrity") ;
            break;
            
            case 6: System.out.println("Palpation of the feet") ;
            break;
 }
       } 
}
       }
}

 

