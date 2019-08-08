import utils.Tools;

public class Main {

    public static void main(String[] args)
    {
        //TODO: Create a class for a Person.

        //Task 1:
        int volumeOfGlas = Tools.getRandomNumber(1, 250);

        //Optiona task:
        int numberofGlasses = Tools.getRandomNumber(1, 10);
        System.out.println("---------------Debuginformation---------------");
        System.out.printf("Volume of our glas: %s\n", volumeOfGlas);
        System.out.printf("Number of orderd glases: %s\n", numberofGlasses);
        System.out.println("----------------------------------------------");
        System.out.println("");


        if(volumeOfGlas == 250)
        {
            System.out.println("This glas is full");
        }else if(volumeOfGlas <= 249 && volumeOfGlas >= 20)
            System.out.println("This glas is not full");
        else if(volumeOfGlas <= 19)
        {
            System.out.println("This glas is near empty, barkeeper a new one");
            numberofGlasses++;
        }

        Tools.printFormat("das is ein test für float: %f", 1.2f, 3);
        Tools.printFormat("das is ein test für int: %i", 1);
        Tools.printFormat("das is ein test für double: %d", 1.2d, 5);

        //Task 2 (optional)
        if(numberofGlasses < 4)
        {
            //Task 2
            int hittetPins = Tools.getRandomNumber(1,10);

            if(hittetPins == 0)
                Tools.printFormat("Miss");
            else if(hittetPins >=1 && hittetPins <= 3)
                Tools.printFormat("Schwacher Trefer");
            else if(hittetPins >= 4 && hittetPins <=6)
                Tools.printFormat("Normaler Treffer");
            else if(hittetPins >=7 && hittetPins <=9)
                Tools.printFormat("Guter Treffer");
            else if(hittetPins == 10)
                Tools.printFormat("X - Strike!!!");






        }
    }
}
