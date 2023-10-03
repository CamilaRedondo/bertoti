public class Main {
        public static void main(String[] args) {
            // Obtendo a instância do GameManager
            GameManager gameManager = GameManager.getInstance();

            // Acessando e atualizando os atributos globais do jogo
            System.out.println("Score: " + gameManager.getScore());
            System.out.println("Lives: " + gameManager.getLives());

            gameManager.increaseScore(100);
            gameManager.decreaseLives();

            System.out.println("Score: " + gameManager.getScore());
            System.out.println("Lives: " + gameManager.getLives());

            // Reiniciando o jogo
            gameManager.resetGame();
            System.out.println("Score after reset: " + gameManager.getScore());
            System.out.println("Lives after reset: " + gameManager.getLives());
        }
}
