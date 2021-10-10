package week4homework;

import java.util.*;

public class Products  {
    String name;
    String desc;
    double price;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }



    double discountedPrice;
    String category;
    String subCategory;

    Products (String name, String desc, double price, double discountedPrice, String category, String subCategory){
        this.name=name;
        this.desc=desc;
        this.price=price;
        this.discountedPrice=discountedPrice;
        this.category=category;
        this.subCategory=subCategory;
    }
    /*
    Products Elma=new Products("Elma","Elma - 1kg", 5.0, 4.5, "Meyve&Sebze", "Meyve");
    Products Armut=new Products("Armut","Armut - 1kg", 10.0, 5.0, "Meyve&Sebze", "Meyve");
    Products Uzum=new Products("Üzüm","Üzüm - 1kg", 8.5, 6.5, "Meyve&Sebze", "Meyve");
    Products Domates=new Products("Domates","Domates - 1kg", 7.0, 6.5, "Meyve&Sebze", "Sebze");
    Products Biber=new Products("Biber","Biber - 0.5kg", 4.0, 3.5, "Meyve&Sebze", "Sebze");
    Products Patlican=new Products("Patlıcan","Patlıcan - 1kg", 9.0, 7.0, "Meyve&Sebze", "Sebze");
    Products Lays=new Products("Lays","Lays Fırından", 7.0, 6.5, "Atıştırmalık", "Cips");
    Products Doritos=new Products("Doritos","Doritos Nacho", 6.5, 6.5, "Atıştırmalık", "Cips");
    Products Ruffles=new Products("Ruffles","Ruffles Original", 7.0, 7.0, "Atıştırmalık", "Cips");
    Products Tadelle=new Products("Tadelle","Tadelle Çikolata", 2.0, 2.0, "Atıştırmalık", "Çikolata");
    Products Albeni=new Products("Albeni","Albeni Çikolata", 3.0, 2.75, "Atıştırmalık", "Çikolata");
    Products Metro=new Products("Metro","Metro Çikolata", 2.5, 2.5, "Atıştırmalık", "Çikolata");
    Products Hobby=new Products("Hobby","Hobby Çikolata", 1.5, 1.0, "Atıştırmalık", "Çikolata");
    Products TamYagli=new Products("Sütaş Tam Yağlı","Sütaş Tam Yağlı Süt - 1lt", 5.5, 5.0, "Kahvaltılık", "Süt");
    Products YarimYagli=new Products("Sütaş Yarım Yağlı","Sütaş Yarım Yağlı Süt - 1lt", 6.5, 6.0, "Kahvaltılık", "Süt");
    Products Laktozsuz=new Products("Sütaş Laktozsuz","Sütaş Laktozsuz Süt - 1lt", 8.5, 8.0, "Kahvaltılık", "Süt");
    Products Kasar=new Products("Sütaş Kaşar","Sütaş Kaşar Peynir - 500gr", 20.0, 20.0, "Kahvaltılık", "Şarküteri");
    Products Peynir=new Products("Sütaş Beyaz Peynir","Sütaş Beyaz Peynir - 900gr", 30.0, 28.0, "Kahvaltılık", "Şarküteri");
    Products Salam=new Products("Dana Salam","Dana Salam Açbitir - 60gr", 3.5, 3.0, "Kahvaltılık", "Şarküteri");
    Products Sucuk=new Products("Sucuk","Kangal Sucuk", 35.5, 33.0, "Kahvaltılık", "Şarküteri");
    Products Zeytin=new Products("Yeşil Zeytin"," Yeşil Zeytin - 500gr", 20.5, 20.5, "Kahvaltılık", "Şarküteri");
*/
}
