package map;

import bozorg.judge.JudgeAbstract;

public class Map {
	Block[][] cells;
	private int mapLength, mapHeight;
	public Map (int[][] cellsType, int[][] wallsType){
		mapHeight = cellsType.length;
		mapLength = cellsType[0].length;
		cells = new Block[mapHeight][mapLength];
		
		for (int i = 0; i < mapHeight; i++)
			for (int j = 0; j < mapLength; j++)
				cells[i][j] = new Block(cellsType[i][j], wallsType[i][j]);
	
	}
	public int getwidth (){
		return mapLength;
	}
	public int getHeight(){
		return mapHeight;
	}
	
	public int getType(int col, int row){
		return cells[row][col].getType();
	}
	public int getWallType(int col, int row){
		return cells[row][col].getWallType();
	}
	
}
