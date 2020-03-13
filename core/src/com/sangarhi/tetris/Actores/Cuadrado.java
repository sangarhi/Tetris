package com.sangarhi.tetris.Actores;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.awt.Rectangle;

public class Cuadrado extends Actor {

    private ShapeRenderer renderer;

    private Rectangle rectangle;

    public Cuadrado(int x,int y){
        rectangle = new Rectangle();
        rectangle.x = x;
        rectangle.y = y;
        rectangle.width = 64;
        rectangle.height = 64;

        renderer = new ShapeRenderer();
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);

        batch.draw();
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    public void drawShapeRender(Batch batch){
        batch.end();
        renderer.setProjectionMatrix(batch.getProjectionMatrix());
        renderer.setTransformMatrix(batch.getTransformMatrix());
        renderer.translate(rectangle.x, rectangle.y,0);
        renderer.begin(ShapeRenderer.ShapeType.Filled);
        renderer.setColor(Color.BROWN);
    }
}
