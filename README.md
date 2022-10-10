# Navegación I

## Manifest y Permisos

El archivo de manifiesto proporciona información esencial sobre tu aplicación al sistema Android, información que el sistema debe tener para poder ejecutar el código de la app. 

Entre otras cosas, el archivo de manifiesto hace lo siguiente:

* Nombra el paquete que sirve como un **identificador único para la aplicación**.
* Describe los componentes de la aplicación, como las **actividades**, los **servicios**, los receptores de mensajes y los proveedores de contenido que la integran. 
* Declara los **permisos** que debe tener la aplicación para acceder a las partes protegidas de una API e interactuar con otras aplicaciones. También declara los permisos que otros deben tener para interactuar con los componentes de la aplicación. 

Toda la información del manifest: https://developer.android.com/guide/topics/manifest/manifest-intro?hl=es-419

<img src="imgs/manifest.png" alt="manifest file" style="max-width: 100%;max-height: 240px;">

## Activitys & Intents

Cuando creas una aplicación de Android, lo primero que debes hacer es crear una actividad . Las actividades son donde sucede toda la acción, porque son las pantallas que permiten al usuario interactuar con su aplicación.

Los intents nos van a servir para lanzar la cámara, para recibir la imagen de la cámara, lanzar aplicaciones, etc. En nuestro caso lo vamos a usar para crear activitys y lanzarlas. Y también para pasar datos entre ellas. 


<img src="imgs/activitys-and-intents-1.png" alt="activitys and intents" style="max-width: 100%;max-height: 240px;">

**Orden del ciclo de vida del activity**:

* **`onCreate()`**: cuando se crea la actividad por primera vez, aquí es donde se inicializan

<img src="imgs/activitys-and-intents-2.png" alt="activitys and intents" style="max-width: 100%;max-height: 240px;">

Las solicitudes para lanzar nuevas actividades, o recuperar las que no son visibles, se llaman [Intents](https://developer.android.com/reference/android/content/Intent.html) (intentos, solicitudes). 

Un Intent es el responsable de que le lance la primera actividad de una aplicación, y nuevos


* Un ejemplo de uso del `finish()` es cuando nuestra aplicación tiene una splash screen y queremos cerrar la ventana y continuar en la aplicación, sin que cuando le demos "atrás" vuelva a esa pantalla. 


## Navegación

Uno de los primeros pasos para diseñar y desarrollar una aplicación de Android es ***determinar lo que los usuarios pueden ver y hacer con la aplicación***.



**Navegación con Activitys**

¿Cómo crear un Activity?

<img src="imgs/navigation-with-activitys-1.png" alt="navigation with activitys" style="max-width: 100%;max-height: 240px;">

Cuando añadimos un nuevo activity se nos crea:

* Un layout (p. ej.: `activity_login.xml`)
* Modifica el manifest:

```xml
<activity
            android:name=".LoginActivity"
            android:exported="false">
            <meta-data
                android:name="android.app.lib_name"
                android:value="" />
        </activity>
```



**¿Cómo puedo abrir una activity desde otra activity?**

```kotlin
class MainActivity : AppCompatActivity() {
		val intent = Intent(this, Main2Activity::class.java)
```

Hay varias formas de añadir el botón de atrás de una activity, la más sencilla y más rápida es la siguiente:


android:parentActivityName=".NombreDeLaActivityPadre"

```

<img src="imgs/navigation-with-activitys-2.png" alt="navigation with activitys" style="max-width: 100%;max-height: 240px;">


## Pasar datos

¿Cómo puedo enviar datos de una activity a otra?

```kotlin
class MainActivity : AppCompatActivity() {
```

## Recibir datos

¿Cómo puedo leer los datos que vienen de otra activity?

```kotlin
class Main2Activity : AppCompatActivity() {
		Log.v("miapp", "$myUser")
```











