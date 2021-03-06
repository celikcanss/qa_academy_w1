package week4homework;

import week3homework.Person;

import java.util.*;

public class User {

    private String name;
    private int tel;
    private String adress;
    private int password;
    List<Products> basket = new ArrayList<>();


    public String getName() {
        return name;
    }

    public int getTel() {
        return tel;
    }

    public String getAdress() {
        return adress;
    }

    public int getPassword() {
        return password;
    }

    public User(String name, int tel, String adress, int password) {
        this.name = name;
        this.tel = tel;
        this.adress = adress;
        this.password = password;


    }



    public void login(int givenTel, int givenPassword) {

            if(givenTel==getTel()&&givenPassword==getPassword()){
                System.out.println("Successful login!");
                System.out.println("");
                landingPage();

            }
            else {
                System.out.println("Your phone number or password is incorrect, please try again.");
                System.out.println("");
            }



    }

    public void landingPage(){
        List landingPageOptions = new ArrayList();
        landingPageOptions.add("Homepage");
        landingPageOptions.add("Search Product");
        landingPageOptions.add("Profile");


        for (int i=0;i<=2;i++) {
            System.out.println(landingPageOptions.get(i));
        }
        System.out.println("Enter a number to go to relevant page");
        Scanner scanner1 = new Scanner(System.in);
        int landingPageChoice = scanner1.nextInt();

        if(landingPageChoice==1){
            homepage();
        }
        else if(landingPageChoice==2){
            searchProduct();
        }
        else if(landingPageChoice==3){
            profile();
        }
    }

    public void profile(){
        System.out.println("Profile");
        System.out.println(getName());
        System.out.println(getTel());
        System.out.println(getAdress());

        System.out.println("Do you want to change user(1) or continue(2)? (1/2)");
        Scanner scanner1 = new Scanner(System.in);
        int switchUser = scanner1.nextInt();
        if (switchUser==2){
            landingPage();
        }



    }




