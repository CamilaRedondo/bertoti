<h2> Strategy, Observer e Composite </h2>
<p align="center"> Diagrama UML </p>

![Diagrama UML](/engenhariaIII/strategyObserverComposit/diagramaUml.png)

<h3>Design Pattern Strategy:</h3>

<p>O padrão Strategy envolve definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. No exemplo dado, temos `CuidadoAnimalController` como uma interface estratégica, e as classes `AlimentarController` e `CuidadosVeterinariosController` como implementações específicas. Isso representa claramente o padrão Strategy, onde diferentes estratégias (`CuidadoAnimalController`) podem ser selecionadas e usadas no contexto do zoológico.</p>

<h3>Design Pattern Observer:</h3>

<p>O padrão Observer é utilizado para criar uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. No exemplo, temos `SetorVisitantesView` como uma interface observadora, e a classe `SetorVisitantesViewImpl` como uma implementação específica. Além disso, no `ZoológicoController`, quando um cuidado é realizado, ele notifica automaticamente todas as `SetorVisitantesView`. Isso representa o padrão Observer, pois há uma relação de dependência entre os observadores e o objeto observado.</p>

<h3>Design Pattern Composite:</h3>

<p>O padrão Composite é utilizado para tratar objetos individuais e composições de objetos de maneira uniforme. No exemplo, a estrutura do zoológico, com `ZoológicoModel` contendo uma lista de `Animal`, representa uma forma de composição. Pode-se argumentar que o `ZoológicoModel` age como um componente, e os `Animal` são as folhas dessa estrutura.</p>

