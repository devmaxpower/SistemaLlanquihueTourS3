![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Sumativa 3 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto

- **Nombre completo:** Maximiliano Villalobos
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Virtual

---

# 📘 Descripción general del sistema

Este proyecto corresponde a la **Evaluación Sumativa III** de la asignatura **Desarrollo Orientado a Objetos I**.

El sistema representa distintas entidades pertenecientes a la agencia de turismo **Llanquihue Tour**, integrando los principales conceptos desarrollados durante la tercera experiencia de aprendizaje de la asignatura.

La aplicación fue desarrollada en Java utilizando una arquitectura modular organizada por paquetes, aplicando principios de Programación Orientada a Objetos como encapsulamiento, herencia, polimorfismo e interfaces.

Para facilitar la administración de la información, el sistema incorpora una interfaz común denominada **Registrable**, la cual permite que distintas entidades del sistema compartan un mismo comportamiento, aun cuando pertenezcan a jerarquías diferentes.

Los objetos son almacenados en una colección dinámica utilizando `ArrayList<Registrable>`, lo que permite recorrerlos de manera polimórfica e identificar su tipo específico mediante el operador `instanceof` cuando es necesario aplicar una lógica diferenciada.

Finalmente, la aplicación incorpora una interfaz gráfica básica desarrollada mediante **JOptionPane**, permitiendo registrar nuevas entidades y visualizar la información ingresada sin necesidad de utilizar la consola.

---

## 🧱 Estructura general del proyecto

```plaintext
LlanquihueTourApp
├── dist
│   └── LlanquihueTourApp.jar
├── docs
│   └── index.html
├── src
│   ├── data
│   │   └── GestorEntidades.java
│   ├── model
│   │   ├── ColaboradorExterno.java
│   │   ├── GuiaTuristico.java
│   │   ├── Persona.java
│   │   ├── Registrable.java
│   │   └── Vehiculo.java
│   └── ui
│       └── LlanquihueTourApp.java
├── .gitignore
└── README.md
```

## 📂 Paquete `model`

Contiene las entidades principales del sistema.

- `Registrable`
- `Persona`
- `GuiaTuristico`
- `ColaboradorExterno`
- `Vehiculo`

### Registrable

Interfaz que define el contrato común para todas las entidades gestionables mediante el método:

```java
mostrarResumen()
```

### Persona

Clase base que encapsula los atributos comunes:

- nombre
- correo
- edad

Sirve como superclase para las personas que participan en la agencia.

### GuiaTuristico

Subclase de `Persona`.

Representa a un guía turístico, incorporando información adicional como:

- idioma
- años de experiencia

Implementa la interfaz `Registrable`.

### ColaboradorExterno

Subclase de `Persona`.

Representa colaboradores pertenecientes a empresas externas.

Implementa la interfaz `Registrable`.

### Vehiculo

Representa los vehículos utilizados por la agencia.

Aunque no hereda de `Persona`, implementa la interfaz `Registrable`, permitiendo ser tratado igual que las demás entidades dentro de la colección.

---

## 📂 Paquete `data`

Contiene la lógica encargada de administrar las entidades del sistema.

### GestorEntidades

Gestiona una colección genérica de tipo:

```java
ArrayList<Registrable>
```

Sus responsabilidades principales son:

- agregar entidades;
- recorrer la colección;
- mostrar los resúmenes;
- identificar el tipo real de cada objeto mediante `instanceof`.

---

## 📂 Paquete `ui`

Contiene la interfaz gráfica del sistema.

### LlanquihueTourApp

Clase principal de la aplicación.

Contiene el método `main()` y presenta un menú desarrollado mediante `JOptionPane`, permitiendo:

- registrar guías turísticos;
- registrar vehículos;
- registrar colaboradores externos;
- visualizar todas las entidades almacenadas.

---

# 🔗 Relación entre clases

```plaintext
                    Registrable
                   /     |      \
                  /      |       \
                 /       |        \
                ▼        ▼         ▼
      GuiaTuristico   Vehiculo   ColaboradorExterno
             ▲                       ▲
             │                       │
             └──────── Persona ──────┘
```

La interfaz `Registrable` permite que clases distintas compartan un comportamiento común.

La clase `Persona` funciona como superclase para las entidades relacionadas con personas, mientras que `Vehiculo` implementa directamente la interfaz sin formar parte de la jerarquía de herencia.

---

# 🔗 Flujo de funcionamiento

```plaintext
JOptionPane
      │
      ▼
Creación de objetos
      │
      ▼
ArrayList<Registrable>
      │
      ▼
GestorEntidades
      │
      ▼
mostrarResumen()
      │
      ▼
instanceof
      │
      ▼
Visualización en pantalla
```

El usuario ingresa información mediante una interfaz gráfica.

Cada registro genera un objeto correspondiente, el cual es almacenado dentro de una colección polimórfica.

Posteriormente, el gestor recorre la colección, ejecuta el método `mostrarResumen()` de cada objeto e identifica su tipo mediante `instanceof` cuando corresponde.

---

# ⚙️ Funcionalidades implementadas

- Encapsulamiento mediante atributos privados y métodos de acceso.
- Herencia utilizando `extends`.
- Reutilización de constructores mediante `super`.
- Implementación de interfaces mediante `implements`.
- Polimorfismo mediante una colección `ArrayList<Registrable>`.
- Sobrescritura del método `mostrarResumen()`.
- Validación del tipo real utilizando `instanceof`.
- Gestión de entidades mediante una colección dinámica.
- Interfaz gráfica utilizando `JOptionPane`.
- Documentación completa utilizando JavaDoc.

---

# ⚙️ Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub
- JavaDoc
- JOptionPane

---

# ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/devmaxpower/LlanquihueTourApp.git
```

2. Abre el proyecto utilizando IntelliJ IDEA.

3. Verifica que el proyecto tenga configurado un JDK compatible.

4. Ejecuta la clase:

```text
src/ui/LlanquihueTourApp.java
```

5. Selecciona las opciones del menú para:

- Registrar un guía turístico.
- Registrar un vehículo.
- Registrar un colaborador externo.
- Mostrar las entidades registradas.

---

# 📑 Documentación

El proyecto incorpora documentación mediante **JavaDoc** para:

- clases;
- interfaces;
- constructores;
- métodos públicos.

---

**Repositorio GitHub:**

https://github.com/devmaxpower/LlanquihueTourApp

**Fecha de entrega:**

Julio 2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa III
