package com.coredesk.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class Logic extends Component
{
	private Vector2 speed;
	private Vector2 position;
	
	public Logic()
	{
		this.speed = new Vector2(50f,50f);
		this.position = new Vector2(0f,0f);
	}
	
	@Override
	public void create() 
	{
		
	}

	public void update(Vector2 vec) 
	{
		float delta = Gdx.graphics.getDeltaTime();
		float changeX = this.speed.x * vec.x;
		float changeY = this.speed.y * vec.y;
		this.position.add(changeX*delta,changeY*delta);
	}
	
	public Vector2 change()
	{
		return this.position;
	}
	
	@Override
	public void dispose()
	{
		
	}
}
