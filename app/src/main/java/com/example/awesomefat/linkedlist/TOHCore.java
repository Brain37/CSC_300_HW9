package com.example.awesomefat.linkedlist;

import java.util.*;

/**
 * Created by awesomefat on 2/23/16.
 */
public class TOHCore
{
    static TowerFragment tower1 = null;
    static TowerFragment tower2 = null;
    static TowerFragment tower3 = null;
    static TowerFragment towerToMoveFrom = null;
    static void toggleTowerButtonsFromPop(TowerFragment sourceTower)
    {
        TowerFragment[] towerCollection = {tower1, tower2, tower3};
        sourceTower.setButtonText("SOURCE");
        for(TowerFragment tower : towerCollection)
        {
            if(tower != sourceTower)
            {
                tower.setButtonText("PUSH");
            }
        }

    }
    static void toggleTowerButtonsFromSource()
    {
        TowerFragment[] towerCollection = {tower1, tower2, tower3};
        for(TowerFragment tower : towerCollection)
        {
                tower.setButtonText("Pop");
        }

    }
    static void toggleTowerButtonsFromPush(TowerFragment sourceTower)
    {
        TOHCore.toggleTowerButtonsFromSource();
        sourceTower.addDisk(4);
        //not sure how to access the size of the disk that needs to be moved.
    }
}
