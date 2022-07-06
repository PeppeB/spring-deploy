
## Despliegue de apps Spring Boot en Heroku

Crear archivo `system.properties` en el proyecto con el comando:

```properties
java.runtime.version = 17
```

1. Crear cuenta en heroku.com y github.com
2. Tener configurado git en el ordenador
    1. `git config --global user.name "Giuseppe Bruno"`
    2. `git config --global user.email brpepper@gmail.com`
3. Subir el proyecto a Github desde IntelliJ IDEA desde la opcíon: VCS > Share project on GitHub
4. Desde Heroku crear app y elegir metodo GitHub y buscar el repositorio subido
5. Habilitar deploy automatico y ejecutar el Deploy