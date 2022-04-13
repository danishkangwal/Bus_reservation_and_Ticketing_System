import java.io.*;
public class BusReservationAndTicketingSystem
{
    String user,password,yn,search,again,choice;
    int to=0,y=1,z=0,end=0,r=1;
    int available[] = new int[6];
    int ticketI[][] = new int [100][3];
    String ticketS[][] = new String[100][3];
    double ticketD[][] = new double [100][3];
    double pay[] = new double[20];
    double change[] = new double[20];
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    public void reservation()throws IOException
    {
        for(int i=1;i<4;){
        System.out.print("Enter User: ");
        user = buf.readLine();
        System.out.print("Enter Password: ");
        password = buf.readLine();
        
        for(int o=1; o<=5; o++){
            available[o]=20;
          }
          
        if(user.equals("1") && password.equals("1")){
        
            for(int x=1; x==1;){
                System.out.println("********************************************");
                System.out.println("********* BUS RESERVATION SYSTEM   *********");
                System.out.println("********************************************");
                System.out.println("** [1] Destination                   **");
                System.out.println("** [2] Passengers                    **");
                System.out.println("** [3] Billing                       **");
                System.out.println("** [4] View                          **");
                System.out.println("** [5] Exit                          **");
                System.out.println("***************************************");
                System.out.println("***************************************\n");
        
                for(x=1; x==1;){
                    System.out.print("ENTER CHOICE: ");
                    choice=buf.readLine();
                    if (choice.equals("1")){
                        System.out.println("***************************************");
                        System.out.println("**   DESTINATION   |  FARE  |  SEAT  **");
                        System.out.println("***************************************");
                        System.out.println("** 1.)Sector-17  | Rs. 20 |   "+available[1]+"     **");
                        System.out.println("** 2.)Sector-43  | Rs. 30 |   "+available[2]+"     **");
                        System.out.println("** 3.)Landran    | Rs. 10 |   "+available[3]+"     **");
                        System.out.println("** 4.)Sirhind    | Rs. 20 |   "+available[4]+"     **");
                        System.out.println("** 5.)Sector-21  | Rs. 25 |   "+available[5]+"     **");
                        System.out.println("***************************************");
                        System.out.println("***************************************\n");
                        System.out.println("PWD, STUDENT, & SENIOR CITIZEN with 50% DISCOUNT!!!\n");    
                        x=0;
                    }
                    
                    else if (choice.equals("2")){
                        int print=1;
                        System.out.println("***************************************");
                        System.out.println("**   DESTINATION   |  FARE  |  SEAT  **");
                        System.out.println("***************************************");
                        System.out.println("** 1.)Sector-17  | Rs. 20 |   "+available[1]+"     **");
                        System.out.println("** 2.)Sector-43  | Rs. 30 |   "+available[2]+"     **");
                        System.out.println("** 3.)Landran    | Rs. 10 |   "+available[3]+"     **");
                        System.out.println("** 4.)Sirhind    | Rs. 20 |   "+available[4]+"     **");
                        System.out.println("** 5.)Sector-21  | Rs. 25 |   "+available[5]+"     **");
                        System.out.println("***************************************");
                        System.out.println("***************************************\n");
                        System.out.println("PWD, STUDENT, & SENIOR CITIZEN with 50% DISCOUNT!!!\n");    
                        
                        if((available[1]==0)&&(available[2]==0)&&(available[3]==0)&&(available[4]==0)&&(available[5]==0)){
                            System.out.println("Sorry, We don't  have available seats for all Destination!");
                            x=0;
                            
                        }
                        
                        else{
                        for(x=1; x==1;){
                            System.out.print("\nENTER PASSENGER'S NAME: ");
                            ticketS[z][0] = buf.readLine();
                            
                            x=0;
                            for(int l=0; l<z; l++){
                                if(ticketS[l][0].equalsIgnoreCase(ticketS[z][0])){
                                    System.out.println("Sorry, Passenger's name have already used!");
                                    x=1;
                                }
                            }
                        }
                        for(x=1; x==1;){
                            System.out.print("ENTER DESTINATION: ");
                            to = Integer.parseInt(buf.readLine());
                            
                            if(to<1 || to>5){
                                System.out.println("Invalid Input!");
                                x=1;
                            }
                            for(int d=1; d<=5; d++){
                                if(to==d){
                                    if(available[to]==0){
                                        System.out.println("Sorry, We don't have available seat!");
                                        x=1;
                                    }
                                    x=0;
                                }
                            }
                        }
                        
                        String dest[] = { " ", "Sector-17", "Sector-43", "Landran", "Sirhind", "Sector-21"};
                        double fare[] = { 0,20,30,10,20,25};
                        
                        ticketS[z][1] = dest[to];
                        ticketD[z][0] = fare[to];
                        
                        for(x=1; x==1;){
                        System.out.print("HOW MANY PASSENGERS ARE YOU?: ");
                        ticketI[z][0] = Integer.parseInt(buf.readLine());
            
                            for(int p=1; p<=5; p++){
                                if(to==p){
                                    print=1;
                                    available[to] = available[to]-ticketI[z][0];
                                    
                                    if(available[to]<0){
                                        System.out.print("Sorry, We don't have seat available for " +ticketI[z][0] +" person\n");
                                        available[to] = available[to]+ticketI[z][0];
                                        System.out.print("We only have " +available[to] +" seat available\n");
                                        x=1;
                                        print=0;
                                    }
                                    else{
                                        x=0;
                                    }
                                }
                            }
            
                        }
                        
                        for(x=1;x==1;){
                            System.out.print("HOW MANY PASSENGERS HAVE DISCOUNT?: ");
                            ticketI[z][1] = Integer.parseInt(buf.readLine());
                        
                            if(ticketI[z][1]>ticketI[z][0]){
                                
                                System.out.println("Invalid Input!");
                                System.out.println("No. of Passengers are only " +ticketI[z][0] +"!");
                            x=1;
                            }
                            else{
                                break;
                            }
                        }
            
                        if(print==1){
                            System.out.println("\n***************************************");
                            System.out.println("**        PASSENGER'S DETAILS        **");
                            System.out.println("***************************************");
                            System.out.println("PASSENGER'S NAME: " + ticketS[z][0]);
                            System.out.println("PASSENGER'S DESTINATION : " + ticketS[z][1]);
                            System.out.println("FARE PRICE: Rs " + ticketD[z][0]);
                            System.out.println("NO. OF PASSENGERS: " + ticketI[z][0]);
                            System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[z][1]);
                            System.out.println("***************************************");
                            System.out.println("***************************************\n");
                            ticketS[z][2]="0";
                            double discount=(ticketD[z][0]-(ticketD[z][0]*0.5))*ticketI[z][1];
                            ticketD[z][2]= ((ticketI[z][0]-ticketI[z][1])*ticketD[z][0])+discount;
                            x=0;
                        }
                        z++;
                        }
                    }
                    
                    else if (choice.equals("3")){
                      
                        
                        for(x=1; x==1;){
                            
                                System.out.print("ENTER PASSENGER'S NAME: ");
                                search = buf.readLine();
                                
                                
                                int s=1;
                                for(int b=0;b<z;b++){
                                    if(search.equalsIgnoreCase(ticketS[b][0])){
                                        System.out.println("***************************************");
                                        System.out.println("**        PASSENGER'S DETAILS        **");
                                        System.out.println("***************************************");
                                        System.out.println("PASSENGER'S NAME: " + ticketS[b][0]);
                                        System.out.println("PASSENGER'S DESTINATION : " + ticketS[b][1]);
                                        System.out.println("FARE PRICE: Rs" + ticketD[b][0]);
                                        System.out.println("NO. OF PASSENGERS: " + ticketI[b][0]);
                                        System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[b][1]);
                                        System.out.println("***************************************");
                                        System.out.println("***************************************");
                                        s=0;
                                        x=0;
                                        
                                        if(ticketS[b][2].equals("x")){
                                            System.out.println("Passenger's Already Paid!");
                                            x=0;
                                        }
                                        else{
                                            ticketS[b][2]="x";
                                            
                                        
                                            for(x=1; x==1;){
                                                System.out.println("\nPASSENGER'S TOTAL FARE: Rs "+ticketD[b][2]);
                                                System.out.print("ENTER AMOUNT TO PAY: ");
                                                pay[b] = Double.parseDouble(buf.readLine());
                                                change[b]=pay[b]-ticketD[b][2];
                                    
                                                if(change[b]<0){
                                                    System.out.println("Invalid Input!");
                                                    x=1;
                                                }
                                                else{
                                                    System.out.println("CHANGE: Rs "+change[b]);
                                                    System.out.println("");
                                                    x=0;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (s==1){
                                    System.out.println("\nPASSENGER'S NAME NOT FOUND!\n");
                                    for(int q=1; q==1;){
                                    
                                    System.out.print("Do you wish to continue with this transaction? [Y/N]: ");
                                    again=buf.readLine();
                                    
                                    if(again.equalsIgnoreCase("y")){
                                        q=0;
                                    }
                                    else if (again.equalsIgnoreCase("n")){
                                        q=0;
                                        x=0;
                                        
                                    }
                                    else{
                                        System.out.println("\nInvalid input!\n");
                                    }
                                
                        
                                }
                            }    
                        }
                        
                    }
                    
                    else if (choice.equals("4")){
                        
                        
                        for(int sx=1; sx<=3;){
                         System.out.print("SEARCH PASSENGER'S NAME: ");
                        search = buf.readLine();
                
                            int s=1;
                            for(x=0; x<=z; x++){
                                if(search.equalsIgnoreCase(ticketS[x][0])){
                                    System.out.println("***************************************");
                                    System.out.println("**        PASSENGER'S DETAILS        **");
                                    System.out.println("***************************************");
                                    System.out.println("PASSENGER'S NAME: " + ticketS[x][0]);
                                    System.out.println("PASSENGER'S DESTINATION : " + ticketS[x][1]);
                                    System.out.println("FARE PRICE: Rs " + ticketD[x][0]);
                                    System.out.println("NO. OF PASSENGERS: " + ticketI[x][0]);
                                    System.out.println("NO. OF PASSENGERS WITH DISCOUNT: " + ticketI[x][1]);
                                    System.out.println("TOTAL FARE PRICE: Rs " + ticketD[x][2]);
                                    if(ticketS[x][2].equals("x")){
                                        System.out.println("PAY: Rs " +pay[x]);
                                        System.out.println("CHANGE: Rs " +change[x]);
                                        System.out.println("STATUS: PAID");
                                    }
                                    else{
                                        System.out.println("STATUS: NOT PAID");
                                    }
                                    System.out.println("***************************************");
                                    System.out.println("***************************************");
                                    s=0;
                                    sx=4;
                                }
                            }    
                        
                            
                            if (s==1){
                                System.out.println("Passenger's Name not found!");
                                sx++;
                            }
                            
                        }
                    }        
                    
                    else if(choice.equals("5")){
                        end=1;
                        x=0;
                        System.out.println("Thank You!");
                    }
                
                    else{
                        System.out.println("Invalid Input!");
                        x=1;
                    }
                }
        
                for(y=1; y==1;){
                    if(end==1){
                        break;
                    }
                    System.out.print("Do you want another transaction? [Y/N]: ");
                        yn = buf.readLine();
        
                    if (yn.equalsIgnoreCase("y")){
                        x=1;
                        y=0;
                    }
                    else if (yn.equalsIgnoreCase("n")){
                        System.out.println("\nThank You!!!");
                        break;
                    }
                    else{
                        System.out.println("Invalid Input!!!");
                        y=1;
                    }
                }
            }
            i=4;
        }
        else{
            System.out.println("\nInvalid user or password!\n");
            i++;
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        BusReservationAndTicketingSystem obj=new BusReservationAndTicketingSystem();
        obj.reservation();
    }
}