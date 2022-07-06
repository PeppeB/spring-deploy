
## Despliegue de apps Spring Boot en Heroku

Crear archivo `system.properties` en el proyecto con el comando:

```properties
java.runtime.version = 17
```

1. Crear cuenta en heroku.com y github.com
2. Tener configurado git en el ordenador (ejecutar únicamente la primera vez que se instala Git):
    1. `git config --global user.name "myUserName"`
    2. `git config --global user.email myEmail`
3. Subir el proyecto a Github desde IntelliJ IDEA desde la opcíon: VCS > Share project on GitHub
4. Desde Heroku crear app, elegir metodo GitHub y buscar el repositorio subido
5. Habilitar deploy automatico y ejecutar el Deploy