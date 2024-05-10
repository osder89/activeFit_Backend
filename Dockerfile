# Usa OpenJDK 8 como imagen base
FROM openjdk:8-jdk-alpine

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR empaquetado de la aplicación Spring Boot al contenedor
COPY target/active_fit_back-0.0.1-SNAPSHOT.jar /app/app.jar

# Expone el puerto en el que se ejecutará la aplicación Spring Boot
EXPOSE 4545

# Especifica el comando para ejecutar tu aplicación Spring Boot
CMD ["java", "-jar", "app.jar"]
