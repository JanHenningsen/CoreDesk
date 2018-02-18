package com.coredesk.core;

import com.badlogic.gdx.ApplicationAdapter;

public class CoreDesk extends ApplicationAdapter 
{
	private DataInput datainput;
	private Logic logic;
	private Render render;
		
	@Override
	public void create () 
	{
		datainput = new DataInput();
		logic = new Logic();
		render = new Render();
		
		datainput.create();
		logic.create();
		render.create();
	}
	
	@Override
	public void resize (int width, int height) 
	{
	}
	
	@Override
	public void pause () 
	{
	}

	@Override
	public void resume () 
	{
	}

	@Override
	public void render () 
	{
		datainput.update();
		logic.update(datainput.change());
		render.update(logic.change());
	}
	
	@Override
	public void dispose () 
	{
		datainput.dispose();
		logic.dispose();
		render.dispose();
	}
}
