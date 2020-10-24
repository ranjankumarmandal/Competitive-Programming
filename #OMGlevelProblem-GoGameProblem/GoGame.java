package Problems;

import java.util.LinkedList;

class Location {

	int x;

	int y;

	Location(int i, int j) {

		x = i;

		y = j;

	}

}

public class GoGame{

	final static int E = 0;

	final static int B = 1;

	final static int W = 2;

	private static boolean isCaptured_DF(int board[][], int x, int y) {

		boolean visited[][] = new boolean[board.length][board[0].length];

		return isCaptured_DF(board, x, y, visited);

	}

	private static boolean isFree_DF(int board[][], int x, int y) {

		boolean visited[][] = new boolean[board.length][board[0].length];

		return isFree_DF(board, x, y, visited);

	}

	private static boolean isEmpty(int board[][], int x, int y) {

		if (board[x][y] == E)
			return true;

		return false;

	}

	private static boolean isBlack(int board[][], int x, int y) {

		if (board[x][y] == B)
			return true;

		return false;

	}

	private static boolean isWhite(int board[][], int x, int y) {

		if (board[x][y] == W)
			return true;

		return false;

	}

	private static boolean isCaptured_DF(int board[][], int x, int y, boolean visited[][]) {

		if (isEmpty(board, x, y))
			return false;

		if (isWhite(board, x, y) || visited[x][y])
			return true;

		// mark this piece visited to break infinite recursion

		visited[x][y] = true;

		// left

		if (y > 0 && !isCaptured_DF(board, x, y - 1, visited))
			return false;

		// right

		if (y < board[0].length - 1 && !isCaptured_DF(board, x, y + 1, visited))
			return false;

		// top

		if (x > 0 && !isCaptured_DF(board, x - 1, y, visited))
			return false;

		// down

		if (x < board.length - 1 && !isCaptured_DF(board, x + 1, y, visited))
			return false;

		return true;

	}

	private static boolean isFree_DF(int board[][], int x, int y, boolean visited[][]) {

		if (isEmpty(board, x, y))
			return true;

		if (isWhite(board, x, y) || visited[x][y])
			return false;

		// mark this piece visited to break infinite recursion

		visited[x][y] = true;

		// left

		if (y > 0 && isFree_DF(board, x, y - 1, visited))
			return true;

		// right

		if (y < board[0].length - 1 && isFree_DF(board, x, y + 1, visited))
			return true;

		// top

		if (x > 0 && isFree_DF(board, x - 1, y, visited))
			return true;

		// down

		if (x < board.length - 1 && isFree_DF(board, x + 1, y, visited))
			return true;

		return false;

	}

	private static void addToQAndMarkVisited(LinkedList<Location> Q, boolean visited[][], int x, int y) {

		Q.add(new Location(x, y));

		visited[x][y] = true;

	}

	private static boolean isNeighborEmpty(int board[][], int x, int y, LinkedList<Location> Q, boolean visited[][]) {

		if (isEmpty(board, x, y))
			return true;

		if (isBlack(board, x, y) && !visited[x][y])
			addToQAndMarkVisited(Q, visited, x, y);

		return false;

	}

	private static boolean isCaptured_BF(int board[][], int x, int y) {

		LinkedList<Location> Q = new LinkedList<Location>();

		boolean visited[][] = new boolean[board.length][board[0].length];

		addToQAndMarkVisited(Q, visited, x, y);

		while (!Q.isEmpty()) {

			Location t = Q.remove();

			// left

			if (t.y > 0 && isNeighborEmpty(board, t.x, t.y - 1, Q, visited))
				return false;

			// right

			if (t.y < board[0].length - 1 && isNeighborEmpty(board, t.x, t.y + 1, Q, visited))
				return false;

			// top

			if (t.x > 0 && isNeighborEmpty(board, t.x - 1, t.y, Q, visited))
				return false;

			// down

			if (t.x < board.length - 1 && isNeighborEmpty(board, t.x + 1, t.y, Q, visited))
				return false;

		}

		return true;

	}

	public static void main(String[] args) {

		int board[][] = {

				{ B, B, E, W },

				{ W, W, B, W },

				{ B, W, W, B },

				{ W, W, B, B },

				{ E, B, W, B },

		};

		// Depth First

		System.out.println("Depth First");

		System.out.println("===========");

		for (int i = 0; i < board.length; i++)

			for (int j = 0; j < board[0].length; j++)

				if (board[i][j] == B)

					System.out.println(i + " " + j + " " + (isCaptured_DF(board, i, j) ? "Captured" : "Free"));

		System.out.println("\nBreadth First");

		System.out.println("=============");

		for (int i = 0; i < board.length; i++)

			for (int j = 0; j < board[0].length; j++)

				if (board[i][j] == B)

					System.out.println(i + " " + j + " " + (isCaptured_BF(board, i, j) ? "Captured" : "Free"));

	}

}
