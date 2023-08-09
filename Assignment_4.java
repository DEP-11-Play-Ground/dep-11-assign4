public class Assignment04 {
    public static void main(String[] args) {

        System.out.println("Qustion-01 \n");
        
        int y=5;
while(y>0){
        int x = 0;
        while(x<y){
            System.out.print("+ ");
            x++;
        }
        System.out.println();
           y--;
    }

    y = 4;
    while(y>0){
          int x = 6;
        while(x>y){
            System.out.print("+ ");
            x--;
        }
        System.out.println();
        y--;
    }
     
    System.out.println("\n\n");
    System.out.println("Qustion-02 \n");


    int a = 0;
    int b = 3; 
    int c = 4;   
    int p = 0;
    while(p<4){
        int i = 7;

        while(i>0){
          System.out.print("+ ");
          i--;

          if(p==a && i ==b){
            while(c<i){
                System.out.print("  ");
                i--;
            }
          }         
        }
        System.out.println();
        p++;
        a++;
        b++;
        c--;
        
      }

      
      
      System.out.println("\n\n");
      System.out.println("Qustion-03 \n");

          a = 0;
          b = 3; 
          c = 4;   
          p = 0;
      while(p<4){
          int i = 7;
   
          while(i>0){
            System.out.print("+ ");
            i--;
   
            if(p==a && i ==b){
              while(c<i){
                  System.out.print("  ");
                  i--;
              }
            }         
          }
          System.out.println();
          p++;
          a++;
          b++;
          c--;
          
        }
        
        p = 1;
        a = 5;
        b = 1;
        c =2;
       while(p<4){
   
         int  i=7;
         while(i>0){
           System.out.print("+ ");
           i--;
   
         if(p==b && i ==a){
                 while(c<i){
                     System.out.print("  ");
                     i--;
                 }
               }
           
         }
         p++;
         c++;
         a--;
         b++;
         System.out.println();
       }

        
        System.out.println("\n\n");
        System.out.println("Qustion-04 \n");

         a = 0;
         b = 3; 
         c = 3;   
         p = 0;
       while(p<3){
           int i = 6;
    
           while(i>0){
             System.out.print("+ ");
             i--;   
             // if(p==1 && i ==4) {System.out.print("  "); i--;}
    
             if(p==a && i ==b){
               while(c<i){
    
                if(3<i) System.out.print("/ ");
                else System.out.print("\\ ");
                   i--;
               }
             }         
           }
           System.out.println();
           p++;
           a++;
           b++;
           c--;
           
         }
    
      
         p = 1;
         a = 5;
         b = 1;
         c =1;
        while(p<4){
    
          int  i=6;
          while(i>0){
            System.out.print("+ ");
            i--;
    
          if(p==b && i ==a){
                  while(c<i){
                      if(3<i) System.out.print("\\ ");
                      else System.out.print("/ ");
                      i--;
                  }
                }
            
          }
          p++;
          c++;
          a--;
          b++;
          System.out.println();
        }




        System.out.println("\n\n");
        System.out.println("Qustion-05 \n");

        int k = 5;
        while(k>0){
        int i = 5;
        
        while(i>0){
         System.out.print("+ ");
         i--;


         if(k==4 && i==4){
           System.out.print("/ ");
           i--;
         }
         if(k==2 && i==2){
           System.out.print("/ ");
           i--;
         }

             if(k==2 && i==4){
           System.out.print("\\ ");
           i--;
         }
         if(k==4 && i==2){
           System.out.print("\\ ");
           i--;
         }

        }
        System.out.println();
        k--;
        
       }


        System.out.println("\n\n");
        System.out.println("Qustion-06 \n");

           a = 0;
           b = 4; 
           c = 3;   
           p = 0;
        while(p<3){
            int i = 7;
     
            while(i>0){
              System.out.print("  ");
              i--;    
     
              if(p==a && i ==b){
                while(c<i){
     
                    System.out.print("+ ");
                 
                    i--;
                }
              }         
            }
            System.out.println();
            p++;
            a++;
            b++;
            c--;
            
          }
     
       
          p = 1;
          a = 5;
          b = 1;
          c =1;
         while(p<4){
     
           int  i=7;
           while(i>0){
             System.out.print("  ");
             i--;
     
           if(p==b && i ==a){
                   while(c<i-1){
                       System.out.print("+ ");
                       i--;
                   }
                 }
             
           }
           p++;
           c++;
           a--;
           b++;
           System.out.println();
         }
     

    }
    
}
