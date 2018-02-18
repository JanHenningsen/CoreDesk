package com.coredesk.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Vector2;

public class DataInput extends Component
{
	private Vector2 movement;
	public DataInput()
	{
		this.movement = new Vector2(0,0);
	}

	@Override
	public void create() 
	{
		
	}
	
	public void update() 
	{
		this.movement.set(0f, 0f);
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
		{
			this.movement.set(-1f, 0f);
		}
		
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
		{
			this.movement.set(1f, 0f);
		}
	}
	
	public Vector2 change()
	{
		return this.movement;
	}
	
	@Override
	public void dispose()
	{
		
	}
}
