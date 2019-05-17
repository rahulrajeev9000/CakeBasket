import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {

   // creates a list of instances of the Cake class which will act as the basket
    public List<Cake> cakeList = new ArrayList<Cake>();

    public void shopping() {
        //Set boolean for the while loop that allows for the program to be continously running
        Boolean shop = true;
        while (shop) {
            //typing the options exactly as seen within the quotation marks then entering allows for the if statements to be executed
            System.out.println("Choose whether you want to 'add', 'view', 'remove', 'remove all' or 'checkout' cake");
            Scanner choose = new Scanner(System.in);
            String option = choose.nextLine();
            if (option.equals("add")) {
                addCake();
            }
            if (option.equals("view")){
                viewCakes();
            }
            if (option.equals(("checkout"))){
                checkout();
            }
            if (option.equals(("remove"))){
                remove();
            }
            if (option.equals(("remove all"))){
                removeAll();
            }
            if (option.equals("quit")){
                choose.close();
                shop = false;
            }
        }
    }
    public void addCake(){

        //hardcoding instances of the cake class
        Cake chocsponge = new Cake("Chocolate Sponge", "Chocolate", 124, "Spain", 15);
        Cake cheescake = new Cake("Cheese Sponge", "cheese", 124, "UK",15);
        Cake vanilla = new Cake("vanilla", "cheese", 124, "France", 15);
        Cake muffin = new Cake("muffin", "cheese", 124, "Italy",15);
        Cake victoriasponge = new Cake("victoria Sponge", "Chocolate", 124, "Spain", 15);
        Cake c2 = new Cake("Cheese Sponge", "cheese", 124, "UK",15);
        Cake c7 = new Cake("vanilla", "cheese", 124, "France", 15);
        Cake c9 = new Cake("muffin", "cheese", 124, "Italy",15);
        Cake c20 = new Cake("Chocolate Sponge", "Chocolate", 124, "Spain", 15);
        Cake c34 = new Cake("Cheese Sponge", "cheese", 124, "UK",15);
        Cake d3 = new Cake("vanilla", "cheese", 124, "France", 15);
        Cake c5 = new Cake("muffin", "cheese", 124, "Italy",15);

        // adding cakes to the basket
        cakeList.add(chocsponge);
        cakeList.add(cheescake);
        cakeList.add(vanilla);
        cakeList.add(muffin);
        cakeList.add(c2);
        cakeList.add(c7);
        cakeList.add(c9);
        cakeList.add(c20);
        cakeList.add(c34);
        cakeList.add(d3);
        cakeList.add(c5);
        cakeList.add(victoriasponge);

    }
    public void viewCakes(){
        //view a list of cakes that are in the basket with all their details
        for (int i =0; i<cakeList.size(); i++) {
            System.out.println("Name: "+cakeList.get(i).getName()
                    +",  Flavour: "+cakeList.get(i).getFlavour()
                    +",  Sugar: "+cakeList.get(i).getSugar()+"g"
                    +",  Origin: "+cakeList.get(i).getOrigin()
                    +",  Price: £"+cakeList.get(i).getPrice());

        }System.out.println();
        System.out.println();

    }
    public void remove(){
        //When removing, a list of the names of cakes the basket will appear and then the user can type of the name of a cake to remove it
        Scanner rm = new Scanner(System.in);
        System.out.println("Type in the name of cake that you want to remove");
        for (int i = 0; i<cakeList.size(); i++){
            System.out.println(cakeList.get(i).getName());
        }
        String name = rm.nextLine();
        for (int i = 0; i<cakeList.size(); i++){
            if (cakeList.get(i).getName().equals(name)){
                cakeList.remove(cakeList.get(i));
            }
        }

    }
    public void removeAll(){
        for (int i = 0; i < cakeList.size(); i++){
            //cakeList.remove(cakeList.get(i));
            cakeList.removeAll(cakeList);
        }
    }

    public void checkout() {
        //this part of the method calculates the discount based on the number of items in the basket
        double discount = 0d;
        int cakeCount = cakeList.size();
        if (cakeCount >= 3 && cakeCount < 10) {
            discount = (cakeCount / 3) * 0.01;
        }
        if (cakeCount >= 10 && cakeCount < 90) {
            discount = ((cakeCount / 3) * 0.01) + 0.1;
        }

        // the bill will print out the names and the price of each item and then the total sum before discount and total sum after discount
        double discSum = 0;
        double sum = 0;
        DecimalFormat df = new DecimalFormat("#,###.00");
        for (int i = 0; i < cakeList.size(); i++) {
            discSum += (cakeList.get(i).getPrice()* (1 - discount));
            sum += (cakeList.get(i).getPrice());
            System.out.println(cakeList.get(i).getName()+"    £"+cakeList.get(i).getPrice());
        }
        System.out.println();
        System.out.println("****************************************************");
        System.out.println();
        System.out.println("Total price before discount: £" + df.format(sum));
        System.out.println("-----------------------------------------------------");
        System.out.println("Total price after discount: £" + df.format(discSum));
        System.out.println("-----------------------------------------------------");
        System.out.println();
    }
}
