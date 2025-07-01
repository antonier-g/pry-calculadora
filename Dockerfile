# Usa una imagen oficial de OpenJDK 17
FROM openjdk:17-jdk-slim

# Crea un directorio para la app
WORKDIR /app

# Copia el jar generado por Maven
COPY target/*.jar app.jar

# Expone el puerto
EXPOSE 7777

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
