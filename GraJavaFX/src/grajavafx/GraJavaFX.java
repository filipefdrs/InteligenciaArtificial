/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grajavafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author filipereis and Daniel Liang
 */
public class GraJavaFX extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    City[] vertices = { new City("Rio Branco", 180 , 275),
        new City("Manaus", 250, 200),
        new City("Boa Vista", 230, 75),
        new City("Macapá", 280, 110),
        new City("Belém", 350, 130),
        new City("Palmas", 400, 250),
        new City("São Luís", 500, 150),
        new City("Teresina", 530, 175),
        new City("Fortaleza", 600, 160),
        new City("Natal", 655, 165),
        new City("João Pessoa", 675, 185),
        new City("Recife", 675, 215) };
    
    // Edge array for graph in Figure 28.1
    int[][] edges = {
      {0, 1}, {0, 3}, {0, 5}, {1, 0}, {1, 2}, {1, 3},
      {2, 1}, {2, 3}, {2, 4}, {2, 10},
      {3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
      {4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
      {5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
      {6, 5}, {6, 7}, {7, 4}, {7, 5}, {7, 6}, {7, 8},
      {8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
      {9, 8}, {9, 11}, {10, 2}, {10, 4}, {10, 8}, {10, 11},
      {11, 8}, {11, 9}, {11, 10}
    };

    Graph<City> graph = new UnweightedGraph<>(vertices, edges);

    // Create a scene and place it in the stage
    Scene scene = new Scene(new GraphView(graph), 750, 450);
    primaryStage.setTitle("DisplayBrazilianCapitals\'Map"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    primaryStage.centerOnScreen(); // Centering, the primary stage, on screen
  }
  
  static class City implements Displayable {
    private int x, y;
    private String name;
    
    City(String name, int x, int y) {
      this.name = name;
      this.x = x;
      this.y = y;
    }
    
    @Override 
    public int getX() {
      return x;
    }
    
    @Override 
    public int getY() {
      return y;
    }
    
    @Override 
    public String getName() {
      return name;
    }
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

/*
new City("Maceió", , ),
new City("Aracaju", , ),
new City("Salvador", , ),
new City("Brasília", , ),
new City("Belo Horizonte", , ),
new City("Vitória", , ),
new City("Rio de janeiro", , ),
new City("São Paulo", , ),
new City("Porto Velho", , ),
new City("Cuiabá", , ),
new City("Goiânia", , ),
new City("Campo Grande", , ),
new City("Curitiba", , ),
new City("Florianópolis", , ),
new City("Porto Alegre", , )
*/