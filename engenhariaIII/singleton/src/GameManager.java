public class GameManager {

    // Atributos globais do jogo
    private int score;
    private int lives;

    // Instância única do GameManager (Singleton)
    private static GameManager instance;

    // Construtor privado para evitar a criação de instâncias
    private GameManager() {
        score = 0;
        lives = 3;
    }

    // Método para obter a instância única do GameManager
    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    // Métodos para atualizar a pontuação e vidas do jogo
    public void increaseScore(int points) {
        score += points;
    }

    public void decreaseLives() {
        lives--;
    }

    public int getScore() {
        return score;
    }

    public int getLives() {
        return lives;
    }

    public void resetGame() {
        score = 0;
        lives = 3;
    }
}



