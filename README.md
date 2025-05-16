# 🎬 ScreenMatch

Una aplicación Java que consume datos desde una API externa de películas, los transforma usando JSON y GSON, y los guarda localmente. Ideal para aprender a trabajar con APIs REST, manejo de excepciones y persistencia de datos en Java moderno.

---

## 🚀 ¿Qué hace esta aplicación?

ScreenMatch permite al usuario:

✅ Buscar películas mediante una API pública (OMDb API).  
✅ Convertir la respuesta JSON a objetos Java usando `GSON`.  
✅ Manejar errores y excepciones comunes durante la conexión HTTP.  
✅ Guardar los datos obtenidos en un archivo local.  

---

## 🛠️ Tecnologías y herramientas usadas

| Herramienta           | Uso Principal                              |
|------------------------|--------------------------------------------|
| `Java 17+`            | Lenguaje de programación                   |
| `java.net.http`       | Consumo de API REST con `HttpClient`       |
| `GSON` (Google)       | Serialización y deserialización JSON       |
| `Records`             | Modelado de datos de forma inmutable       |
| `FileWriter / Reader` | Escritura y lectura de archivos locales     |
| `IntelliJ IDEA`       | Entorno de desarrollo                      |

---

## 📂 Estructura del Proyecto

![image](https://github.com/user-attachments/assets/baa68603-f087-4748-b657-08e03fc5bde9)


- `modelos/`: contiene los records o clases que representan películas.
- `principal/`: contiene la lógica principal del programa (main).
- `excepciones/`: manejo personalizado de errores y validaciones.

---

## 🎯 Objetivos de Aprendizaje

Este proyecto forma parte de un curso práctico y tiene como metas:

- Aprender a trabajar con APIs externas en Java.
- Usar estructuras modernas como records.
- Implementar manejo de errores robusto.
- Escribir y leer archivos desde el sistema local.
- Aplicar principios básicos de serialización de datos.

---

## 🧪 Ejecución del Proyecto

1. Clona el repositorio:

```bash
git clone https://github.com/gustav0-ri0s/ScreenMatch.git
cd ScreenMatch
```
2. Abre el proyecto en IntelliJ IDEA o tu IDE favorito.
3. Ejecuta la clase PrincipalConBusqueda.java.
4. Ingresa el nombre de una película ¡y observa la magia!

---

## 🧠 Lecciones Aprendidas

- El uso de `HttpClient` es más moderno y seguro que `HttpURLConnection`.
- Los `records` simplifican la creación de clases de datos.
- GSON facilita mucho el manejo de JSON sin necesidad de parseo manual.
- Controlar excepciones correctamente evita bloqueos o cierres inesperados.

---

## 🤝 Autor

**Desarrollado por:** [Gustavo Ríos](https://github.com/gustav0-ri0s)  
📧 **Contacto:** gustav0-ri0s@github


##⭐ ¿Te gustó el proyecto?
¡No olvides dejar una estrella ⭐ en el repositorio si te resultó útil o interesante!


