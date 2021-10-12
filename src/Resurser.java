import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Resurser {
    //Variabler
    int wood = 0;
    int gold = 0;
    int metal = 0;

    //updateResources metoden printer hvor mange resurser der er samlet. Den printer hvert femte sekund.
    public void updateResources() {
        final ScheduledExecutorService botScheduler = Executors.newScheduledThreadPool(1);
        final Runnable updateWoodPrSecond = new Runnable() {
            @Override
            public void run() {
                System.out.println("Amount of Wood: "+ wood);
                System.out.println("Amount of Gold: " + gold);
                System.out.println("Amount of Metal: "+ metal);
                System.out.println();
            }
        };
        final ScheduledFuture<?> updateWoodPrSecondHandle = botScheduler.scheduleWithFixedDelay(updateWoodPrSecond,0,5,SECONDS);
    }

    //wood() metoden giver os 1 wood(træ) hvert sekund.
    public void wood() {
        final ScheduledExecutorService botScheduler = Executors.newScheduledThreadPool(1);
        final Runnable woodPrSecond = new Runnable() {
            @Override
            public void run() {
                wood = wood + 1;
            }
        };
        final ScheduledFuture<?> woodPrSecondHandle = botScheduler.scheduleWithFixedDelay(woodPrSecond,0,1,SECONDS);
    }

    //gold() metoden giver os 1 gold hver andet sekund.
    public void gold() {
        final ScheduledExecutorService botScheduler = Executors.newScheduledThreadPool(1);
        final Runnable woodPrSecond = new Runnable() {
            @Override
            public void run() {
                gold = gold + 1;
            }
        };
        final ScheduledFuture<?> goldPrSecondHandle = botScheduler.scheduleWithFixedDelay(woodPrSecond,0,2,SECONDS);
    }

    //metal() metoden giver os 1 metal hvert 5 sekund.
    public void metal() {
        final ScheduledExecutorService botScheduler = Executors.newScheduledThreadPool(1);
        final Runnable metalPrSecond = new Runnable() {
            @Override
            public void run() {
                metal = metal + 1;
            }
        };
        final ScheduledFuture<?> goldPrSecondHandle = botScheduler.scheduleWithFixedDelay(metalPrSecond,0,5,SECONDS);
    }

    //Getters og setters metoder
    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getMetal() {
        return metal;
    }

    public void setMetal(int metal) {
        this.metal = metal;
    }
}
