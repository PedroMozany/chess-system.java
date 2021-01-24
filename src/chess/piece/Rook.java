package chess.piece;

import boardgame.Board;
import chess.Color;
import chess.chessPiece;

public class Rook extends chessPiece {

	public Rook(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return " R ";

	}
}
