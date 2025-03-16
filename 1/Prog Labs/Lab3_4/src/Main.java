import arraylists.Pot;
import enums.Locations;
import enums.Moods;
import enums.Sizes;
import records.Soil;
import records.Stone;
import persons.Carlson;
import persons.Kid;
import records.Flower;

public class Main {
    public static void main(String[] args) {
        //set up environments
        System.out.println("SETTING UP THE ENVIRONMENT");
        Carlson carlson = new Carlson("Carlson", Locations.UNDER_THE_TABLE, Moods.EXCITED);
        Kid kid = new Kid("Theon", Locations.MIDDLE_OF_THE_ROOM, Moods.NONE);

        Stone stone = new Stone(Sizes.LARGE, "rough", "dark red");
        Soil soil = new Soil("smooth", " dark brown");
        Flower flower = new Flower("begonia");

        Pot pot = new Pot();
        pot.addToPot(soil);
        pot.addToPot(flower);
        //pot.addToPot(kid);
        //pot.removeFromPot(stone);

        //start the story
        System.out.println("\n PLOT STARTED");
        carlson.crawl(kid.getLocation()); //Carlson crawled to the kids location

        carlson.thrust(stone, kid);

        boolean tookTheStone = carlson.took(stone, kid);

        if(tookTheStone){
            kid.changeMood(Moods.CONFUSED); // the kid got confused if Carlson did thrust the stone
        }

        carlson.walk(Locations.BY_THE_WINDOW); //Carlson goes to the window

        boolean flowerUprooted = carlson.uproot(flower, pot);  //Carlson uproots the flower


        if(flowerUprooted) {
            carlson.threw(flower, Locations.OUT_THE_WINDOW);
            if (carlson.putInPot(stone, pot)) { //Carlson put the stone in the pot
                carlson.cluck(Moods.JOY);
            }
        }
    }
}