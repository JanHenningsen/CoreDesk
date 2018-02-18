package com.coredesk.core.lib;

public class Tile 
{
	private boolean isOccupied;
	
	public Tile(boolean isOccupied)
	{
		this.isOccupied = isOccupied;
	}
	
	public void setOccupied(boolean isOccupied)
	{
		this.isOccupied = isOccupied;
	}
	
	public boolean getOccupied()
	{
		return this.isOccupied;
	}
}
