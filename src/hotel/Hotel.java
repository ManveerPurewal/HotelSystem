package hotel;

import java.util.Scanner;

public class Hotel {

    public static Scanner input = new Scanner(System.in);
    public static int boredPrice;
    

    public static void main(String[] args) {
        
        while (true) {
            double finalprice = 0;
            System.out.println("");
            System.out.println("Welcom to Mani's Hotel");
            System.out.println("");
            System.out.println("What Room type wpuld the guest like to have");
            System.out.println("1 - Single (1 person)");
            System.out.println("2 - Double (2 People)");
            System.out.println("3 - Family (4 people)");

            int Choice = input.nextInt();
            switch (Choice) {
                case 1:
                    int price = 50;
                    System.out.println("What board would the guest like?");
                    System.out.println("1 - self catering 2 - half board 3 - Full boared");
                    int board = input.nextInt();
                    if (board == 1) {
                        boredPrice = 0;
                    } else if(board == 2)  {
                        boredPrice = 10;

                    } else{
                        boredPrice = 20;
                    }
                    System.out.println("how many nights are they going to stay");
                    int days = input.nextInt();
                    double totalprice = price + boredPrice;
                    
                    for(int i = 1; i < days; i++){
                        if(i >= 8){
                            totalprice = totalprice * 0.8;
                        }
                        finalprice = finalprice + totalprice;
                    }
                    
                    System.out.println("you final price is £" + finalprice);

                    break;

                case 2:
                    price = 75;

                    System.out.println("1 - self catering 2 - half board 3 - Full boared");
                    board = input.nextInt();
                    if (board == 1) {
                        boredPrice = 0;
                    } else if(board == 2)  {
                        boredPrice = 10;

                    } else{
                        boredPrice = 20;
                    }
                    System.out.println("how many nights are they going to stay");
                    days = input.nextInt();
                    totalprice = price + boredPrice;
                    
                    for(int i = 1; i < days; i++){
                        if(i >= 8){
                            totalprice = totalprice * 0.8;
                        }
                        finalprice = finalprice + totalprice;
                    }
                    
                    System.out.println("you final price is £" + finalprice);

                    break;

                case 3:
                    price = 105;

                    System.out.println("1 - self catering 2 - half board 3 - Full boared");
                    board = input.nextInt();
                    if (board == 1) {
                        boredPrice = 0;
                    } else if(board == 2)  {
                        boredPrice = 10;

                    } else{
                        boredPrice = 20;
                    }
                    System.out.println("how many nights are they going to stay");
                    days = input.nextInt();
                    totalprice = price + boredPrice;
                    
                    for(int i = 1; i < days; i++){
                        if(i >= 8){
                            totalprice = totalprice * 0.8;
                        }
                        finalprice = finalprice + totalprice;
                    }
                    
                    System.out.println("you final price is £" + finalprice);
                    break;
            }
        }

    }

}
