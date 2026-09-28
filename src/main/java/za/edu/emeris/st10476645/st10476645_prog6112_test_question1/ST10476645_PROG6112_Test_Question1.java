package za.edu.emeris.st10476645.st10476645_prog6112_test_question1;


public class ST10476645_PROG6112_Test_Question1 {

    public static void main(String[] args) {
          int[][] report = { {1000, 2000, 3000},
        {2000,3000,4000} , {1500 ,1100,1200} ,};
        
           String[] Consoles= {"PS5" , "XBOX", "SWITCH"};
        String[] Cities = {"Capetown"," Port Elizabeth"," Pretoria"};
          
          System.out.println("------------------------------------");
        System.out.println("\n GAMING  CONSOLE REPORT");
        System.out.println("------------------------------------");
          
          
           
        for (int j = 0; j < Consoles.length; j++) { // printing the consoles as a header
                 System.out.print(Consoles[j] + " ");
        }
             System.out.println(); 
        
              for (int i = 0; i < report.length; i++) { //afficher le report
            System.out.print(Cities[i] + " ");
            for (int j = 0; j < report[i].length; j++) { 
         
                System.out.print(report[i][j] + " "); // populating 
        }
            System.out.println(); 
    }
               System.out.println("------------------------------------");
        System.out.println("\n CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------");
        
        int totalSales = 0 ;
        int HighestSale = 0;
        String CityWithHighestSales= " ";
        
         for (int i = 0; i < Cities.length; i++) {
            totalSales = 0; // initialising the sales number to 0 per citiy
            for (int j = 0; j < Consoles.length; j++)  { //taking the sales for each consoles
                totalSales = totalSales + report[i][j]; //adding them
   
         }
            System.out.println(Cities[i] + "  " + totalSales); 
                  
                    if  (totalSales > HighestSale  ) {
                         HighestSale = totalSales;
                         CityWithHighestSales = Cities[i] ;
                     }
            }
     
  System.out.println( "CITY WITH THE MOST SALES: " + CityWithHighestSales);
        
        
    }
}
