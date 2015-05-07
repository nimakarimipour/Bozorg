package map;

import bozorg.judge.JudgeAbstract;

public class Block {

	private int type;
	private int wallType;
	
	public Block(int cellType, int wallType) {
		type = cellType;
		this.wallType = wallType;
	}
	
	public int getType(){
		return type;
	}

	public int getWallType() {
		return wallType;
	}
	
}
