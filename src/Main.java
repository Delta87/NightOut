import utils.Tools;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        //Task 1:
        int volumeOfGlas = Tools.getRandomNumber(1, 250);

        //Optional task:
        int numberofGlasses = Tools.getRandomNumber(1, 10);
        Tools.printFormat("---------------Debuginformation---------------");
        Tools.printFormat("Volume of our glas: %i", volumeOfGlas);
        Tools.printFormat("Number of orderd glases: %i", numberofGlasses);
        Tools.printFormat("----------------------------------------------");
        Tools.printFormat("");


        if(volumeOfGlas == 250)
        {
            Tools.printFormat("This glas is full");
        }else if(volumeOfGlas <= 249 && volumeOfGlas >= 20)
            Tools.printFormat("This glas is not full");
        else if(volumeOfGlas <= 19)
        {
            Tools.printFormat("This glas is near empty, barkeeper a new one");
            numberofGlasses++;
        }
        Tools.printFormat(" ");

        //Task 2 (optional)
        if(numberofGlasses < 4)
        {
            //Task 2
            int hittetPins = Tools.getRandomNumber(1,10);

            if(hittetPins == 0)
                Tools.printFormat("Miss");
            else if(hittetPins >=1 && hittetPins <= 3)
                Tools.printFormat("Schwacher Treffer");
            else if(hittetPins >= 4 && hittetPins <=6)
                Tools.printFormat("Normaler Treffer");
            else if(hittetPins >=7 && hittetPins <=9)
                Tools.printFormat("Guter Treffer");
            else if(hittetPins == 10)
                Tools.printFormat("X - Strike!!!");
        }
        Tools.printFormat(" ");

        //Task 3
        int sitUpsCounter = 0;

        Tools.printFormat("-- For loop -- \n");
        for (int i = 0; i <= 20; i++)
        {
            Tools.printFormat("%i!", i);
            if(i == 10)
                Tools.printFormat("Phu ich hoffe das ist bald vorbei");
            else if(i == 15)
                Tools.printFormat("Ich glaub ich schaff das nicht");
            else if(i == 19)
                Tools.printFormat("JA ICH SCHAFFE ES!!!!!");
            else if(i == 20)
                Tools.printFormat("OLEOLEOLEEEEE");
        }
        Tools.printFormat(" ");

        Tools.printFormat("-- While loop --\n");
        while(sitUpsCounter < 20)
        {
            sitUpsCounter++;
            Tools.printFormat("%i!", sitUpsCounter);
            if(sitUpsCounter == 10)
                Tools.printFormat("Phu ich hoffe das ist bald vorbei");
            else if(sitUpsCounter == 15)
                Tools.printFormat("Ich glaub ich schaff das nicht");
            else if(sitUpsCounter == 19)
                Tools.printFormat("JA ICH SCHAFFE ES!!!!!");
            else if(sitUpsCounter == 20)
                Tools.printFormat("OLEOLEOLEEEEE");
        }
        Tools.printFormat(" ");



        sitUpsCounter = 0;
        Tools.printFormat("-- Do while loop -- \n");
        do
        {
            sitUpsCounter++;
            Tools.printFormat("%i!", sitUpsCounter);
            if(sitUpsCounter == 10)
                Tools.printFormat("Phu ich hoffe das ist bald vorbei");
            else if(sitUpsCounter == 15)
                Tools.printFormat("Ich glaub ich schaff das nicht");
            else if(sitUpsCounter == 19)
                Tools.printFormat("JA ICH SCHAFFE ES!!!!!");
            else if(sitUpsCounter == 20)
                Tools.printFormat("OLEOLEOLEEEEE");
        } while(sitUpsCounter < 20);
        Tools.printFormat(" ");


        // Task 4

        switch(numberofGlasses)
        {
            case 1:
                printCaseOne();
            break;
            case 2:
            case 3:
                printCaseTwo();
            break;
            default:
                printCaseThree(numberofGlasses);
            break;
        }

        //Task 5
        List orderedGlasses = new ArrayList();
        int numberOfOrderedGlasses = Tools.getRandomNumber(1,5);

        for (int i = 0; i < numberOfOrderedGlasses; i++) {
            orderedGlasses.add(Tools.getRandomNumber(1, 250));
        }

        int listSize = orderedGlasses.size();
        Tools.printFormat("Number of glasses in list: %i", listSize);

        for (int i = 0; i < listSize; i++)
        {
            int VolOfGlassInList = (int)orderedGlasses.get(i);
            if(VolOfGlassInList == 250)
            {
                Tools.printFormat("This glas is full - (%i ml)", VolOfGlassInList);
            }else if(VolOfGlassInList <= 249 && VolOfGlassInList >= 20)
                Tools.printFormat("This glas is not full - (%i ml)", VolOfGlassInList);
            else if(VolOfGlassInList <= 19)
            {
                Tools.printFormat("This glas is near empty, barkeeper a new one - (%i ml)", VolOfGlassInList);
            }
        }
        Tools.printFormat(" ");

        //Task 6

        List BowlTrys = new ArrayList();
        int numberOfTrys = Tools.getRandomNumber(10,25);

        for (int i = 0; i < numberOfTrys; i++) {
            BowlTrys.add(Tools.getRandomNumber(0, 10));
        }

        int BowListSize = BowlTrys.size();

        for (int i = 0; i < BowListSize; i++)
        {
            int PinHits = (int)BowlTrys.get(i);
            if(PinHits == 0)
                Tools.printFormat("(%i) - Miss", PinHits);
            else if(PinHits >=1 && PinHits <= 3)
                Tools.printFormat("(%i) - Schwacher Treffer", PinHits);
            else if(PinHits >= 4 && PinHits <=6)
                Tools.printFormat("(%i) - Normaler Treffer", PinHits);
            else if(PinHits >=7 && PinHits <=9)
                Tools.printFormat("(%i) - Guter Treffer", PinHits);
            else if(PinHits == 10)
                Tools.printFormat("(%i) - X - Strike!!!", PinHits);
        }
    }


    private static void printCaseOne()
    {
        Tools.printFormat("Duschen");
        Tools.printFormat("Zähne putzen");
        Tools.printFormat("Schlafkleidung anziehen");
        Tools.printFormat(" ");
    }

    private static void printCaseTwo()
    {
        printCaseOne();
        int numberofCookies = Tools.getRandomNumber(1, 10);
        Tools.printFormat("Kühlschrank gehen");
        Tools.printFormat("Anzahl Kekse im Kühlschrank: %i", numberofCookies);

        for (int i = 1; i < numberofCookies; i++) {
            Tools.printFormat("Keks %i gegessen", i);
        }
        Tools.printFormat(" ");
    }

    private static void printCaseThree(int pNumOfDrinks)
    {
        Tools.printFormat("Versuche Stufen zu steigen");
        int numberOfStairs = 15 - pNumOfDrinks;

        for (int i = 1; i < numberOfStairs; i++) {
            Tools.printFormat("Stufe %i erklommen", i);
        }
        Tools.printFormat("Jetzt muss ich schlafen");
        Tools.printFormat(" ");

    }








}
