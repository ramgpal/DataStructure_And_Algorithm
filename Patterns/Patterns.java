package Patterns;

public class Patterns {
        /* 1.Hollow Rectangle
                              *****
                              *   *
                              *   *
                              *   *
                              *****
      */
            public static void HollowRectangle(int n) {
              for(int i=1;i<=n;i++) {
                  for(int j=1;j<=n;j++) {
                      if(i==1 || i==n || j==1 || j==n) {
                          System.out.print("*");
                      }
                      else {
                          System.out.print(" ");
                      }
                      
                  }
                  System.out.println();
              }
              System.out.println();
          }
            /* 2.Inverted half pyramid for stars & spaces     *
                                                            * *
                                                          * * *
                                                        * * * *              
        */
            public static void InvertedAndRotatedHalfPyramid(int n) {
                for(int i=1;i<=n;i++) {
                for(int j=1;j<=(n-i);j++) {
                System.out.print(" ");
                }
                for(int j=1;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // 3.Inverted half pyramid for  numeric digits
        public static void Inverted_And_Rotated_Half_Pyramid(int n) {
            for(int i=1;i<=n;i++) {
            for(int j=1;j<=(n-i+1);j++) {
                System.out.print(j);
            }
            System.out.println();
        } 
        System.out.println();
      }
        /* 4.To print floyad Triangle 1
                                    2 3
                                    4 5 6
                                    7 8 9 10
                                   11 12 13 14 */
        
        public static void Floyad_Triangle(int n) {
            int counter=1;
            for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        } 
      System.out.println();
      }
        /* 5. Diamond  
                       *              
                      ***
                     *****
                    *******
                                                                                                                */
            public static void Diamond(int n) {
                for(int i=1;i<=n;i++) {
                    //spaces
                    for(int j=1;j<=(n-i);j++) {
                        System.out.print(" ");
                        
                    }
                    //stars 
                    for(int j=1;j<=(2*i)-1;j++) {
                        System.out.print("*");
                    }
                    //spaces
                    for(int j=1;j<=(n-i);j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println();
                }
                // 6.Rotated Diamond
                public static void Rotated_Diamond(int n) {
                    for(int i=n;i>=1;i--) {
                         //spaces
                    for(int j=1;j<=(n-i);j++) {
                        System.out.print(" ");
                        
                    }
                    //stars 
                    for(int j=1;j<=(2*i)-1;j++) {
                        System.out.print("*");
                    }
                    //spaces
                    for(int j=1;j<=(n-i);j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println();
                }
              
            
        /* Function calling for all definitions */
            public static void main(String[] args) {
              HollowRectangle(5);
             InvertedAndRotatedHalfPyramid(4);
             Inverted_And_Rotated_Half_Pyramid(5);
             Floyad_Triangle(5);
             Diamond(4);
            Rotated_Diamond(4);
            }
          }
