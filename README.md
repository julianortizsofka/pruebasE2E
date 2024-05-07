# Pruebas E2E

**Fecha Inicio** : Q2 2024

**Participantes**:


Analista de automatización: Julian Alejandro Ortiz Medina - <julian.ortiz@sofka.com.co>



****

# Integración de casos prueba de la automatización en Azure

## Introducción
Se presenta un prueba de automatización de pruebas de E2E, por medio de Serenity BDD, a la aplicación saucedemo, con el patron Screenplay y usando Gradle.

## Enfoque de integración
La automatización se centra en un flujo E2E, enfocandose en el flujo:
1. Abrir la pagina.
2. Autenticarse con credenciales correctas.
3. Agregar dos productos fijos, si se tuviera más tiempo se puede automatizar para que sean dos productos aleatorios.
4. Ingresar y comprobar que estoy en el carrito de compras
5. Completar la información necesaria y finalizar la compra
6. Verificar que se visualiza la thank you page, implicando un flujo correcto.

## Herramientas y tecnologías

| Herramienta/Tecnología | Descripción                                                                                      | Versión Utilizada |
|------------------------|--------------------------------------------------------------------------------------------------|-------------------|
| Java                   | Lenguaje de programación para escribir los scripts de prueba.                | 17                |
| Serenity BDD           |  Framework de código abierto para pruebas automatizadas en Java, con soporte para BDD.        | 3.6.23            | 
| Gradle                 | Herramienta de automatización de construcción, utilizada para compilar, probar y desplegar el código. | 8.7               |
| IntelliJ IDEA          | Entorno de desarrollo integrado (IDE) para el desarrollo de software.                            | Última versión    |

## PASOS PARA LA EJECUCIÓN




### PASO A PASO PARA LA EJECUCIÓN POR CONSOLA

### Comando para limpiar el proyecto y luego ejecuta TODOS los escenarios uno por uno
#### ./gradlew clean test

### Comando para ejecutar por feature
#### ./gradlew test --tests "com.saucedemo.runners.PruebaE2ERunner"


### Comando para generar reporte despues que haya terminado un test (Por consola arrojara la ruta .html )
#### ./gradlew reports

### Comando para limpiar la carpeta Target (Reportes)
#### ./gradlew clearReports

También puede ejecutarse individualmente con cada escenario con el runner correspondiente


##  Hallazgos y conclusiones

La página de saucedemo para hacer pruebas E2E permite mapear fácilmente los elementos de la página, también tiene buenas practicas de accesibilidad.

Serenity BDD es un framework que permite pruebas en Frontend y en Backend, podría permitir un flujo completo y comprobar que los productos, precios y cantidades seleccionadas en la prueba sean los que llegaron a los microservicios de Backend.

Se configuró la automatización con Microsoft Edge, debido a que al estar integrado con Windows 11, los tiempos de ejecución son menores que con Chrome, adicionalmente siempre suele estar actualizado con el sistema operativo y al se un navegador basado en Chromiun el mapeo y visualización de como se cargan los elementos en el POM es idéntica a Chrome que es el navegador más usado en el mercado.

