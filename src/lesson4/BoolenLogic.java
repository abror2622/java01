package lesson4;

public class  BoolenLogic {
    public static void main(String[] args) {
        //Сынок купил хлеб
        boolean isBougtBread = true;
        //Сынок купил молоко
        boolean isBoughtMilk = true;

        //And -Логический И, если  два значение true, то тогда true, иначе fale
        boolean isBoughtMilkandBread = isBougtBread && isBoughtMilk;
        //boolean isBoughtMilkandBread = true && true;
        //boolean isBoughtMilkandBread = true;

        //boolean isBoughtMilkandBread = false && false;
        //boolean isBoughtMilkandBread = false;

        if (isBougtBread && isBoughtMilk) {
            System.out.println("Моладец сынок,купил хлеб и молоко");
        } else if (isBoughtMilk) {
            System.out.println(" молодец сынок, хотя бы купил молоко");
        } else if (isBougtBread) {
            System.out.println(" молодец сынок, хотя бы купил хлеб");
        } else {
            System.out.println("сынок ты не молодец,хлеб нет и молоко нет");
        }

        //Or - Логическое или, если хотя бы одно значене true, то тогда true, и если все значения false,
        //то тогда false
        boolean isBougtmilkorBread = true || true;
        //boolean  isBougtmilkorBread = true;
        // boolean isBougtmilkorBread = true || false;
        //boolean  isBougtmilkorBread = true;
        // boolean isBougtmilkorBread = false || false;
        // boolean isBougtmilkorBread = false;


        //Not - Логическое не, которое переворачивает true на false и наобарот
        //Купил сладость или нет
        boolean isBoughtCandy = false;

        if (!isBoughtCandy) {
            System.out.println("мама хвалит сына");
        }
    }
}