## Automatización de Chatbot LuloX

Este proyecto consiste en la automatización de la interacción con el chatbot de la página web de [luloX](https://lulox.co/). Utilizando Serenity BDD Screenplay con Cucumber, se ha creado un script para navegar a la página principal de luloX, identificar y abrir el chat, e interactuar con él.

### Tecnologías Utilizadas

*   **Java 17 o superior:** Se requiere Java 17 o una versión más reciente para la ejecución del proyecto.

*   **Gradle:** Se utiliza Gradle como sistema de gestión de dependencias y construcción del proyecto. Esto facilita la gestión de las librerías necesarias y la compilación del código.

*   **Serenity BDD Screenplay 4 o superior:**  Serenity BDD Screenplay se emplea como framework de automatización. Su patrón Screenplay permite escribir pruebas automatizadas de manera clara y mantenible, enfocándose en las acciones que realizan los actores en la aplicación.

*   **Serenity BDD Screenplay Webdriver 4 o superior:**  Extensión de Serenity BDD para la automatización de interfaces web utilizando WebDriver. Proporciona funcionalidades adicionales para interactuar con navegadores y elementos web de forma sencilla.

*   **Cucumber 4 o superior con Serenity BDD:** Cucumber se utiliza para definir las pruebas en lenguaje natural (Gherkin), facilitando la colaboración entre stakeholders técnicos y no técnicos. Se integra con Serenity BDD para la ejecución y generación de reportes detallados de las pruebas.

### Frontend Automatizado: Página Web de LuloX

El objetivo principal de la automatización es interactuar con el chatbot disponible en la página web de [luloX](https://lulox.co/). El script simula la interacción de un usuario real con el chat, siguiendo los siguientes pasos:

1.  **Ingreso a la página de luloX:** El script inicia navegando a la URL [https://lulox.co/](https://lulox.co/) utilizando un navegador web automatizado.

2.  **Localización del Chatbot:**  Una vez cargada la página, el script identifica el icono del chatbot que se encuentra en la parte inferior derecha de la pantalla.  Este icono generalmente es visible y accesible para iniciar una conversación.

3.  **Interacción con el Chatbot:** Tras encontrar el icono, el script simula un clic para abrir la ventana del chat. Una vez abierto, se pueden simular interacciones dentro del chat, como enviar mensajes (aunque este caso puntual solo se enfoca en abrir el chat según la descripción proporcionada).

### Evidencia de Automatización

Se proporciona un video como evidencia de la ejecución exitosa de la automatización. En este video se puede observar el script en funcionamiento, realizando los pasos descritos anteriormente: navegando a la página de luloX, localizando el icono del chat en la parte inferior derecha y abriendo la ventana de conversación del chatbot.
