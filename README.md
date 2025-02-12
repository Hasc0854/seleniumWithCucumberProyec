# Proyecto de Automatización con Selenium, Cucumber y Java

Este proyecto implementa pruebas automatizadas utilizando Selenium WebDriver, Cucumber y Java.

## Estructura del Proyecto

```
project-root/
│-- src/
│   ├── test/
│   │   ├── java/          # Contiene el código fuente de las pruebas
│   │   │   ├── pages/     # Clases de páginas (Page Object Model)
│   │   │   ├── steps/     # Definiciones de pasos de Cucumber
│   │   │   ├── runner/    # Clases Runner para ejecutar las pruebas
│   │   ├── resources/     # Contiene los archivos .feature de Cucumber
│   │   │   ├── features/  # Archivos con escenarios de prueba
│   │   │   ├── config/    # Archivos de configuración
│-- pom.xml o build.gradle # Archivo de dependencias (Maven o Gradle)
```

## Requisitos Previos

Antes de ejecutar el proyecto, asegúrese de tener instalado:
- [Java JDK 11 o superior](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/) o [Gradle](https://gradle.org/)
- [ChromeDriver](https://sites.google.com/chromium.org/driver/)

## Instalación

1. Clonar el repositorio:
   ```sh
   git clone git@github.com:Hasc0854/seleniumWithCucumberProyec.git
   cd proyecto-automatizacion
   ```

2. Instalar dependencias (Maven o Gradle):
   ```sh
   mvn clean install
   ```
   o
   ```sh
   gradle build
   ```

## Ejecución de Pruebas

### Ejecutar pruebas con Maven
```sh
mvn test
```

### Ejecutar pruebas con Gradle
```sh
gradle test
```

### Ejecutar un feature específico
```sh
mvn test -Dcucumber.options="src/test/resources/features/login.feature"
```

## Reportes
Tras ejecutar las pruebas, se generará un reporte en:
```
target/cucumber-reports/index.html (para Maven)
build/reports/cucumber/index.html (para Gradle)
```
Abra el archivo en un navegador para visualizar los resultados.

## Contribución
Si desea contribuir a este proyecto:
1. Realizar un fork del repositorio.
2. Crear una rama con su funcionalidad (`git checkout -b nueva-funcionalidad`).
3. Enviar un pull request.

## Licencia
Este proyecto está bajo la licencia MIT.