    public void homepage() {
        List categories = new ArrayList();

        categories.add("Meyve&Sebze");
        categories.add("At????t??rmal??k");
        categories.add("Kahvalt??l??k");

        List subCategories1 = new ArrayList();

        subCategories1.add("Meyve");
        subCategories1.add("Sebze");


        List subCategories2 = new ArrayList();

        subCategories2.add("Cips");
        subCategories2.add("??ikolata");


        List subCategories3 = new ArrayList();
        subCategories3.add("S??t");
        subCategories3.add("??ark??teri");

        Products Elma = new Products("Elma", "Elma - 1kg", 5.0, 4.5, "Meyve&Sebze", "Meyve");
        Products Armut = new Products("Armut", "Armut - 1kg", 10.0, 5.0, "Meyve&Sebze", "Meyve");
        Products Uzum = new Products("??z??m", "??z??m - 1kg", 8.5, 6.5, "Meyve&Sebze", "Meyve");
        Products Domates = new Products("Domates", "Domates - 1kg", 7.0, 6.5, "Meyve&Sebze", "Sebze");
        Products Biber = new Products("Biber", "Biber - 0.5kg", 4.0, 3.5, "Meyve&Sebze", "Sebze");
        Products Patlican = new Products("Patl??can", "Patl??can - 1kg", 9.0, 7.0, "Meyve&Sebze", "Sebze");
        Products Lays = new Products("Lays", "Lays F??r??ndan", 7.0, 6.5, "At????t??rmal??k", "Cips");
        Products Doritos = new Products("Doritos", "Doritos Nacho", 6.5, 6.5, "At????t??rmal??k", "Cips");
        Products Ruffles = new Products("Ruffles", "Ruffles Original", 7.0, 7.0, "At????t??rmal??k", "Cips");
        Products Tadelle = new Products("Tadelle", "Tadelle ??ikolata", 2.0, 2.0, "At????t??rmal??k", "??ikolata");
        Products Albeni = new Products("Albeni", "Albeni ??ikolata", 3.0, 2.75, "At????t??rmal??k", "??ikolata");
        Products Metro = new Products("Metro", "Metro ??ikolata", 2.5, 2.5, "At????t??rmal??k", "??ikolata");
        Products Hobby = new Products("Hobby", "Hobby ??ikolata", 1.5, 1.0, "At????t??rmal??k", "??ikolata");
        Products TamYagli = new Products("S??ta?? Tam Ya??l??", "S??ta?? Tam Ya??l?? S??t - 1lt", 5.5, 5.0, "Kahvalt??l??k", "S??t");
        Products YarimYagli = new Products("S??ta?? Yar??m Ya??l??", "S??ta?? Yar??m Ya??l?? S??t - 1lt", 6.5, 6.0, "Kahvalt??l??k", "S??t");
        Products Laktozsuz = new Products("S??ta?? Laktozsuz", "S??ta?? Laktozsuz S??t - 1lt", 8.5, 8.0, "Kahvalt??l??k", "S??t");
        Products Kasar = new Products("S??ta?? Ka??ar", "S??ta?? Ka??ar Peynir - 500gr", 20.0, 20.0, "Kahvalt??l??k", "??ark??teri");
        Products Peynir = new Products("S??ta?? Beyaz Peynir", "S??ta?? Beyaz Peynir - 900gr", 30.0, 28.0, "Kahvalt??l??k", "??ark??teri");
        Products Salam = new Products("Dana Salam", "Dana Salam A??bitir - 60gr", 3.5, 3.0, "Kahvalt??l??k", "??ark??teri");
        Products Sucuk = new Products("Sucuk", "Kangal Sucuk", 35.5, 33.0, "Kahvalt??l??k", "??ark??teri");
        Products Zeytin = new Products("Ye??il Zeytin", " Ye??il Zeytin - 500gr", 20.5, 20.5, "Kahvalt??l??k", "??ark??teri");


        List<Products> meyve = new ArrayList();
        meyve.add(Elma);
        meyve.add(Armut);
        meyve.add(Uzum);
        List<Products> sebze = new ArrayList();
        sebze.add(Domates);
        sebze.add(Biber);
        sebze.add(Patlican);
        List<Products> cips = new ArrayList<>();
        cips.add(Lays);
        cips.add(Doritos);
        cips.add(Ruffles);
        List<Products> cikolata = new ArrayList();
        cikolata.add(Tadelle);
        cikolata.add(Albeni);
        cikolata.add(Metro);
        cikolata.add(Hobby);
        List<Products> sut = new ArrayList<>();
        sut.add(TamYagli);
        sut.add(YarimYagli);
        sut.add(Laktozsuz);
        List<Products> sarkuteri = new ArrayList<>();
        sarkuteri.add(Kasar);
        sarkuteri.add(Peynir);
        sarkuteri.add(Salam);
        sarkuteri.add(Sucuk);
        sarkuteri.add(Zeytin);


        System.out.println("Categories:");
        for (int i=0;i<=2;i++) {
            System.out.println(categories.get(i));
        }
        System.out.println("Enter a number to go to relevant category");
        Scanner scanner5 = new Scanner(System.in);
        int chosenCategory = scanner5.nextInt();
        List<Products> chosenList = null;

        if (chosenCategory == 1) {
            System.out.println("Subcategories:");
            for (int i=0;i<=1;i++) {
                System.out.println(subCategories1.get(i));
            }
            System.out.println("Enter a number to go to relevant subcategory");
            Scanner scanner2 = new Scanner(System.in);
            int chosenSubCategory = scanner2.nextInt();

            if (chosenSubCategory == 1) {
                chosenList = meyve;
            } else if (chosenSubCategory == 2) {
                chosenList = sebze;
            }

        } else if (chosenCategory == 2) {
            System.out.println("Subcategories:");
            for (int i=0;i<=1;i++) {
                System.out.println(subCategories2.get(i));
            }
            System.out.println("Enter a number to go to relevant subcategory ");
            Scanner scanner3 = new Scanner(System.in);
            int chosenSubCategory = scanner3.nextInt();

            if (chosenSubCategory == 1) {
                chosenList = cips;
            } else if (chosenSubCategory == 2) {
                chosenList = cikolata;
            }

        } else if (chosenCategory == 3) {
            System.out.println("Subcategories:");
            for (int i=0;i<=1;i++) {
                System.out.println(subCategories3.get(i));
            }
            System.out.println("Enter a number to go to relevant subcategory ");
            Scanner scanner4 = new Scanner(System.in);
            int chosenSubCategory = scanner4.nextInt();
            if (chosenSubCategory == 1) {
                chosenList = sut;
            } else if (chosenSubCategory == 2) {
                chosenList = sarkuteri;
            }

        }


        System.out.println("Products:");
        for (Products product : chosenList) {
            System.out.println(product.getName() + " " + product.getDiscountedPrice());
        }




            Products eklenecekUrun;
            System.out.println("Enter a number for add the product to basket");
            Scanner scanner6 = new Scanner(System.in);
            int chosenProduct = scanner6.nextInt();
            eklenecekUrun = chosenList.get(chosenProduct - 1);
            System.out.println("Chosen product detail:");
            System.out.println(eklenecekUrun.name + "    First Price:" + eklenecekUrun.price + "  Discounted Price:" + eklenecekUrun.discountedPrice + "  Description:" + eklenecekUrun.desc);


            System.out.println("How many do you want to add?");
            Scanner scanner7 = new Scanner(System.in);
            int numberOfProduct = scanner7.nextInt();


            for (int i = 1; i <= numberOfProduct; i++) {
                basket.add((Products) eklenecekUrun);
            }
            System.out.println("Do you want to go to basket(1) or landing page(2)?  (1/2)");
            Scanner scanner8 = new Scanner(System.in);
            int basketOrLanding = scanner8.nextInt();
            if (basketOrLanding == 1) {
                showBasket();
            } else if (basketOrLanding == 2) {
                landingPage();
            }



    }


