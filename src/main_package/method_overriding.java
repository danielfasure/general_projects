package main_package;

class mall {
    String mall_name;
    String type_of_good;
    int number_of_floors;
    int cost;

    int increase_cost(int cost,int store_cost){
        this.cost = cost;
       return cost-store_cost ;
    }
}
class Sport_Stores{
    int store_budget;

    int increase_cost(int store_budget,int store_cost){
        this.store_budget = store_budget;
        return store_budget-store_cost ;
    }
    String type_of_sports_good;
    int year_founded;
}

public class method_overriding {
    public static void main(String[] args) {
      Sport_Stores sport_stores = new Sport_Stores();

    }
}
