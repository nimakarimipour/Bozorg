package person;

import bozorg.common.GameObjectID;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nima on 5/6/15.
 */
public class Player {

    playerType type;
    Eye eye;
    ArrayList<Fan> fans = new ArrayList<Fan>();
    HashMap<GameObjectID, Fan> thrownFanHashMap = new HashMap<GameObjectID, Fan>();

    public Player(int id){

        //Kholase

    }

    public void move (int direction){

    }

    public void attack (int direction){

    }

    public GameObjectID throwFan(){
        //TODO addException instead null
        if(fans.size() != 0) {
            Fan thrownFan = fans.get(0);
            fans.remove(0);
            GameObjectID gameObjectID = GameObjectID.create(Fan.class);
            thrownFanHashMap.put(gameObjectID, thrownFan);
            return gameObjectID;
        }
        else return null;
    }

    public void getGift(){}

    public ArrayList<String> getVision(){
        return eye.getVision();

    }

    public ArrayList<Player> getPlayersInVision(){
        return null;
    }
    public boolean blockIsVisible(int col, int row){
    	return false;
    }
}



