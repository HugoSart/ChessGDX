package com.chessdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.chessdx.game.game.Board;
import com.chessdx.game.graphic.Textures;

public class ChessGame extends ApplicationAdapter {

	private Board board;

	private SpriteBatch batch;
	private Texture img;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("chess-grid.png");
		board = new Board();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

		batch.draw(img, 0, 0);
		batch.draw(Textures.MOUSE_HOVER_TEXTURE, (Gdx.input.getX() / 64) * 64, ((8 * 64 - Gdx.input.getY()) / 64) * 64);
		for (int i = 0; i < Board.HEIGHT; i++) {
			for (int j = 0; j < Board.WIDTH; j++) {
				if (board.get(i, j).getPiece() != null) {
					Texture txt = Textures.getPieceTexture(board.get(i, j).getPiece().getClass(), board.get(i, j).getPiece().getColor());
					batch.draw(txt, j * 64, i * 64);
				}
			}
		}

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

}
