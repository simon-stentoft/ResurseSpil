import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Resurser {
    int wood = 0;
    int gold = 0;
    int minerals = 0;

    public void updateWood() {
        final ScheduledExecutorService botScheduler = Executors.newScheduledThreadPool(1);
        final Runnable updateWoodPrSecond = new Runnable() {
            @Override
            public void run() {
                System.out.println("Amount of Wood: "+ wood);
            }
        };
        final ScheduledFuture<?> updateWoodPrSecondHandle = botScheduler.scheduleWithFixedDelay(updateWoodPrSecond,0,1,SECONDS);
    }

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

    public int getMinerals() {
        return minerals;
    }

    public void setMinerals(int minerals) {
        this.minerals = minerals;
    }
}