        public void showBasket(){
            System.out.println("Basket is: ");
            double basketTotal = 0;
            double savedAmount = 0;
            int deliveryFee = 5;
            for (Products product : basket ) {
                savedAmount = savedAmount + (product.getPrice() - product.getDiscountedPrice());
                basketTotal = basketTotal + product.getPrice();
                System.out.println(product.getName() + "    First Price:" + product.getPrice() + "  Discounted Price:" + product.discountedPrice + "  Description:" + product.desc);
            }
            if (basketTotal >= 100 || basketTotal==0) {
                deliveryFee = 0;
            }
            double chargeAmount = basketTotal + deliveryFee;
            System.out.println("Basket total: " + basketTotal);
            System.out.println("You saved: " + savedAmount);
            System.out.println("Delivery fee: " + deliveryFee);
            System.out.println("Charge amount: " + chargeAmount);

            System.out.println("");
            System.out.println("Do you want to add anything else(1) or checkout(2)? (1/2)");
            Scanner scanner6 = new Scanner(System.in);
            int addMore = scanner6.nextInt();
            if (addMore==1){
                homepage();
            }
            else if(addMore==2){
                System.out.println("Checkout:");
                System.out.println("Charge amount: " + chargeAmount);
                System.out.println("");
                basket.clear();
                landingPage();

            }

    }



    public void searchProduct(){

      /*  List<Products> allProducts=new ArrayList<>();
        allProducts.add()

        System.out.println("How many do you want to add?");
        Scanner scanner7 = new Scanner(System.in);
        String search = scanner7.next();


        List<String> searchResults = new ArrayList<>();
        for (Products product : allProducts) {
            if (product.contains(search)) {
                searchResults.add(product);
            }*/


    }






}
