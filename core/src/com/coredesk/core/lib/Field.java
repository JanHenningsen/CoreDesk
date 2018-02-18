package com.coredesk.core.lib;

public class Field 
{
	private Tile[][] fieldSize;
	private int width;
	private int height;
	
	public Field(int width, int height)
	{
		this.width = width;
		this.height = height;
		this.fieldSize = new Tile[width][height];
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public Tile[][] getField()
	{
		return this.fieldSize;
	}
	
	public void createClearField()
	{
		for(int i = 0; i<this.width; i++)
		{
			for(int j = 0; j<this.height; j++)
			{
				fieldSize[i][j] = new Tile(false);
			}
		}
	}
}
