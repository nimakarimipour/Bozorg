/**
 * Created by nima on 5/6/15.
 */
import bozorg.common.GameObjectID;
import bozorg.common.exceptions.BozorgExceptionBase;
import bozorg.judge.JudgeAbstract;
import map.Map;
import person.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class Game extends JudgeAbstract {


    HashMap<GameObjectID, Player> playerHashMap = new HashMap<GameObjectID, Player>();

    public ArrayList<GameObjectID> loadMap(int[][] cellsType, int[][] wallsType, int[] players){

        Map map = new Map(cellsType, wallsType, players);
        return createGameObjectId(players, new ArrayList<GameObjectID>());
    }

    //Overload
    private ArrayList<GameObjectID> createGameObjectId(int[] players, ArrayList<GameObjectID> gameObjectIDs){
        for(int i : players){
            Player p = new Player(i);
            GameObjectID gameObjectID = GameObjectID.create(Player.class);
            playerHashMap.put(gameObjectID, p);
            gameObjectIDs.add(gameObjectID);
        }
        return gameObjectIDs;
    }

    private ArrayList<GameObjectID> createGameObjectId(ArrayList<Player> players){
        ArrayList<GameObjectID> gameObjectIDs = new ArrayList<GameObjectID>();
        for(Player p : players){
            //TODO find key from value !!
            //TODO gameObjectId.add(player);
        }
        return gameObjectIDs;
    }

    private ArrayList<GameObjectID> createGameObjectId(Player player){
        //TODO Complete the list check how to find key from value !!!
        return null;
    }




    public int getMapWidth(){
        return 0;
    }

    public int getMapHeight(){
        return 0;
    }

    public int getMapCellType(int col, int row){
        return 0;
    }

    public int getMapCellType(int col, int row, GameObjectID player){
        return 0;
    }

    public int getMapWallType(int col, int row){
        return 0;
    }

    public int getMapWallType(int col, int row ,GameObjectID player){
        return 0;
    }


    public void setup(){
        //TODO what ever we need to do before game
    }


    public void movePlayer(GameObjectID player, int direction)
            throws BozorgExceptionBase{
        Player realPlayer = playerHashMap.get(player);
        realPlayer.move(direction);
    }

    public void attack(GameObjectID attacker, int direction)
            throws BozorgExceptionBase{
        Player realPlayer = playerHashMap.get(attacker);
        realPlayer.attack(direction);
    }

    public GameObjectID throwFan(GameObjectID player)
            throws BozorgExceptionBase{
        Player realPlayer = playerHashMap.get(player);
        return realPlayer.throwFan();
    }

    public void getGift(GameObjectID player)
            throws BozorgExceptionBase{
        Player realPlayer = playerHashMap.get(player);
        realPlayer.getGift();

    }

    // AI functions. these functions will never be used in judge
    public void AIByStudents(GameObjectID player){
        //TODO is for next phase of the project

    }

    public void AIByTAs(GameObjectID player) {
        // TODO
    };

    public ArrayList<GameObjectID> getEveryThing(){
        return null;
    } // will never be
    // used in judge

    public ArrayList<String> getVision(GameObjectID player)
            throws BozorgExceptionBase{
        Player realPlayer = playerHashMap.get(player);
        return realPlayer.getVision();
    }

    public ArrayList<GameObjectID> getPlayersInVision(
            GameObjectID player){
        Player realPlayer = playerHashMap.get(player);
        return createGameObjectId(realPlayer.getPlayersInVision());
    }

    public ArrayList<GameObjectID> getFans(GameObjectID player)
            throws BozorgExceptionBase{
        Player realPlayer = playerHashMap.get(player);
        return createGameObjectId(realPlayer);
    }

    public  HashMap<String, Integer> getInfo(GameObjectID id)
            throws BozorgExceptionBase{
        //TODO i handle this myself using enum :)))
        return null;
    }

    // Controller functions
    public  void next50milis(){

    }

    public  void startTimer(){

    }// will never be used in judge

    public  void pauseTimer(){

    }

    public float getTime(){
        return 0;
    }

    // Judge cheat functions
    public  void updateInfo(GameObjectID id, String infoKey,
                                    Integer infoValue) throws BozorgExceptionBase{

    }




}
