package com.coredesk.core;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Render extends Component
{
	SpriteBatch batch;
	Texture img;
	public Render()
	{
		
	}
	
	@Override
	public void create() 
	{
		batch = new SpriteBatch();
		img = new Texture("texture/Stone.png");
	}


	public void update(Vector2 position) 
	{
		Gdx.gl.glClearColor(0.5f, 0.8f, 1f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
		batch.begin();
		batch.draw(img, position.x, position.y);
		batch.end();
	}
	
	@Override
	public void dispose()
	{
		batch.dispose();
		img.dispose();		
	}
}
